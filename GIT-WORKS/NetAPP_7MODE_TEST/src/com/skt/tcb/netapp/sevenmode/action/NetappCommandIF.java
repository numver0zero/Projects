package com.skt.tcb.netapp.sevenmode.action;

import java.util.HashMap;

import netapp.manage.NaServer;

public interface NetappCommandIF {
	
	public HashMap<String, String> execute(NaServer s);
//	public HashMap<String, String> runcommand(NaServer s);
	
}
