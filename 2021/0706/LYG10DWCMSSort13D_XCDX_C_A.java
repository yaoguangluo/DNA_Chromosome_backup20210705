package OEU.LYG4DQS4D;
//import java.io.BufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.util.HashMap;
//20200314 ���������µ�С�߷���˴߻�����5��˼�롣

//20200818 ���������µ�С�߷���˴߻�����9��˼�롣
//����ͬƴ��ͬ�ʻ����ְ�char��int��С����20210529
//������
//import java.util.Map;

//import SVQ.stable.StableFile;
//import PEU.S.verbal.VerbalSource;
//���콫�³´�л����Ӧ�õ� ����ƴ���ʻ��ִ���.
//������
public class LYG10DWCMSSort13D_XCDX_C_A extends LYG10DWCMSSort13D_XCDX_S{
	protected boolean findSmall(String[] kernel, int scale, int point
			, int i, int j, int rightPosition) {
		if(kernel[i].length()<= point|| kernel[j].length()<= point) {
			if(kernel[i].length()< kernel[j].length()) {
				for(int p= 0; p< scale; p++) {
					if(!(kernel[i].length()<= p|| kernel[j].length()<= p)) {
						if(kernel[i].charAt(p)!= kernel[j].charAt(p)) {
							return false;
						}
					}
				}
				return true;
			}
			return false;
		}else {
			boolean hasXi= pinyin.containsKey(""+ kernel[i].charAt(point));
			boolean hasXj= pinyin.containsKey(""+ kernel[j].charAt(point));
			if(!(!hasXi|| !hasXj)){
				String[] js= new String[2];
				js[0]= this.pinyin.get(""+ kernel[i].charAt(point));
				js[1]= this.pinyin.get(""+ kernel[j].charAt(point));
				boolean change= processSortpinyin(js, 3);	
				if(!(!change|| i>= j)) {
					return true;
				}
				return false;
			}else if(!(hasXi|| hasXj)){
				if(kernel[i].toLowerCase().charAt(point)
						> kernel[j].toLowerCase().charAt(point)) {
					if(i< j) {
						return true;
					}
					return false;
				}else if(kernel[i].toLowerCase().charAt(point)
						== kernel[j].toLowerCase().charAt(point)) {
					if(kernel[i].charAt(point)> kernel[j].charAt(point)) {
						if(i< j) {
							return true;
						}
						return false;
					}
					return false;
				}
				return false;
			}else if(!(hasXi|| !hasXj)){
				if(i< j) {
					if(!(i== rightPosition || j== rightPosition)) {
						return true;
					}
					return false;
				}
				return false;
			}
		}
		return false;
	}
}