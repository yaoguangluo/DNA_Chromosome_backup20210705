package OSI.AOP.VPC.C;
import java.io.IOException;

import java.net.ServerSocket;
import java.util.Properties;

import ME.APM.VSQ.App;
import MS.VPC.PP.Time_P;
import MS.VPC.SH.Sleeper;
import MS.VPC.SH.Sleeper_H;
import OM.config.Config;
import VPC.VQS.DSU.utils.DetaUtil;
public class ServerInit_C_VPCSFrontEnd {
	private ServerSocket server;
	@SuppressWarnings("unused")
	private Properties properties;
	private App app;
	private int port;{
		properties= new Properties();
			System.out.println("----德塔VPCS前端服务器资源载入:成功！");
	}

	public void IV_() throws IOException {
		try {
			port= Config.detaVPCSFrontEndPort;
			server= new ServerSocket(port);
			System.out.println("----德塔VPCS前端服务器端口启动:" + port);
			if(null!= app.dbConfigPath&& !app.dbConfigPath.isEmpty()) {
				DetaUtil.IV_DB(app.dbConfigPath);//稍后整理下
			}else {
				DetaUtil.IV_DB("C:/DBconfig.lyg");
			}
			System.out.println("----德塔VPCS前端服务器DMA确认:成功！");	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void haoHiYooFaker(Sleeper_H sleeper_H) {
		sleeper_H.callSkivvy(); 
	}

	public void IV_Server(App app) throws IOException {
		this.app= app;
		System.out.println("");
		System.out.println("----DETA VPCS--2.0");
		System.out.println("----Author: 罗瑶光");
		System.out.println("----浏阳德塔软件开发有限公司开源项目");
		Time_P time_P= new Time_P();
		time_P.begin();
		Sleeper_H sleeper_H= new Sleeper_H();
		IV_();
		time_P.end();
		System.out.println("----德塔VPCS前端服务器启动一切正常-总耗时:"+ time_P.duration()+ "毫秒");
		while(true){	
			if(sleeper_H.getThreadsCount()< 500){
				Sleeper sleeper= new Sleeper(this.app);
				sleeper.hugPillow(sleeper_H, server.accept(), sleeper.hashCode());
				sleeper.start();
			}else {
				haoHiYooFaker(sleeper_H);
			}
		}
	}
}