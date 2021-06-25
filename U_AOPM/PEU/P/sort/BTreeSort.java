package PEU.P.sort;
public class BTreeSort
{
	public Leaf root;
	public Leaf heap;
	int c;
	int a1[];
	public int[] sort(int [] a) {
		//make tree
		c=0;
		a1=new int[a.length];
		if(root==null){
			root=new Leaf();
			root.value[0]=a[0];
			root.hasO1=1;
		}
		for(int i=1;i<a.length;i++){
			heap=root;
			I_leaf(a[i]);
		}
		heap=root;
		Q_(heap);
		return a1;
	}
	private void Q_(Leaf temp) {
		// TODO Auto-generated method stub
		if(temp!=null){
			Q_(temp.O1);
			a1[c]=temp.value[0];
			c+=1;
			Q_(temp.O2);
		}	
	}
	private void I_leaf(int i) {
		if(i<=heap.value[0]){
			if(heap.O1==null){
				heap.O1=new Leaf();
				heap=heap.O1;
				heap.value[0]=i;
				root.hasO1=1;
				return;
			}
			else{
				heap=heap.O1;
				I_leaf(i);
			}
		}
		else{
			if(heap.O2==null){
				heap.O2=new Leaf();
				heap=heap.O2;
				heap.value[0]=i;
				root.hasO1=1;
				return;
			}else{
				heap=heap.O2;
				I_leaf(i);
			}	
		}	 
	}
	public Leaf root(int[] a) {
		if(root==null){
			root=new Leaf();
			root.value[0]=a[0];
			root.hasO1=1;
		}for(int i=1;i<a.length;i++){
			heap=root;
			I_leaf(a[i]);
		}
		// TODO Auto-generated method stub
		return root;
	}
}