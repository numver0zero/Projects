package com.skt.tcc.virtualservicedomain.netapp.sevenmode.adapter;

import netapp.manage.NaAPIFailedException;
import netapp.manage.NaServer;

import org.apache.log4j.Logger;


public class NetAppConnectionMngr {

	
    public static final String NETAPP = "NETAPP";
	
    /** The logger. */
    private static Logger logger = Logger.getLogger(NetAppConnectionMngr.class);

    // private String NA_CCH_URI = "172.18.92.246";
    // private String NA_CCH_URI = "211.56.225.143";
//    private String NA_CCH_URI = "192.168.56.122";
//  private String NA_CCH_PW = "snapshot";
//  private String NA_CCH_PW = "dpsxndpa";
//  private String NA_CCH_PW = "";
    
    /** The na cch uri a. */
    private String naCchUriA = "172.18.92.227";
    
    /** The na cch id a. */
    private String naCchIdA = "root";
    
    /** The na cch pw a. */
    private String naCchPwA = "n2m";

    /** The na cch uri b. */
    private String naCchUriB = "172.18.92.227";
    
    /** The na cch id b. */
    private String naCchIdB = "root";
    
    /** The na cch pw b. */
    private String naCchPwB = "n2m";
    
    /** The na vdi uri a. */
    private String naVdiUriA = "172.18.92.228";
    
    /** The na vdi id a. */
    private String naVdiIdA = "root";
    
    /** The na vdi pw a. */
    private String naVdiPwA = "n2m";
    
    /** The na vdi uri b. */
    private String naVdiUriB = "172.18.92.228";
    
    /** The na vdi id b. */
    private String naVdiIdB = "root";
    
    /** The na vdi pw b. */
    private String naVdiPwB = "n2m";

    /** The na bak uri a. */
    private String naBakUriA = "172.18.92.229";
    
    /** The na bak id a. */
    private String naBakIdA = "root";
    
    /** The na bak pw a. */
    private String naBakPwA = "n2m";

    /** The na server. */
    private NaServer naServer;

    /**
     * <pre>
     * Gets the na server.
     * </pre>
     * 
     * @return the na server
     */
    public NaServer getNaServer() {
        return naServer;
    }

    /**
     * <pre>
     * Connection property set.
     * </pre>
     * 
     * @deprecated
     */
    private void connectionPropertySet() {

        if (logger.isDebugEnabled()) {
            logger.debug("------------------------");
            logger.debug("NA_CCH_URI_A:" + naCchUriA);
            logger.debug("NA_CCH_ID_A:" + naCchIdA);
            logger.debug("NA_CCH_PW_A:" + naCchPwA);
            logger.debug("------------------------");
            logger.debug("NA_CCH_URI_B:" + naCchUriB);
            logger.debug("NA_CCH_ID_B:" + naCchIdB);
            logger.debug("NA_CCH_PW_B:" + naCchPwB);
            logger.debug("------------------------");
            logger.debug("NA_VDI_URI_A:" + naVdiUriA);
            logger.debug("NA_VDI_ID_A:" + naVdiIdA);
            logger.debug("NA_VDI_PW_A:" + naVdiPwA);
            logger.debug("------------------------");
            logger.debug("NA_VDI_URI_B:" + naVdiUriB);
            logger.debug("NA_VDI_ID_B:" + naVdiIdB);
            logger.debug("NA_VDI_PW_B:" + naVdiPwB);
            logger.debug("------------------------");
            logger.debug("NA_BAK_URI_A:" + naBakUriA);
            logger.debug("NA_BAK_ID_A:" + naBakIdA);
            logger.debug("NA_BAK_PW_A:" + naBakPwA);
            logger.debug("------------------------");
        }
    }

    /**
     * <pre>
     * Gets the connection.
     * </pre>
     * 
     * @deprecated
     * @return the connection
     */
    public void getConnection() throws Exception {

        try {
            
            connectionPropertySet();
            
            // Initialize connection to server, and
            // request version 1.3 of the API set
            naServer = new NaServer(naCchUriA, 1, 3);
            naServer.setStyle(NaServer.STYLE_LOGIN_PASSWORD);
            naServer.setAdminUser(naCchIdA, naCchPwA);

        } catch (Exception e) {
        	logger.error("NetApp Connection error");
            int errNo = 99999;
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        }
    }

