package OEU.LYG4DQS4D;
//20200314 ���������µ�С�߷���˴߻�����5��˼�롣
//20200818 ���������µ�С�߷���˴߻�����9��˼�롣
//����ͬƴ��ͬ�ʻ����ְ�char��int��С����20210529
//������

//���콫�³´�л����Ӧ�õ� ����ƴ���ʻ��ִ���.
//������
public interface LYG10DWCMSSort13D_XCDX_C_U_A_C{
	void processKernel(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point);

	void processSort(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point);

	void processQS4DLYG9D(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point, int deep);

	int partition(String[] array, int leftPosition, int rightPosition, int scale, int point) ;
}