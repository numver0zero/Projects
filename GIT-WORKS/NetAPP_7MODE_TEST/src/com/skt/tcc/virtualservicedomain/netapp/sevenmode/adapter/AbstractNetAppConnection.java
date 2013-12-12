package com.skt.tcc.virtualservicedomain.netapp.sevenmode.adapter;

import netapp.manage.NaServer;

public abstract class AbstractNetAppConnection {
    
    /** The Constant NET_APP_CCH. */
    public static final String NET_APP_DYNAMIC_CCH = "CCH";
    
    /** The Constant NET_APP_VDI. */
    public static final String NET_APP_DYNAMIC_VDI = "VDI";
    
    /** The Constant NET_APP_BAK. */
    public static final String NET_APP_DYNAMIC_BAK = "BAK";
    

    /** The Constant NET_APP_CCH_A. */
    public static final String NET_APP_CCH_A = "CCH_A";
    
    /** The Constant NET_APP_CCH_B. */
    public static final String NET_APP_CCH_B = "CCH_B";
    
    /** The Constant NET_APP_VDI_A. */
    public static final String NET_APP_VDI_A = "VDI_A";
    
    /** The Constant NET_APP_VDI_B. */
    public static final String NET_APP_VDI_B = "VDI_B";
    
    /** The Constant NET_APP_BAK_A. */
    public static final String NET_APP_BAK_A = "BAK_A";
    
    /** The Constant NET_APP_BAK_A. */
    public static final String NET_APP_BAK_B = "BAK_B";
    
    /** The Constant NET_APP_BAK_D. */
    public static final String NET_APP_BAK_D = "BAK_D";
    
    /** The Constant NET_APP_BAK_A. */
    public static final String NET_APP_BAK_E = "BAK_E";
    
    /** The Constant NET_APP_BAK_G. */
    public static final String NET_APP_BAK_G = "BAK_G";

    /**
     * <pre>
     * Creates the connection.
     * </pre>
     *
     * @return the na server
     * @throws Exception the exception
     */
    public abstract NaServer createConnection() throws Exception;
}
