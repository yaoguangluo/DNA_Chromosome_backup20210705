package OSI.AOP.VPC.server;
import java.io.IOException;
import ME.APM.VSQ.App;
import OSI.AOP.MS.VPC.server.ServerInit_C;
public class BootVPCS {
	public static void main(App app, String[] args) throws IOException {
		new ServerInit_C().IV_Server(app);
	}
}