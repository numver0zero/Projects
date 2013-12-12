import java.util.ArrayList;
import java.util.HashMap;

import netapp.manage.NaServer;

import com.skt.tcb.netapp.sevenmode.action.NetappCommandIF;
import com.skt.tcb.netapp.sevenmode.action.NetappConnectionManager;
import com.skt.tcb.netapp.sevenmode.action.SystemApiList;
import com.skt.tcb.netapp.sevenmode.action.SystemGetInfo;
import com.skt.tcb.netapp.sevenmode.action.SystemGetVersion;


public class NetappAPI {


	
	public static ArrayList<HashMap<String, String>> backupSchduleDelete(String ip, String user, String passwd, String b, String c) throws Exception{
		
		
		NaServer s = NetappConnectionManager.getConnection(ip, user, passwd);
		
		Template t = new Template();
		
		SystemGetInfo ni1 = new SystemGetInfo();
		ni1.addArg(SystemGetInfo.B, b);
		t.addNetappCommand(ni1);
		
		SystemGetVersion ni2 = new SystemGetVersion();
		ni2.addArg(SystemGetVersion.c, c);
		t.addNetappCommand(ni2);
		
		ArrayList<HashMap<String, String>> result = t.runjob(NetappConnectionManager.getConnection(ip, user, passwd));
		NetappConnectionManager.connectionClose(s);
		
		return result;
		
	}
	
	
	public static ArrayList<HashMap<String, String>> qtreeDelete(String ip, String user, String passwd, String a, String b) throws Exception{
		NaServer s = NetappConnectionManager.getConnection(ip, user, passwd);
		
		Template t = new Template();
		
		SystemGetInfo ni1 = new SystemGetInfo();
		ni1.addArg(SystemGetInfo.B, b);
		t.addNetappCommand(ni1);
		
		SystemApiList ni2 = new SystemApiList();
		ni2.addArg(SystemApiList.a, a);
		t.addNetappCommand(ni2);
		
		ArrayList<HashMap<String, String>> result = t.runjob(NetappConnectionManager.getConnection(ip, user, passwd));
		NetappConnectionManager.connectionClose(s);
		
		return result;
		
	}

}
