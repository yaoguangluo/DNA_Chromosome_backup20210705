package OSI.AOP.MS.VPC.server;
import java.io.IOException;
import java.net.ServerSocket;
import MS.VPC.PP.Time_P;
import MS.VPC.SH.Sleeper_H;
//import OM.config.Config;
import SVQ.stable.StableWeb;
//VPCS��׼����,׼��֮�����з����� �߼̳�����ļ���
//������ 20200811
public class ServerInit_Standard {
	private ServerSocket server;
	private int port;
	public void IV_Service(String ǰ�˽ӿ�Txt, String ��������) throws IOException {
		try {
			//port= Integer.parseInt(properties.getProperty(StableData.TCP_PORT));
			port= Integer.valueOf(ǰ�˽ӿ�Txt);
			//port= Config.detaVPCSDBPort;
			server= new ServerSocket(port);
			System.out.println("----����VPCS"+ ��������+ "�˿�����:" + port);
			System.out.println("----����VPCS"+ ��������+ "DMAȷ��:�ɹ���");
			RequestFilter_C.IV_BlockList();
			System.out.println("----����VPCS"+ ��������+ "IP���˷�������:�ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void haoHiYooFaker(Sleeper_H sleeper_H) {
		sleeper_H.callSkivvy(); 
	}

	public void IV_Server(String ǰ�˽ӿ�Txt, String ��������) throws IOException {
		System.out.println("----DETA VPCS--3.0");
		System.out.println("----Author: ������");
		System.out.println("----�����������������޹�˾��Դ��Ŀ");
		Time_P time_P= new Time_P();
		time_P.begin();
		Sleeper_H sleeper_H= new Sleeper_H();
		IV_Service(ǰ�˽ӿ�Txt, ��������);
		time_P.end();
		System.out.println("----����VPCS"+ ��������+ "����һ������-�ܺ�ʱ:" 
				+ time_P.duration()+ "����");
		while(true){
			if(sleeper_H.getThreadsCount()< StableWeb.SLEEPERS_RANGE){
				ServerSleeper_Standard sleeper= new ServerSleeper_Standard(ǰ�˽ӿ�Txt);
				try {
					sleeper.hugPillow(sleeper_H, server.accept()
							, sleeper.hashCode());
					sleeper.start();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}else {
				haoHiYooFaker(sleeper_H);
			}
		}
	}
}