    /**
     * <pre>
     * Gets the connection.
     * </pre>
     * 
     * @deprecated
     * @param serviceType the service type
     * @return the connection
     */
    public NaServer getConnection(String serviceType) throws Exception {

        NaServer naServer = null;
        
        try {
            
            connectionPropertySet();
            
            // Initialize connection to server, and
            // request version 1.3 of the API set
            naServer = NetAppConnectionMngrFactory.createConnection(this, serviceType);

        } catch (Exception e) {
        	logger.error("NetApp Connection error");
            int errNo = 99999;
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        }
        
        return naServer;
    }
    
    
//    /**
//     * <pre>
//     * Gets the dynamic connection.
//     * </pre>
//     *
//     * @deprecated
//     * @param serviceType the service type
//     * @return the dynamic connection
//     */
//    public NaConVo getDynamicConnection(String serviceType, String volumeName) throws ServiceException, SolutionException {
//        
//        NaConVo naConVo = null;
//        
//        try {
//            connectionPropertySet();
//            
//            naConVo = NetAppConnectionMngrFactory.createDynamicConnection(this, serviceType, volumeName);
//        } catch (ServiceException e) {
//            throw e;
//        } catch (SolutionException e) {
//            throw e;
//        } catch (Exception e) {
//            throw new SolutionException("UnKnown", SolutionType.NETAPP, e);
//        }
//        
//        return naConVo;
//    }
    


    /**
     * <pre>
     * Gets the connection.
     * </pre>
     * 
     * @param serviceType the service type
     * @return the connection
     */
    public NaServer getConnection(String uri, String id, String pw) throws Exception {

        NaServer naServer = null;
        
        try {
            // Initialize connection to server, and
            // request version 1.3 of the API set
            naServer = NetAppConnectionMngrFactory.createConnection(uri, id, pw);

        } catch (Exception e) {
            logger.error("NetApp Connection error");
            int errNo = 99999;
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        }
        
        return naServer;
    }
    

    /**
     * <pre>
     * Close.
     * </pre>
     */
    public void disconnection() {
        if (naServer != null)
            naServer.close();
    }

    /**
     * <pre>
     * Gets the na cch uri a.
     * </pre>
     *
     * @return the na cch uri a
     */
    public String getNaCchUriA() {
        return naCchUriA;
    }

    /**
     * <pre>
     * Sets the na cch uri a.
     * </pre>
     *
     * @param naCchUriA the new na cch uri a
     */
    public void setNaCchUriA(String naCchUriA) {
        this.naCchUriA = naCchUriA;
    }

    /**
     * <pre>
     * Gets the na cch id a.
     * </pre>
     *
     * @return the na cch id a
     */
    public String getNaCchIdA() {
        return naCchIdA;
    }

    /**
     * <pre>
     * Sets the na cch id a.
     * </pre>
     *
     * @param naCchIdA the new na cch id a
     */
    public void setNaCchIdA(String naCchIdA) {
        this.naCchIdA = naCchIdA;
    }

    /**
     * <pre>
     * Gets the na cch pw a.
     * </pre>
     *
     * @return the na cch pw a
     */
    public String getNaCchPwA() {
        return naCchPwA;
    }

    /**
     * <pre>
     * Sets the na cch pw a.
     * </pre>
     *
     * @param naCchPwA the new na cch pw a
     */
    public void setNaCchPwA(String naCchPwA) {
        this.naCchPwA = naCchPwA;
    }

    /**
     * <pre>
     * Gets the na cch uri b.
     * </pre>
     *
     * @return the na cch uri b
     */
    public String getNaCchUriB() {
        return naCchUriB;
    }

    /**
     * <pre>
     * Sets the na cch uri b.
     * </pre>
     *
     * @param naCchUriB the new na cch uri b
     */
    public void setNaCchUriB(String naCchUriB) {
        this.naCchUriB = naCchUriB;
    }

    /**
     * <pre>
     * Gets the na cch id b.
     * </pre>
     *
     * @return the na cch id b
     */
    public String getNaCchIdB() {
        return naCchIdB;
    }

    /**
     * <pre>
     * Sets the na cch id b.
     * </pre>
     *
     * @param naCchIdB the new na cch id b
     */
    public void setNaCchIdB(String naCchIdB) {
        this.naCchIdB = naCchIdB;
    }

    /**
     * <pre>
     * Gets the na cch pw b.
     * </pre>
     *
     * @return the na cch pw b
     */
    public String getNaCchPwB() {
        return naCchPwB;
    }

