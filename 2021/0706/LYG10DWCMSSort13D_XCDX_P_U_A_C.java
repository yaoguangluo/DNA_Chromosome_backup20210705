package OEU.LYG4DQS4D;
//20200314 ���������µ�С�߷���˴߻�����5��˼�롣
//20200818 ���������µ�С�߷���˴߻�����9��˼�롣
//����ͬƴ��ͬ�ʻ����ְ�char��int��С����20210529
//������

//���콫�³´�л����Ӧ�õ� ����ƴ���ʻ��ִ���.
//������
public interface LYG10DWCMSSort13D_XCDX_P_U_A_C{

	void processKernel2D(String[][] kernel, int leftPosition
			, int rightPosition, int scale, int point, int culumn);

	void processQS4DLYG9D2D(String[][] kernel, int leftPosition
			, int rightPosition, int scale, int point, int deep, int culumn);

	int partition2D(String[][] array, int leftPosition, int rightPosition
			, int scale, int point, int culumn) ;

	void processSort2D(String[][] kernel, int leftPosition
			, int rightPosition, int scale, int point, int culumn);
}