package ESU.sort;
import java.util.Iterator;
import java.util.Map;

import ESU.array.Double_ESU;
import OEU.LYG4DQS4D.LYG9DWithIntTopSort4D;
import OEU.LYG4DQS4D.Quick_7D_luoyaoguang_Sort;
//作者 罗瑶光
//改成 map形式。
//思考了下如果有1000万字符串和数字排序，如果字符串平均都是几十个字，那么就有5个G的字符串排序，
//系统内存条 被欺负的杠杠的，所以还是用map统计，只int排序。
//我把string 的相关操作 注视掉了，相当于TopSort4D思想 排int。 不多解释了。 备份下
public class Quick9DLYGWithString_ESU extends Quick_7D_luoyaoguang_Sort{
	public int[] sort(int[]a, String[]sa) {
		//Map<Integer, Map<String, Boolean>> map= Double_ESU.getMapFromIntStringArray(a
		//, sa);	
		processDouble(a, 0, a.length - 1, sa, 0);
		//干脆替换了。
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
			//干脆替换了。
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
			int x= array[leftPoint]<= array[rightPoint]? array[leftPoint]: array[rightPoint];
			String xString= array[leftPoint]<= array[rightPoint]//最新的极速排序16代 在养疗经的海量排序中 集成优化。因为是从小到大排序，所以这里也要符号修正。
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