    /**
     * <pre>
     * Sets the na cch pw b.
     * </pre>
     *
     * @param naCchPwB the new na cch pw b
     */
    public void setNaCchPwB(String naCchPwB) {
        this.naCchPwB = naCchPwB;
    }

    /**
     * <pre>
     * Gets the na vdi uri a.
     * </pre>
     *
     * @return the na vdi uri a
     */
    public String getNaVdiUriA() {
        return naVdiUriA;
    }

    /**
     * <pre>
     * Sets the na vdi uri a.
     * </pre>
     *
     * @param naVdiUriA the new na vdi uri a
     */
    public void setNaVdiUriA(String naVdiUriA) {
        this.naVdiUriA = naVdiUriA;
    }

    /**
     * <pre>
     * Gets the na vdi id a.
     * </pre>
     *
     * @return the na vdi id a
     */
    public String getNaVdiIdA() {
        return naVdiIdA;
    }

    /**
     * <pre>
     * Sets the na vdi id a.
     * </pre>
     *
     * @param naVdiIdA the new na vdi id a
     */
    public void setNaVdiIdA(String naVdiIdA) {
        this.naVdiIdA = naVdiIdA;
    }

    /**
     * <pre>
     * Gets the na vdi pw a.
     * </pre>
     *
     * @return the na vdi pw a
     */
    public String getNaVdiPwA() {
        return naVdiPwA;
    }

    /**
     * <pre>
     * Sets the na vdi pw a.
     * </pre>
     *
     * @param naVdiPwA the new na vdi pw a
     */
    public void setNaVdiPwA(String naVdiPwA) {
        this.naVdiPwA = naVdiPwA;
    }

    /**
     * <pre>
     * Gets the na vdi uri b.
     * </pre>
     *
     * @return the na vdi uri b
     */
    public String getNaVdiUriB() {
        return naVdiUriB;
    }

    /**
     * <pre>
     * Sets the na vdi uri b.
     * </pre>
     *
     * @param naVdiUriB the new na vdi uri b
     */
    public void setNaVdiUriB(String naVdiUriB) {
        this.naVdiUriB = naVdiUriB;
    }

    /**
     * <pre>
     * Gets the na vdi id b.
     * </pre>
     *
     * @return the na vdi id b
     */
    public String getNaVdiIdB() {
        return naVdiIdB;
    }

    /**
     * <pre>
     * Sets the na vdi id b.
     * </pre>
     *
     * @param naVdiIdB the new na vdi id b
     */
    public void setNaVdiIdB(String naVdiIdB) {
        this.naVdiIdB = naVdiIdB;
    }

    /**
     * <pre>
     * Gets the na vdi pw b.
     * </pre>
     *
     * @return the na vdi pw b
     */
    public String getNaVdiPwB() {
        return naVdiPwB;
    }

    /**
     * <pre>
     * Sets the na vdi pw b.
     * </pre>
     *
     * @param naVdiPwB the new na vdi pw b
     */
    public void setNaVdiPwB(String naVdiPwB) {
        this.naVdiPwB = naVdiPwB;
    }

    /**
     * <pre>
     * Gets the na bak uri a.
     * </pre>
     *
     * @return the na bak uri a
     */
    public String getNaBakUriA() {
        return naBakUriA;
    }

    /**
     * <pre>
     * Sets the na bak uri a.
     * </pre>
     *
     * @param naBakUriA the new na bak uri a
     */
    public void setNaBakUriA(String naBakUriA) {
        this.naBakUriA = naBakUriA;
    }

    /**
     * <pre>
     * Gets the na bak id a.
     * </pre>
     *
     * @return the na bak id a
     */
    public String getNaBakIdA() {
        return naBakIdA;
    }

    /**
     * <pre>
     * Sets the na bak id a.
     * </pre>
     *
     * @param naBakIdA the new na bak id a
     */
    public void setNaBakIdA(String naBakIdA) {
        this.naBakIdA = naBakIdA;
    }

    /**
     * <pre>
     * Gets the na bak pw a.
     * </pre>
     *
     * @return the na bak pw a
     */
    public String getNaBakPwA() {
        return naBakPwA;
    }

    /**
     * <pre>
     * Sets the na bak pw a.
     * </pre>
     *
     * @param naBakPwA the new na bak pw a
     */
    public void setNaBakPwA(String naBakPwA) {
        this.naBakPwA = naBakPwA;
    }

    
}
