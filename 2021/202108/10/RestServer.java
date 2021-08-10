package OSI.AOP.VPC.server;

import java.io.IOException;

import ME.APM.VSQ.App;
import OSI.AOP.MS.VPC.server.ServerInit_C;

public class RestServer extends Thread implements Runnable{
	private App app;
	public boolean ready= false;
	public RestServer(App app) {
		//balabala here;
		this.app= app;
	}
	
	public void run() {
		try {
			new ServerInit_C().IV_Server(this.app);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}  