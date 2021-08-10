package OSI.AOP.MS.VPC.server;
import java.io.IOException;
import java.net.ServerSocket;
import MS.VPC.PP.Time_P;
import MS.VPC.SH.Sleeper_H;
//import OM.config.Config;
import SVQ.stable.StableWeb;
//VPCS标准函数,准备之后所有服务器 走继承这个文件。
//罗瑶光 20200811
public class ServerInit_Standard {
	private ServerSocket server;
	private int port;
	public void IV_Service(String 前端接口Txt, String 服务器名) throws IOException {
		try {
			//port= Integer.parseInt(properties.getProperty(StableData.TCP_PORT));
			port= Integer.valueOf(前端接口Txt);
			//port= Config.detaVPCSDBPort;
			server= new ServerSocket(port);
			System.out.println("----德塔VPCS"+ 服务器名+ "端口启动:" + port);
			System.out.println("----德塔VPCS"+ 服务器名+ "DMA确认:成功！");
			RequestFilter_C.IV_BlockList();
			System.out.println("----德塔VPCS"+ 服务器名+ "IP过滤服务启动:成功！");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void haoHiYooFaker(Sleeper_H sleeper_H) {
		sleeper_H.callSkivvy(); 
	}

	public void IV_Server(String 前端接口Txt, String 服务器名) throws IOException {
		System.out.println("----DETA VPCS--3.0");
		System.out.println("----Author: 罗瑶光");
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		Time_P time_P= new Time_P();
		time_P.begin();
		Sleeper_H sleeper_H= new Sleeper_H();
		IV_Service(前端接口Txt, 服务器名);
		time_P.end();
		System.out.println("----德塔VPCS"+ 服务器名+ "启动一切正常-总耗时:" 
				+ time_P.duration()+ "毫秒");
		while(true){
			if(sleeper_H.getThreadsCount()< StableWeb.SLEEPERS_RANGE){
				ServerSleeper_Standard sleeper= new ServerSleeper_Standard(前端接口Txt);
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