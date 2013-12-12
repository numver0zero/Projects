package com.skt.tcb.netapp.sevenmode.action;

import netapp.manage.NaServer;

public class NetappConnectionManager {

	public static NaServer getConnection(String ip, String user, String passwd) throws Exception {
		NaServer s = new NaServer(ip);
		s.setStyle(NaServer.STYLE_LOGIN_PASSWORD);
		s.setAdminUser(user, passwd);
		return s;
	}

	public static void connectionClose(NaServer s) throws Exception {
		s.close();
	}
}
