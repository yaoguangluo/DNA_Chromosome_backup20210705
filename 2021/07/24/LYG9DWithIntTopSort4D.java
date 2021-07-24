package OEU.LYG4DQS4D;

import ASQ.PSU.test.TimeCheck;

//�����㷨���ۿ���4��������С�߷�ȱ�ݹ������ۿ��������8�� ���������������򷨺���Java�����汾ʵ�֡�
//˼�룺�㷨���ۿ���4���ۣ�������С�߷�������ۡ�
//ʵ�֣�������
//ʱ�䣺20140101~ 20200711
//����һ�� �Ժ�׼�� Ԫ���³´�л�Ż�
public class LYG9DWithIntTopSort4D{
	int range;
	int deeps;
	public int[] sort(int[] array, int range, int deeps) {
		this.range= range;
		this.deeps= deeps;
		processInt(array, 0, array.length- 1, 0);
		return array;
	}

	private void processInt(int[] array, int leftPoint, int rightPoint, int deep) {
		int c= rightPoint- leftPoint+ 1;
		if(!(c< this.range|| deep> this.deeps)) {//������deep
			int pos= partition(array, leftPoint, rightPoint);
			if(leftPoint< pos- 1) {
				processInt(array, leftPoint, pos- 1, deep+ 1);
			}
			if(pos+ 1< rightPoint) {
				processInt(array, pos+ 1, rightPoint, deep+ 1);
			}
			return;
		}
		int i= leftPoint;
		for(int j= i+ 1; j< leftPoint+ c; j= i++){
			while(j> leftPoint){
				if(array[j]< array[--j]){
					int temp= array[j+ 1];
					array[j+ 1]= array[j];
					array[j]= temp;
				}
			}
		}	
	}

	private int partition(int[] array, int leftPoint, int rightPoint) {
		int x= array[leftPoint]< array[rightPoint]? array[leftPoint]: array[rightPoint];
		int leftPointReflection= leftPoint;
		while(leftPointReflection< rightPoint){//��������top2D , --ϸ�ھ�Ȼû��һ���˹�ע��Щϸ��...20210716
			while(!(array[leftPointReflection]> x|| leftPointReflection++ >= rightPoint)) {}
			while(array[rightPoint--]> x) {}
			if(leftPointReflection< ++rightPoint){
				int temp= array[rightPoint];
				array[rightPoint]= array[leftPointReflection];
				array[leftPointReflection]= temp;
			}
		}
		array[leftPoint]= array[rightPoint];
		array[rightPoint]= x;
		return rightPoint;
	}
	public static void main(String[] argv) {
		int[] doubles=new int[99999];
		for(int i= 0; i< doubles.length; i++) {
			doubles[i]= (int)Math.random()*1000000;
		}
		LYG9DWithIntTopSort4D lYG9DWithDoubleTopSort2D= new LYG9DWithIntTopSort4D();
		TimeCheck timecheck=new TimeCheck();
		timecheck.begin();
		lYG9DWithDoubleTopSort2D.sort(doubles, 7, 70);
		timecheck.end();
		timecheck.duration();
		for(int i= 0; i< doubles.length- 1; i++) {
			if(doubles[i]> doubles[i+ 1]) {
				System.out.println(i+"->"+ doubles[i]);
			}
		}
		System.out.println("end");
	}
}