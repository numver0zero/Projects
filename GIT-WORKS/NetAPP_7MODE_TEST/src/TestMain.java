import java.util.ArrayList;
import java.util.HashMap;

import com.skt.tcb.netapp.sevenmode.action.NetappCommand;
import com.skt.tcb.netapp.sevenmode.action.NetappCommandIF;
import com.skt.tcb.netapp.sevenmode.action.NetappConnectionManager;
import com.skt.tcb.netapp.sevenmode.action.SystemApiList;
import com.skt.tcb.netapp.sevenmode.action.SystemGetInfo;
import com.skt.tcb.netapp.sevenmode.action.SystemGetVersion;

import netapp.manage.NaServer;

public class TestMain {

	/*
	 * 상용 Netapp 7모드 IP 조회 쿼리
		SELECT ip.ctrlr_id AS ctrlr ,
		       ip.svc_typ_cd AS svcTypCd ,
		       ip.strg_ip AS strgIp ,
		       ip.id AS id ,
		       ip.passwd AS passwd ,
		       fsip.strg_ip AS fsIp 
		  FROM 
		       (SELECT strg.ctrlr_id AS ctrlr_id ,
		              strg.svc_typ_cd AS svc_typ_cd ,
		              ip.strg_ip AS strg_ip ,
		              strg.id AS id ,
		              strg.passwd AS passwd 
		         FROM t_sol_storage strg ,
		              t_sol_storage_ip ip 
		        WHERE strg.ctrlr_id = ip.ctrlr_id 
		              AND ip.ip_act_yn = 'Y' 
		       ) ip ,
		       t_sol_storage_ip fsip 
		 WHERE ip.ctrlr_id = fsip.ctrlr_id 
		       AND fsip.fs_ip_act_yn = 'Y' 
		       --AND ip.svc_typ_cd ='CCH'
	 */
	
	/*
	 * 상용 Netapp 7모드 IP 조회 결과
		CCH_B	CCH	172.18.60.12	root	tcloud123!	172.18.45.32
		CCH_C	CCH	172.19.88.33	root	tcloud123!	172.18.45.33
		CCH_D	CCH	172.19.88.34	root	tcloud123!	172.18.45.34
		CCH_E	CCH	172.18.60.17	root	tcloud123!	172.18.45.37
		CCH_G	CCH	172.19.88.39	root	tcloud123!	172.18.45.39
		CCH_HA	CCH	172.19.165.32	root	tcloud123!	172.19.165.32
		LOC_A	CCH	172.19.165.31	root	tcloud123!	172.19.165.31
	 */
	
	/*
	 * 상용 Netapp 7모드 버전 확인 결과 - apitest 명령어
		C:\Temp\Netapp\netapp-manageability-sdk-5.1\bin\nt>apitest 172.18.45.39 root tcloud123! system-get-ontapi-version
		<results status="passed">
		        <major-version>1</major-version>
		        <minor-version>17</minor-version>
		</results>	 
	 */
	
	/*
	 상용 Netapp 7모드 버전 확인 결과 - API 연동
	 <results status='passed'>
		<version>NetApp Release 8.1.1 7-Mode: Mon Jul 30 12:49:46 PDT 2012</version>
		<is-clustered>false</is-clustered>
	</results>
	 */
	
	static String ip = "172.18.45.39";
	static String user = "root";
	static String passwd = "tcloud123!";

	public static void main(String[] str) throws Exception {
		
		//createConnection().close();
		//SystemGetInfo.execute(ip, user, passwd);

		//SystemGetVersion.execute(ip, user, passwd);
		
		
/*		ArrayList<NetappCommand> array=new ArrayList<NetappCommand>();
		array.add(new SystemGetInfo());
		array.add(new SystemGetVersion());
		array.add(new SystemApiList());
		flow1(array);*/
		
		NetappAPI.backupSchduleDelete(ip, user, passwd, "bbbbbbb", "ccccccccccccc");
		
		NetappAPI.qtreeDelete(ip, user, passwd, "aaaaaaaaaaa", "bbbbbbbbbbbbb");
	}
	
	

	
	
	

	
	
	public static NaServer createConnection() {

		NaServer naServer = null;
		try {
			naServer = new NaServer(ip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		naServer.setStyle(NaServer.STYLE_LOGIN_PASSWORD);
		naServer.setAdminUser(user, passwd);
		System.out.println(naServer.getPort());

		return naServer;
	}

}
