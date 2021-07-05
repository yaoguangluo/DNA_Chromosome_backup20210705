package OEU.LYG4DQS4D;
//20200314 集成了最新的小高峰过滤催化排序5代思想。
//20200818 集成了最新的小高峰过滤催化排序9代思想。
//增加同拼音同笔画的字按char的int大小区分20210529
//罗瑶光

//今天将新陈代谢技术应用到 中文拼音笔画分词上.
//罗瑶光
public interface LYG10DWCMSSort13D_XCDX_C_U_A_C{
	void processKernel(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point);

	void processSort(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point);

	void processQS4DLYG9D(String[] kernel, int leftPosition
			, int rightPosition, int scale, int point, int deep);

	int partition(String[] array, int leftPosition, int rightPosition, int scale, int point) ;
}