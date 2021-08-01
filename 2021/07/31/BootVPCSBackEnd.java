package OSI.AOP.PCS.server;
import java.io.IOException;

import java.net.ServerSocket;
import java.util.Properties;
import java.util.Random;

import OCI.AVC.SUQ.SVQ.MPC.fhmm.C.EmotionMap;
//import OCI.ME.analysis.C.A;
import OEI.AVC.SUQ.SVQ.MPC.fhmm.E.EmotionMap_E;
import OEI.ME.analysis.E.CogsBinaryForest_AE;
import OM.config.Config;
import PCS.thread.SocketThread;
import PCS.thread.SocketThreadPool;
public class BootVPCSBackEnd extends Thread{
	private static ServerSocket server;
	@SuppressWarnings("unused")
	private static Properties properties;
	private CogsBinaryForest_AE _A;
	private EmotionMap emotionMap;
	private int port;
	static {
		properties = new Properties();
	}

	public BootVPCSBackEnd(CogsBinaryForest_AE _A) throws IOException {
		if(null== _A) {
			this._A = new CogsBinaryForest_AE();
			this._A.IV_Mixed();
		}else {
			this._A= _A;
		}
		
	}
	public BootVPCSBackEnd() throws IOException {	
	}
	
    // ��Ϊ��ҳ�Ѿ�init��,��֮���ĳ�_A���������. ������20210420
	public void IV_() {
		try {
			//port = Integer.parseInt(properties.getProperty("port"));
			port= Config.detaVPCSBackEndPort;
			server = new ServerSocket(port);
			if(null== this._A) {
				this._A = new CogsBinaryForest_AE();
				this._A.IV_Mixed();
			}
			emotionMap = new EmotionMap_E(); 
			emotionMap.IV_NegativeMap();
			emotionMap.IV_PositiveMap();
			emotionMap.IV_MotivationMap();
			emotionMap.IV_TrendingMap();
			emotionMap.IV_PredictionMap();
			emotionMap.IV_DistinctionMap();
			System.out.println();
			System.out.println("----����VPCS��˷������˿�����:" + port);
			//MrTin.born.start();;
			System.out.println("----Tin�� VPCS-AOPM-IDUQ ��һ�����˴߻�������������:" + port);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void bootBackEnd() throws IOException {
		SocketThreadPool socketThreadPool= new SocketThreadPool();
		long before= System.currentTimeMillis();
		IV_();
		I_RestService();
		long now= System.currentTimeMillis();
		System.out.println("----DETA VPCS BackEnd--2.0");
		System.out.println("----Author: ������");
		System.out.println("----������������������޹�˾��Դ��Ŀ");
		System.out.println("----����VPCS��˷�����----");
		System.out.println("----����VPCS��˷���������һ������-�ܺ�ʱ:"+ (now- before)+ "����");
		while(true){
			if(socketThreadPool.getThreadsCount() < 300){
				SocketThread clientSocket= new SocketThread(emotionMap, _A, socketThreadPool, server.accept()
						, System.currentTimeMillis()+ "" + new Random().nextLong());
				socketThreadPool.I_E_Socket(clientSocket.getSid(), clientSocket);
				clientSocket.start();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		new BootVPCSBackEnd().bootBackEnd();
	}
	
	public void run(){
		try {
			bootBackEnd();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void I_RestService() {	
	}
}