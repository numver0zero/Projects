/*
 * Copyright (c) 2010 SKTelecom, Inc.
 * All right reserved.
 * 
 * This software is the confidential and proprietary information of SK Telecom
 * , Inc. You shall not disclose such Confidential Information and
 * shall use it only in accordance with the terms of the license agreement
 * you entered into with SKTelecom.
 */
package com.skt.tcc.virtualservicedomain.netapp.sevenmode.adapter;


import netapp.manage.NaServer;


// TODO: Auto-generated Javadoc
/**
 * <pre>
 * A factory for creating NetAppConnectionMngr objects.
 * 
 * Created on 2010. 8. 10
 * </pre>
 * 
 * @author Ë≠∞Í≥ïÏ±∏ÔßûÔø?ÔøΩÎ??æÔøΩÔø?*/
public class NetAppConnectionMngrFactory {

    /**
     * Creates a new NetAppConnectionMngr object.
     * 
     * @deprecated
     * @param mngr the mngr
     * @param serviceType the service type
     * @return the na server
     * @throws Exception the exception
     */
    public static NaServer createConnection(NetAppConnectionMngr mngr, String serviceType) throws Exception {

        if (serviceType.equals(AbstractNetAppConnection.NET_APP_CCH_A)) {
            return new NetAppConnection(mngr.getNaCchUriA(), mngr.getNaCchIdA(), mngr.getNaCchPwA()).createConnection();
        } else if (serviceType.equals(AbstractNetAppConnection.NET_APP_CCH_B)) {
            return new NetAppConnection(mngr.getNaCchUriB(), mngr.getNaCchIdB(), mngr.getNaCchPwB()).createConnection();
        } else if (serviceType.equals(AbstractNetAppConnection.NET_APP_VDI_A)) {
            return new NetAppConnection(mngr.getNaVdiUriA(), mngr.getNaVdiIdA(), mngr.getNaVdiPwA()).createConnection();
        } else if (serviceType.equals(AbstractNetAppConnection.NET_APP_VDI_B)) {
            return new NetAppConnection(mngr.getNaVdiUriB(), mngr.getNaVdiIdB(), mngr.getNaVdiPwB()).createConnection();
        } else if (serviceType.equals(AbstractNetAppConnection.NET_APP_BAK_A)) {
            return new NetAppConnection(mngr.getNaBakUriA(), mngr.getNaBakIdA(), mngr.getNaBakPwA()).createConnection();
        } else {
            return null;
        }
    }
    
    
    /**
     * Creates a new NetAppConnectionMngr object.
     *
     * @param uri the uri
     * @param id the id
     * @param pw the pw
     * @return the na server
     * @throws Exception the exception
     */
    public static NaServer createConnection(String uri, String id, String pw) throws Exception {

        return new NetAppConnection(uri, id, pw).createConnection();

    }
//    /**
//     * Creates a new NetAppConnectionMngr object.
//     * 
//     * @deprecated
//     * @param mngr the mngr
//     * @param netAppDynamicCon the net app dynamic con
//     * @return the na con vo
//     * @throws Exception the exception
//     */
//    public static NaConVo createDynamicConnection(NetAppConnectionMngr mngr, String netAppDynamicCon, String volumeName) throws ServiceException, SolutionException, Exception {
//
//        NaConVo naConVo = null;
//
//        if (netAppDynamicCon.equals(AbstractNetAppConnection.NET_APP_DYNAMIC_CCH)) {
//
//            naConVo = compareAvailSize(mngr, AbstractNetAppConnection.NET_APP_CCH_A,
//                    AbstractNetAppConnection.NET_APP_CCH_B, volumeName);
//
//        } else if (netAppDynamicCon.equals(AbstractNetAppConnection.NET_APP_DYNAMIC_VDI)) {
//
//            naConVo = compareAvailSize(mngr, AbstractNetAppConnection.NET_APP_VDI_A,
//                    AbstractNetAppConnection.NET_APP_VDI_B, volumeName);
//
//        }
//
//        return naConVo;
//    }
//
//    /**
//     * <pre>
//     * 1. Â™õÔøΩ?úÔøΩ?±Ïî† ÔßçÎ°ÆÔø??å‚ë¶?ÉÊø°?ªÏú≠ÔøΩÔøΩAggregates ÔøΩÎ∫§??//     * 2. ‰ª•Î¨ê?¨ÔøΩÔøΩVolumeÔßèÔøΩÔß£ÎåÑÍ≤ïÔøΩ?èÎø¨ ÔøΩ„ÖΩ??Ôß£ÏÑé??
//     * </pre>
//     * 
//     * @deprecated
//     * @param mngr the mngr
//     * @param netAppA the net app a
//     * @param netAppB the net app b
//     * @return the na con vo
//     * @throws Exception the exception
//     */
//    private static NaConVo compareAvailSize(NetAppConnectionMngr mngr, String netAppA, String netAppB, String volumeName) throws ServiceException, SolutionException {
//
//        try {
//            NaConVo naConVo = new NaConVo();
//
//            String naServerContext = null;
//            String aggregates = null;
//            Long aggrSize = null;
//
//            NetAppAdapter netAppAdapter = new NetAppAdapter();
//            
//            // ?å‚ë¶?ÉÊø°?ªÏú≠ 1Ë∏∞ÔøΩVolume ÔßèÔøΩÔß£ÎåÑÍ≤?//            List cchAVolumeList = netAppAdapter.searchVolumeCapity(netAppA);
//            
//            Iterator<CapityVo> cchAVolumeIter = cchAVolumeList.iterator();
//            
//            while(cchAVolumeIter.hasNext()){
//                
//                CapityVo capityVo = cchAVolumeIter.next();
//                
//                if (volumeName.equals(capityVo.getVolumeName())) {
//                    throw new ServiceException("netapp.volume.exist", "netapp.check.storage");
//                }
//            }
//            
//            // ?å‚ë¶?ÉÊø°?ªÏú≠ 2Ë∏∞ÔøΩVolume ÔßèÔøΩÔß£ÎåÑÍ≤?//            List cchBVolumeList = netAppAdapter.searchVolumeCapity(netAppB);
//            
//            Iterator<CapityVo> cchBVolumeIter = cchBVolumeList.iterator();
//            
//            while(cchBVolumeIter.hasNext()){
//                
//                CapityVo capityVo = cchBVolumeIter.next();
//                
//                if (volumeName.equals(capityVo.getVolumeName())) {
//                    throw new ServiceException("netapp.volume.exist", "netapp.check.storage");
//                }
//            }
//
//            // ?å‚ë¶?ÉÊø°?ªÏú≠ 1Ë∏∞ÔøΩÂ™õÔøΩ?úÔøΩÔøΩÔøΩÎ∫§Ïî§
//            List cchACapityList = netAppAdapter.searchStorageCapity(netAppA);
//
//            Iterator<CapityVo> cchACapityIter = cchACapityList.iterator();
//
//            while (cchACapityIter.hasNext()) {
//
//                CapityVo capityVo = cchACapityIter.next();
//
//                if (naServerContext == null) {
//                    naServerContext = netAppA;
//                    aggregates = capityVo.getAggregates();
//                    aggrSize = Long.parseLong(capityVo.getAvailable());
//                } else {
//                    if (aggrSize < Long.parseLong(capityVo.getAvailable())) {
//                        naServerContext = netAppA;
//                        aggregates = capityVo.getAggregates();
//                        aggrSize = Long.parseLong(capityVo.getAvailable());
//                    }
//                }
//            }
//
//            // ?å‚ë¶?ÉÊø°?ªÏú≠ 2Ë∏∞ÔøΩÂ™õÔøΩ?úÔøΩÔøΩÔøΩÎ∫§Ïî§
//            List cchBCapityList = netAppAdapter.searchStorageCapity(netAppB);
//
//            Iterator<CapityVo> cchBCapityIter = cchBCapityList.iterator();
//
//            while (cchBCapityIter.hasNext()) {
//
//                CapityVo capityVo = cchBCapityIter.next();
//
//                if (aggrSize < Long.parseLong(capityVo.getAvailable())) {
//                    naServerContext = netAppB;
//                    aggregates = capityVo.getAggregates();
//                    aggrSize = Long.parseLong(capityVo.getAvailable());
//                }
//            }
//
//            naConVo.setNaServerContext(naServerContext);
//            naConVo.setAggregates(aggregates);
//            naConVo.setAggrSize(aggrSize);
//
//            return naConVo;
//        } catch (ServiceException ex1) {
//            throw ex1;
//        } catch (Exception ex2) {
//            int errNo = 99999; 
//            if (ex2 instanceof NaAPIFailedException) {
//                errNo = ((NaAPIFailedException) ex2).getErrno();
//            }
//            throw new SolutionException("netapp.search.controller", SolutionType.NETAPP, String.valueOf(errNo), ex2);
//        }
//    }

}
