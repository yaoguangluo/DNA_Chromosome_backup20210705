package ESU.sort;
import OEU.LYG4DQS4D.Quick_7D_luoyaoguang_Sort;
//作者 罗瑶光
public class Quick9DLYGWithString_ESU extends Quick_7D_luoyaoguang_Sort{
	public int[] sort(int[]a, String[]sa) {
		processDouble(a, 0, a.length - 1, sa, 0);
		return a;
	}

	private void processDouble(int[] array, int leftPoint, int rightPoint, String[] sa, int deep) {
		int c= rightPoint- leftPoint+ 1;
		if(!(c< 7|| deep> 70)) {//增加了deep
			int pos= partition(array, leftPoint, rightPoint, sa);
			if(leftPoint< pos- 1) {
				processDouble(array, leftPoint, pos- 1, sa, deep+ 1);
			}
			if(pos+ 1< rightPoint) {
				processDouble(array, pos+ 1, rightPoint, sa, deep+ 1);
			}
			return;
		}
		int i= leftPoint;
		for(int j= i+ 1; j< leftPoint+ c; j= i++){
			while(j> leftPoint){
				if(array[j]< array[--j]){
					int temp = array[j+ 1];
					array[j+ 1] = array[j];
					array[j] = temp;
					String stemp= new String(sa[j+ 1].toString());
					sa[j+ 1] = sa[j].toString();
					sa[j] = stemp.toString();
				}
			}
		}	
	}
	//换了最新第四代TopSort 思想， 罗瑶光
	//莫急，稍后我会同样用map 把这里的同int数 进行过滤掉。 罗瑶光20210722	
	private int partition(int[] array, int leftPoint, int rightPoint, String[] sa) {
		int x= array[leftPoint]< array[rightPoint]? array[leftPoint]: array[rightPoint];
		String xString= array[leftPoint]< array[rightPoint]? sa[leftPoint].toString(): sa[rightPoint].toString();
		int leftPointReflection= leftPoint;
		while(leftPointReflection < rightPoint){
			while(!(array[leftPointReflection]> x|| leftPointReflection++ >= rightPoint)) {}
			while(array[rightPoint--]> x) {}
			if(leftPointReflection< ++rightPoint){
				int temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
				String stemp= new String(sa[rightPoint].toString());
				sa[rightPoint]= sa[leftPointReflection].toString();
				sa[leftPointReflection]= stemp.toString();
			}
		}
		array[leftPoint]= array[rightPoint];
		sa[leftPoint]= sa[rightPoint].toString();
		array[rightPoint]= x;
		sa[rightPoint]= xString.toString();
		return rightPoint;
	}
}