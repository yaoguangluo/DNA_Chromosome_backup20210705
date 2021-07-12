package ISQ.VSU.feature;
//准备用肽展公式来设计个 皮肤病检测程序.
//罗瑶光 20210710
//软件思想 肽展腐蚀变换. 计算机视觉. 
//硬件工具, imageIO, javaCV. 像素头
//因为肽展公式和思想GPL2.0开源,本程序源码同样GPL2.0开源.
public class SkinDetect{
	public void getSkinBy() {

	}
	
	public void doPDEofSkin() {

	}
	
	public void getStatisticRatio() {

	}
	
	public void getRatioScore() {

	}
	
	public void getRatioScoreSort() {

	}
	public static void main(String[] argv) {
		//皮肤病图片识别
		
		//1 读取一张图片
		//2 进行肽展非卷积腐蚀变换.
		//3 统计腐蚀后的颜色特征
		//3.1用PDE肽腐蚀碱性 为 处理函数
		
		//4 然后进行模式识别 数据比对,
		//4.1红像素
		//4.2蓝像素
		//4.3黄像素	
		//4.4绿像素
		
		//5 打分.
		//5.1红蓝比值
		//5.2红黄比值
		//5.3红绿比值
		//5.4蓝黄比值
		//5.5蓝绿比值
		//5.6黄绿比值
		//接近满分 100分, 按百分比接近相似度 打分. 
		
		//比值采样方法, 中心面积取值, 按中心面积2倍 进行周边面积取值.
		
		//6 排序进行高分推荐.
		//总分排序推荐
		
		//7做之前进行将所有皮肤病图片训练, 做成数据库,方便计算加速.	
	}
}