package com.skt.tcb.netapp.sevenmode.action;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import netapp.manage.NaServer;


public abstract class NetappCommand implements NetappCommandIF {
	
	HashMap<String, String> arg = new HashMap<String, String>();

	public HashMap<String, String> getArg() {
		return arg;
	}

	public void addArg(String key, String value) {
		this.arg.put(key, value);
	}

	
	public HashMap<String, String> execute(NaServer s){
		printString(arg);
		HashMap<String, String> h = runcommand(s);
		printString(h);
		return h;
	}
	
	protected void printString(HashMap<String, String> arg){
		Set<String> s = arg.keySet();
		Iterator<String> i = s.iterator();
		int idx=1;
		String key;
		while(i.hasNext()){
			key = i.next();
			System.out.println("["+this+"]["+(idx++)+"]="+key+":"+arg.get(key));
		}
	}
	
	protected static void handleException(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();		
	}

	public abstract HashMap<String, String> runcommand(NaServer s);
	
}
