package com.skt.tcc.virtualservicedomain.netapp.sevenmode.adapter;

import netapp.manage.NaServer;

public class NetAppConnection extends AbstractNetAppConnection {

    /** The na uri. */
    private String naUri = "211.56.225.143";
    
    /** The na id. */
    private String naId = "root";
    
    /** The na pw. */
    private String naPw = "snapshot";

    /**
     * <pre>
     * Instantiates a new net app connection.
     * </pre>
     *
     * @param naUri the na uri
     * @param naId the na id
     * @param naPw the na pw
     */
    public NetAppConnection(String naUri, String naId, String naPw) {
        this.naUri = naUri;
        this.naId = naId;
        this.naPw = naPw;
    }

    /* (non-Javadoc)
     * @see com.skt.tcc.virtualservicedomain.adapter.AbstractNetAppConnection#createConnection()
     */
    @Override
    public NaServer createConnection() throws Exception {
        // TODO Auto-generated method stub

        NaServer naServer = new NaServer(this.naUri);
        naServer.setStyle(NaServer.STYLE_LOGIN_PASSWORD);
        naServer.setAdminUser(naId, naPw);

        return naServer;
    }

}
