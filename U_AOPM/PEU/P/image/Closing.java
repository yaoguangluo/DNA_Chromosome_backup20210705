package PEU.P.image;
public class Closing {
	public int[][] P(int[][]g,int[][]kenel){
		int[][] closing=new Dilation().P(g, kenel);
		closing= new Erosion().P(closing,kenel);
		return closing;
	}
}
