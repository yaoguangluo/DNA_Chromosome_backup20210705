package PEU.P.image;
public class Opening {
	public int[][] P(int[][]g,int[][]kenel){
		int[][] opening=new Erosion().P(g,kenel);
		opening=new Dilation().P(opening, kenel);
		return opening;
	}
}
