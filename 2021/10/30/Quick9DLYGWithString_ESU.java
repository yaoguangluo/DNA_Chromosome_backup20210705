package ESU.sort;
import java.util.Iterator;
import java.util.Map;

import ESU.array.Double_ESU;
import OEU.LYG4DQS4D.LYG9DWithIntTopSort4D;
import OEU.LYG4DQS4D.Quick_7D_luoyaoguang_Sort;
//���� ������
//�ĳ� map��ʽ��
//˼�����������1000���ַ�����������������ַ���ƽ�����Ǽ�ʮ���֣���ô����5��G���ַ�������
//ϵͳ�ڴ��� ���۸��ĸܸܵģ����Ի�����mapͳ�ƣ�ֻint����
//�Ұ�string ����ز��� ע�ӵ��ˣ��൱��TopSort4D˼�� ��int�� ��������ˡ� ������
public class Quick9DLYGWithString_ESU extends Quick_7D_luoyaoguang_Sort{
	public int[] sort(int[]a, String[]sa) {
		//Map<Integer, Map<String, Boolean>> map= Double_ESU.getMapFromIntStringArray(a
		//, sa);	
		processDouble(a, 0, a.length - 1, sa, 0);
		//�ɴ��滻�ˡ�
//		new LYG9DWithIntTopSort4D().sort(a, 7, 70);
//		int count= 0;
//		Here:
//		for(int i= 0; i< a.length; i++) {
//			if(!map.containsKey(a[i])) {
//				i++;
//				continue Here;
//			}
//			Iterator<String> iterator= map.get(a[i]).keySet().iterator();
//			while(iterator.hasNext()) {
//				String string= iterator.next();
//				sa[count++]= string.toString();
//			}
//			map.remove(a[i]);
//		}
		return a;
	}

	public int[] sortZhongYao(int[]a, String[]sa) {
		int count= 0;
		int aLength= a.length;
		try {
			Map<Integer, Map<String, Boolean>> map
			= Double_ESU.getMapFromIntStringArray_ZhongYao(a, sa);	
			//processDouble(a, 0, a.length - 1, sa, 0);
			//�ɴ��滻�ˡ�
			new LYG9DWithIntTopSort4D().sort(a, 7, 70);
			Here:
			for(int i= 0; i< aLength; i++) {
				if(!map.containsKey(a[i])) {
					i++;
					continue Here;
				}
				Iterator<String> iterator= map.get(a[i]).keySet().iterator();
				while(iterator.hasNext()) {
					String string= iterator.next();
					if(count< aLength) {
						sa[count++]= string.toString();
					}else {
						System.out.println(string.toString());
					}
				}
				map.remove(a[i]);
			}
			return a;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return a; 
	}
	
	private void processDouble(int[] array, int leftPoint, int rightPoint, String[] sa
			, int deep) {
		int c= rightPoint- leftPoint+ 1;
		if(!(c< 7|| deep> 70)) {//������deep
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
	
	//�������µ��Ĵ�TopSort ˼�룬 ������
		//Ī�����Ժ��һ�ͬ����map �������ͬint�� ���й��˵��� ������20210722	
		private int partition(int[] array, int leftPoint, int rightPoint, String[] sa) {
			int x= array[leftPoint]<= array[rightPoint]? array[leftPoint]: array[rightPoint];
			String xString= array[leftPoint]<= array[rightPoint]//���µļ�������16�� �����ƾ��ĺ��������� �����Ż�����Ϊ�Ǵ�С����������������ҲҪ����������
					? sa[leftPoint].toString(): sa[rightPoint].toString();
			int leftPointReflection= leftPoint;
			while(leftPointReflection< rightPoint){
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