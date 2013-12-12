package com.skt.tcb.netapp.sevenmode.action;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import netapp.manage.NaElement;
import netapp.manage.NaException;
import netapp.manage.NaServer;

public class SystemGetInfo extends NetappCommand {


	public static final String B="B";

	@Override
	public HashMap<String, String> runcommand(NaServer s) {
		
		HashMap<String, String> result=new HashMap<String, String>();
		printString(arg);
		
		try {

			NaElement api = new NaElement("system-get-info");

			Set<String> set = arg.keySet();
			Iterator<String> i = set.iterator();
			String key = null;
			while(i.hasNext()){
				key = i.next();
				System.out.println(key+":"+arg.get(key));
				api.addNewChild(key, arg.get(key));
			}
			
			NaElement xo = s.invokeElem(api);
			System.out.println(xo.toPrettyString(""));

		} catch (NaException e) {
			handleException(e);
		} catch (UnknownHostException e) {
			handleException(e);
		} catch (IOException e) {
			handleException(e);
		}
		return result;
	}

	
	
}
