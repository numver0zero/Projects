import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

import netapp.manage.NaServer;

import com.skt.tcb.netapp.sevenmode.action.NetappCommand;
import com.skt.tcb.netapp.sevenmode.action.NetappCommandIF;
import com.skt.tcb.netapp.sevenmode.action.NetappConnectionManager;


public class Template {

	ArrayList<NetappCommandIF> array=new ArrayList<NetappCommandIF>();
	
	public void addNetappCommand(NetappCommandIF e){
		array.add(e);
	}
	
	public void setNetappCommand(int index, NetappCommandIF e){
		array.set(index, e);
	}
	
	
	
	public ArrayList<HashMap<String, String>> runjob(NaServer s) throws Exception {
		
		ArrayList<HashMap<String, String>> result = new ArrayList<HashMap<String,String>>();
		

		for (int i = 0; i < array.size(); i++) {
				HashMap<String, String> arg = new HashMap<String, String>();
				long start = 0;
				long end = 0;
				System.out.println("["+array.get(i)+"] start="+(start=System.currentTimeMillis()));
				NetappCommandIF a = array.get(i);
				arg = a.execute(s);
				result.add(arg);
				System.out.println("["+array.get(i)+"] end="+(end=System.currentTimeMillis()));
				System.out.println("["+array.get(i)+"] 소요시간(ms) = "+(end-start));
			
		}
		
		NetappConnectionManager.connectionClose(s);
		return result;
	}
	
	
}
