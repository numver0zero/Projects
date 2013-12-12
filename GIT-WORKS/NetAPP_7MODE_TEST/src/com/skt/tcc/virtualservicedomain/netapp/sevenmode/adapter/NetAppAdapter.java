package com.skt.tcc.virtualservicedomain.netapp.sevenmode.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import netapp.manage.NaAPIFailedException;
import netapp.manage.NaElement;
import netapp.manage.NaServer;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NetAppAdapter {

    private static final String CIFS_SHARE_DELETE_SET = "cifs-share-ace-delete";
    
    private static final String CIFS_SHARE_ACE_SET = "cifs-share-ace-set";

    private static final String CIFS_ACCESS_RIGHTS = "access-rights";

    private static final String CIFS_SHARE_ACE_SET_RWX = "rwx";
    
    private static final String CIFS_ACCESS_USER_NAME = "user-name";

    private static final String SNAPSHOT_PERCENT_RESERVED = "snapshot-percent-reserved";

    private static final String CIFS_IS_BROWSE_FALSE = "false";

    private static final String CIFS_IS_BROWSE = "is-browse";

    /** The Constant OPTION_VALUE. */
    private static final String OPTION_VALUE = "option-value";

    /** The Constant OPTION_NAME. */
    private static final String OPTION_NAME = "option-name";

    /** The Constant VOLUME_SET_OPTION. */
    private static final String VOLUME_SET_OPTION = "volume-set-option";

    /** The Constant AGGREGATE. */
    private static final String AGGREGATE = "aggregate";

    /** The Constant SNAPSHOT_SET_RESERVE. */
    private static final String SNAPSHOT_SET_RESERVE = "snapshot-set-reserve";

    /** The Constant PERCENTAGE. */
    private static final String PERCENTAGE = "percentage";

    /** The Constant FS_TYPE_NFS_VALUE. */
    public static final String FS_TYPE_NFS_VALUE = "NFS";

    /** The Constant FS_TYPE_CIFS_VALUE. */
    public static final String FS_TYPE_CIFS_VALUE = "CIFS";

    /** The Constant SIZE_UNIT. */
    private static final String SIZE_UNIT = "k";

    /** The Constant VOLUME_AUTOSIZE_SET. */
    private static final String VOLUME_AUTOSIZE_SET = "volume-autosize-set";

    /** The Constant MAXIMUM_SIZE. */
    private static final String MAXIMUM_SIZE = "maximum-size";

    /** The Constant VOLUME_AUTOSIZE_ENABLED. */
    private static final String VOLUME_AUTOSIZE_ENABLED = "true";

    /** The Constant IS_ENABLED. */
    private static final String IS_ENABLED = "is-enabled";

    /** The Constant INCREMENT_SIZE. */
    private static final String INCREMENT_SIZE = "increment-size";

    /** The Constant ACCESS_TIME. */
    private static final String ACCESS_TIME = "access-time";

    /** The Constant SNAPSHOTS. */
    private static final String SNAPSHOTS = "snapshots";

    /** The Constant TREE. */
    private static final String TREE = "tree";

    /** The Constant IS_AUTO_UPDATE_TRUE. */
    private static final String IS_AUTO_UPDATE_TRUE = "true";

    /** The Constant DEFAULT_QTREE_NAME. */
    private static final String DEFAULT_QTREE_NAME = "";

    /** The Constant SEC_FLAVOR_VALUE. */
    private static final String SEC_FLAVOR_VALUE = "sys";

    /** The Constant NEGATE_FALSE. */
    private static final String NEGATE_FALSE = CIFS_IS_BROWSE_FALSE;

    /** The Constant ALL_HOSTS_FALSE. */
    private static final String ALL_HOSTS_FALSE = CIFS_IS_BROWSE_FALSE;

    /** The Constant NOSUID_TRUE. */
    private static final String NOSUID_TRUE = "true";

    /** The Constant NFS_PERSISTENT_TRUE. */
    private static final String NFS_PERSISTENT_TRUE = "true";

    /** The Constant DEFAULT_QUOTA_TYPE_TREE. */
    private static final String DEFAULT_QUOTA_TYPE_TREE = TREE;

    /** The Constant QTREE_REMOVE_FORCE. */
    private static final String QTREE_REMOVE_FORCE = "true";

    /** The Constant FORCE2. */
    private static final String FORCE2 = "force";

    /** The Constant NEW_QTREE_NAME. */
    private static final String NEW_QTREE_NAME = "new-qtree-name";

    /** The Constant QTREE_RENAME. */
    private static final String QTREE_RENAME = "qtree-rename";

    /** The Constant QUOTA_RESIZE. */
    private static final String QUOTA_RESIZE = "quota-resize";

    /** The Constant SNAPVAULT_PRIMARY_INITIATE_RESTORE_TRANSFER. */
    private static final String SNAPVAULT_PRIMARY_INITIATE_RESTORE_TRANSFER = "snapvault-primary-initiate-restore-transfer";

    /** The Constant SNAPSHOT_LIST_INFO. */
    private static final String SNAPSHOT_LIST_INFO = "snapshot-list-info";

    /** The Constant CONFIGURATION2. */
    private static final String CONFIGURATION2 = "configuration";

    /** The Constant SCHEDULE2. */
    private static final String SCHEDULE2 = "schedule";

    /** The Constant SNAPVAULT_PRIMARY_SNAPSHOT_SCHEDULE_INFO. */
    private static final String SNAPVAULT_PRIMARY_SNAPSHOT_SCHEDULE_INFO = "snapvault-primary-snapshot-schedule-info";

    /** The Constant SNAPSHOT_SCHEDULE. */
    private static final String SNAPSHOT_SCHEDULE = "snapshot-schedule";

    /** The Constant SNAPVAULT_PRIMARY_SET_SNAPSHOT_SCHEDULE. */
    private static final String SNAPVAULT_PRIMARY_SET_SNAPSHOT_SCHEDULE = "snapvault-primary-set-snapshot-schedule";

    /** The Constant CIFS_SHARE_DELETE. */
    private static final String CIFS_SHARE_DELETE = "cifs-share-delete";

    /** The Constant CIFS_SHARE_ADD. */
    private static final String CIFS_SHARE_ADD = "cifs-share-add";

    /** The Constant NFS_EXPORTFS_LIST_RULES. */
    private static final String NFS_EXPORTFS_LIST_RULES = "nfs-exportfs-list-rules";

    /** The Constant NFS_EXPORTFS_MODIFY_RULE. */
    private static final String NFS_EXPORTFS_MODIFY_RULE = "nfs-exportfs-modify-rule";

    /** The Constant PATHNAME_INFO. */
    private static final String PATHNAME_INFO = "pathname-info";

    /** The Constant PATHNAMES2. */
    private static final String PATHNAMES2 = "pathnames";

    /** The Constant NFS_EXPORTFS_DELETE_RULES. */
    private static final String NFS_EXPORTFS_DELETE_RULES = "nfs-exportfs-delete-rules";

    /** The Constant SEC_FLAVOR_INFO. */
    private static final String SEC_FLAVOR_INFO = "sec-flavor-info";

    /** The Constant EXPORTS_HOSTNAME_INFO. */
    private static final String EXPORTS_HOSTNAME_INFO = "exports-hostname-info";

    /** The Constant READ_WRITE. */
    private static final String READ_WRITE = "read-write";

    /** The Constant EXPORTS_RULE_INFO. */
    private static final String EXPORTS_RULE_INFO = "exports-rule-info";

    /** The Constant RULES2. */
    private static final String RULES2 = "rules";

    /** The Constant RULE. */
    private static final String RULE = "rule";

    /** The Constant NFS_EXPORTFS_APPEND_RULES. */
    private static final String NFS_EXPORTFS_APPEND_RULES = "nfs-exportfs-append-rules";

    /** The Constant SHARE_NAME. */
    private static final String SHARE_NAME = "share-name";

    /** The Constant SEC_FLAVOR. */
    private static final String SEC_FLAVOR = "sec-flavor";

    /** The Constant NEGATE2. */
    private static final String NEGATE2 = "negate";

    /** The Constant ALL_HOSTS. */
    private static final String ALL_HOSTS = "all-hosts";

    /** The Constant NOSUID2. */
    private static final String NOSUID2 = "nosuid";

    /** The Constant PATHNAME2. */
    private static final String PATHNAME2 = "pathname";

    /** The Constant RULES. */
    private static final String RULES = RULES2;

    /** The Constant PERSISTENT. */
    private static final String PERSISTENT = "persistent";

    /** The Constant SECONDARY_SYSTEM. */
    private static final String SECONDARY_SYSTEM = "secondary-system";

    /** The Constant SECONDARY_SNAPSHOT. */
    private static final String SECONDARY_SNAPSHOT = "secondary-snapshot";

    /** The Constant PRIMARY_SYSTEM. */
    private static final String PRIMARY_SYSTEM = "primary-system";

    /** The Constant PRIMARY_PATH. */
    private static final String PRIMARY_PATH = "primary-path";

    /** The Constant SNAPVAULT_CONFIGURATION_INFO. */
    private static final String SNAPVAULT_CONFIGURATION_INFO = "snapvault-configuration-info";

    /** The Constant SNAPVAULT_SECONDARY_CREATE_RELATIONSHIP. */
    private static final String SNAPVAULT_SECONDARY_CREATE_RELATIONSHIP = "snapvault-secondary-create-relationship";

    /** The Constant HOURS_OF_DAY. */
    private static final String HOURS_OF_DAY = "hours-of-day";

    /** The Constant DAYS_OF_WEEK. */
    private static final String DAYS_OF_WEEK = "days-of-week";

    /** The Constant SNAPVAULT_SCHEDULE_INFO. */
    private static final String SNAPVAULT_SCHEDULE_INFO = "snapvault-schedule-info";

    /** The Constant RETENTION_COUNT. */
    private static final String RETENTION_COUNT = "retention-count";

    /** The Constant IS_AUTO_UPDATE. */
    private static final String IS_AUTO_UPDATE = "is-auto-update";

    /** The Constant SNAPVAULT_SECONDARY_SNAPSHOT_SCHEDULE_INFO. */
    private static final String SNAPVAULT_SECONDARY_SNAPSHOT_SCHEDULE_INFO = "snapvault-secondary-snapshot-schedule-info";

    /** The Constant SNAPVAULT_SECONDARY_SET_SNAPSHOT_SCHEDULE. */
    private static final String SNAPVAULT_SECONDARY_SET_SNAPSHOT_SCHEDULE = "snapvault-secondary-set-snapshot-schedule";

    /** The Constant SNAPVAULT_SECONDARY_DELETE_RELATIONSHIP. */
    private static final String SNAPVAULT_SECONDARY_DELETE_RELATIONSHIP = "snapvault-secondary-delete-relationship";

    /** The Constant SECONDARY_PATH. */
    private static final String SECONDARY_PATH = "secondary-path";

    /** The Constant SNAPVAULT_SECONDARY_DELETE_SNAPSHOT_SCHEDULE. */
    private static final String SNAPVAULT_SECONDARY_DELETE_SNAPSHOT_SCHEDULE = "snapvault-secondary-delete-snapshot-schedule";

    /** The Constant VOLUME_NAME. */
    private static final String VOLUME_NAME = "volume-name";

    /** The Constant SCHEDULE_NAME. */
    private static final String SCHEDULE_NAME = "schedule-name";

    /** The Constant TARGET_TYPE. */
    private static final String TARGET_TYPE = "target-type";

    /** The Constant TARGET_NAME. */
    private static final String TARGET_NAME = "target-name";

    /** The Constant QTREES. */
    private static final String QTREES = "qtrees";

    /** The Constant QTREE_LIST. */
    private static final String QTREE_LIST = "qtree-list";

    /** The Constant PATH2. */
    private static final String PATH2 = "path";

    /** The Constant QUOTAS. */
    private static final String QUOTAS = "quotas";

    /** The Constant QUOTA. */
    private static final String QUOTA = "quota";

    /** The Constant DISK_USED. */
    private static final String DISK_USED = "disk-used";

    /** The Constant QUOTA_REPORT. */
    private static final String QUOTA_REPORT = "quota-report";

    /** The Constant PERCENTAGE_USED. */
    private static final String PERCENTAGE_USED = "percentage-used";

    /** The Constant VOLUME_LIST_INFO. */
    private static final String VOLUME_LIST_INFO = "volume-list-info";

    /** The Constant VOLUMES. */
    private static final String VOLUMES = "volumes";

    /** The Constant AGGR_INFO. */
    private static final String AGGR_INFO = "aggr-info";

    /** The Constant AGGREGATES. */
    private static final String AGGREGATES = "aggregates";

    /** The Constant SIZE_AVAILABLE. */
    private static final String SIZE_AVAILABLE = "size-available";
    
    /** The Constant VOLUME. */
    private static final String VOLUME_COUNT = "volume-count";

    /** The Constant SIZE_PERCENTAGE_USED. */
    private static final String SIZE_PERCENTAGE_USED = "size-percentage-used";

    /** The Constant SIZE_USED. */
    private static final String SIZE_USED = "size-used";

    /** The Constant SIZE_TOTAL. */
    private static final String SIZE_TOTAL = "size-total";

    /** The Constant AGGR_LIST_INFO. */
    private static final String AGGR_LIST_INFO = "aggr-list-info";

    /** The Constant QUOTA_TARGET. */
    private static final String QUOTA_TARGET = "quota-target";

    /** The Constant QUOTA_TYPE. */
    private static final String QUOTA_TYPE = "quota-type";

    /** The Constant NEW_SIZE. */
    private static final String NEW_SIZE = "new-size";

    /** The Constant NAME. */
    private static final String NAME = "name";

    /** The Constant logger. */
    private static final Log logger = LogFactory.getLog(NetAppAdapter.class);

    /** The Constant FILE_LIMIT. */
    private static final String FILE_LIMIT = "file-limit";

    /** The Constant DISK_LIMIT. */
    private static final String DISK_LIMIT = "disk-limit";

    /** The Constant QTREE. */
    private static final String QTREE = "qtree";

    /** The Constant SIZE. */
    private static final String SIZE = "size";

    /** The Constant CONTAINING_AGGR_NAME. */
    private static final String CONTAINING_AGGR_NAME = "containing-aggr-name";

    /** The Constant VOLUME. */
    private static final String VOLUME = "volume";

    /** The Constant VOLUME_CREATE. */
    private static final String VOLUME_CREATE = "volume-create";

    /** The Constant VOLUME_OFFLINE. */
    private static final String VOLUME_OFFLINE = "volume-offline";

    /** The Constant VOLUME_DESTORY. */
    private static final String VOLUME_DESTORY = "volume-destroy";

    /** The Constant VOLUME_SIZE. */
    private static final String VOLUME_SIZE = "volume-size";

    /** The Constant QTREE_CREATE. */
    private static final String QTREE_CREATE = "qtree-create";

    /** The Constant QTREE_DELETE. */
    private static final String QTREE_DELETE = "qtree-delete";

    /** The Constant QUOTA_ADD. */
    private static final String QUOTA_ADD = "quota-add-entry";

    /** The Constant QUOTA_ON. */
    private static final String QUOTA_ON = "quota-on";

    /** The Constant QUOTA_DELETE. */
    private static final String QUOTA_DELETE = "quota-delete-entry";

    /** The Constant QUOTA_OFF. */
    private static final String QUOTA_OFF = "quota-off";

    /** The Constant QUOTA_RESIZE. */
    private static final String QUOTA_MODIFY = "quota-modify-entry";

    /**
     * <pre>
     * Instantiates a new net app adapter.
     * </pre>
     */
    public NetAppAdapter() {
    }

    /**
     * <pre>
     * Assign disk.
     * </pre>
     * 
     * @param id the id
     */
    public void assignDisk(String id) {

    }

    /**
     * <pre>
     * Removes the disk.
     * </pre>
     */
    public void removeDisk() {

    }

    /**
     * <pre>
     * Backup disk.
     * </pre>
     */
    public void backupDisk() {

    }

    /*
     * *************************************************************************
     * ********************** 볼륨 생성 삭제 리사이징 백업
     * **************************************************************
     */

    /**
     * <pre>
     * 1. 호스팅 사용자에게 추가 Disk 최초 제공
     * 2. SMB의 A/D 그룹별 볼륨 생성
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param aggrName the aggr name
     * @param volumeSize the volume size
     * @throws Exception the solution exception
     */
    public void assignVolume(CtrlrInfoVo ctrlrInfoVo, String volumeName, String aggrName, String volumeSize)
            throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(VOLUME_CREATE);

            inputNaElement.addNewChild(VOLUME, volumeName);
            inputNaElement.addNewChild(CONTAINING_AGGR_NAME, aggrName);
            inputNaElement.addNewChild(SIZE, volumeSize + SIZE_UNIT);
            
            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug("Volume 생성 : " + VOLUME + " (" + volumeName + "), " + CONTAINING_AGGR_NAME + " ("
                        + aggrName + "), " + SIZE + " (" + volumeSize + ") success.");
                // logger.debug(VOLUME + " : " + volumeName);
                // logger.debug(CONTAINING_AGGR_NAME + " : " + aggrName);
                // logger.debug(SIZE + " : " + volumeSize);
                // logger.debug(VOLUME_CREATE + " : success.");
            }
//            } catch (NaAuthenticationException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (NaAPIFailedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (NaProtocolException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            } catch (IOException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * 1. 볼륨 오프라인 : 호스팅 사용자의 추가 Disk 제거 1단계
     * 2. 볼륨 오프라인 : SMB의 A/D 그룹별 볼륨 제거 1단계
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void offlineVolume(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            // offline
            NaElement inputNaElement = new NaElement(VOLUME_OFFLINE);

            inputNaElement.addNewChild(NAME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
                logger.debug("Volume 오프라인 : " + NAME + " (" + volumeName + ") success.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * 1. 볼륨 삭제 : 호스팅 사용자의 추가 Disk 제거 2단계
     * 2. 볼륨 삭제 : SMB의 A/D 그룹별 볼륨 제거 2단계
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void removeVolume(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            // destory
            NaElement inputNaElement = new NaElement(VOLUME_DESTORY);

            inputNaElement.addNewChild(NAME, volumeName);
            
            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug("Volume 삭제 : " + NAME + " (" + volumeName + ") success.");
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * Backup volume.
     * </pre>
     * 
     * @param userID the user id
     */
    public void backupVolume(String userID) {

    }

    /**
     * <pre>
     * 1. 호스팅 사용자가 사용중인 추가 Disk에 신규 용량 Add
     * 2. 호스팅 사용자의 추가 Disk의 용량 일부분 회수(TODO 회수전 조회 기능 추가 필요)
     * 3. SMB의 A/D 그룹별 볼륨 용량 확장
     * 4. SMB의 A/D 그룹별 볼륨 용량 회수(TODO 회수전 조회 기능 추가 필요)
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param volumeSize the volume size
     * @throws Exception the solution exception
     */
    public void resizeVolume(CtrlrInfoVo ctrlrInfoVo, String volumeName, String volumeSize) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(VOLUME_SIZE);

            inputNaElement.addNewChild(VOLUME, volumeName);
            inputNaElement.addNewChild(NEW_SIZE, volumeSize + SIZE_UNIT);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(NEW_SIZE + " : " + volumeSize);
                logger.debug(VOLUME_SIZE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * . Snapshot 영역의 여유 퍼센트
     * 백업 미사용시 percentage 를 0 으로 한다.
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param percentage the percentage
     * @throws Exception the solution exception
     */
    public void snapReserve(CtrlrInfoVo ctrlrInfoVo, String volumeName, String percentage) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(SNAPSHOT_SET_RESERVE);

            inputNaElement.addNewChild(PERCENTAGE, percentage);
            inputNaElement.addNewChild(VOLUME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(PERCENTAGE + " : " + percentage);
                logger.debug(SNAPSHOT_SET_RESERVE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * 볼륨 옵션 지정
     * 1. 생성된 볼륨의 snapshot 기능 제거 "nosnap" (value: "on" | "off")
     * 2. 사용자에게 .snapshot 디렉토리를 보이지 않게 적용 "nosnapdir" (value: "on" | "off")
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param optionName the option name
     * @param optionValue the option value
     * @throws Exception the solution exception
     */
    public void volumeOption(CtrlrInfoVo ctrlrInfoVo, String volumeName, String optionName, String optionValue)
            throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(VOLUME_SET_OPTION);

            inputNaElement.addNewChild(OPTION_NAME, optionName);
            inputNaElement.addNewChild(OPTION_VALUE, optionValue);
            inputNaElement.addNewChild(VOLUME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(OPTION_NAME + " : " + optionName);
                logger.debug(OPTION_VALUE + " : " + optionValue);
                logger.debug(SNAPSHOT_SET_RESERVE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * 볼륨 오토 사이즈 설정.
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param volumeMaxSize the volume max size
     * @param volumeIncrementSize the volume increment size
     * @throws Exception the solution exception
     */
    public void autosizeVolume(CtrlrInfoVo ctrlrInfoVo, String volumeName, String volumeMaxSize, String volumeIncrementSize)
            throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(VOLUME_AUTOSIZE_SET);

            inputNaElement.addNewChild(INCREMENT_SIZE, volumeIncrementSize + SIZE_UNIT);
            inputNaElement.addNewChild(IS_ENABLED, VOLUME_AUTOSIZE_ENABLED);
            inputNaElement.addNewChild(MAXIMUM_SIZE, volumeMaxSize + SIZE_UNIT);
            inputNaElement.addNewChild(VOLUME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(INCREMENT_SIZE + " : " + volumeIncrementSize + SIZE_UNIT);
                logger.debug(MAXIMUM_SIZE + " : " + volumeMaxSize + SIZE_UNIT);
                logger.debug(VOLUME_SIZE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /*
     * *************************************************************************
     * ********************** 큐트리 생성 삭제 백업
     * **************************************
     */

    /**
     * <pre>
     * 큐트리 생성
     * SMB 사용자에게 SMB그룹 볼륨에서 Disk 최초 제공 1단계
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param qtreeName the qtree path
     * @throws Exception the solution exception
     */
    public void assignQTree(CtrlrInfoVo ctrlrInfoVo, String volumeName, String qtreeName) throws Exception {
        NaServer naServer = null;

        logger.debug("========= NetAppAdapter ===========");
        logger.debug("volumeName : " + volumeName);
        logger.debug("qtreeName : " + qtreeName);
        logger.debug("IP : " + ctrlrInfoVo.getStrgIp());
        logger.debug("ip : " + ctrlrInfoVo.getId());
        logger.debug("pwd : " + ctrlrInfoVo.getPasswd());
        logger.debug("========= NetAppAdapter ===========");
        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QTREE_CREATE);

            inputNaElement.addNewChild(VOLUME, volumeName);
            inputNaElement.addNewChild(QTREE, qtreeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            logger.debug("========= before ===========");
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);
            logger.debug("========= after ===========");
            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(QTREE + " : " + qtreeName);
                logger.debug(QTREE_CREATE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * 큐트리 삭제
     * SMB 사용자에게 제공된 Disk 삭제 2단계
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param qtreePath the qtree path
     * @throws Exception the solution exception
     */
    public void removeQTree(CtrlrInfoVo ctrlrInfoVo, String qtreePath) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QTREE_DELETE);

            inputNaElement.addNewChild(FORCE2, QTREE_REMOVE_FORCE);
            inputNaElement.addNewChild(QTREE, qtreePath);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(QTREE + " : " + qtreePath);
                logger.debug(QTREE_DELETE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * 큐트리 리네임
     * 임의의 큐트리 명으로 생성된 이름을 AD 계정 최초 접속시 변경
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param newQtreePath the new qtree path
     * @param qtreePath the qtree path
     * @throws Exception the solution exception
     */
    public void renameQTree(CtrlrInfoVo ctrlrInfoVo, String newQtreePath, String qtreePath) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QTREE_RENAME);

            inputNaElement.addNewChild(NEW_QTREE_NAME, newQtreePath);
            inputNaElement.addNewChild(QTREE, qtreePath);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(NEW_QTREE_NAME + " : " + newQtreePath);
                logger.debug(QTREE + " : " + qtreePath);
                logger.debug(QTREE_DELETE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * Backup q tree.
     * </pre>
     * 
     * @param userID the user id
     */
    public void backupQTree(String userID) {

    }

    /*
     * *************************************************************************
     * ********************** 쿼터 생성 삭제 수정, on/off
     * *******************************
     * *****************************************************************.
     */

    /**
     * <pre>
     * 쿼터 생성
     * SMB 사용자에게 SMB그룹 볼륨에서 Disk 최초 제공 2단계
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param quotaTarget the quota target
     * @param diskLimit the disk limit
     * @throws Exception the solution exception
     */
    public void assignQuota(CtrlrInfoVo ctrlrInfoVo, String volumeName, String quotaTarget, String diskLimit)
            throws Exception {

        NaServer naServer = null;

        try {
            // quota add
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QUOTA_ADD);

            inputNaElement.addNewChild(VOLUME, volumeName);
            inputNaElement.addNewChild(QTREE, DEFAULT_QTREE_NAME);
            inputNaElement.addNewChild(QUOTA_TARGET, quotaTarget);
            inputNaElement.addNewChild(QUOTA_TYPE, DEFAULT_QUOTA_TYPE_TREE);
            inputNaElement.addNewChild(DISK_LIMIT, diskLimit + SIZE_UNIT);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            // // quota on
            // inputNaElement = new NaElement(QUOTA_ON);
            // inputNaElement.addNewChild(VOLUME, volumeName);
            // outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(QTREE + " : " + DEFAULT_QTREE_NAME);
                logger.debug(DISK_LIMIT + " : " + diskLimit);
                logger.debug(QUOTA_ADD + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * On quata.
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void onQuota(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {
            // quota on
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QUOTA_ON);
            inputNaElement.addNewChild(VOLUME, volumeName);
            
            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(QUOTA_ON + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * Off quata.
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void offQuota(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {
            // quota off
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QUOTA_OFF);
            inputNaElement.addNewChild(VOLUME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(QUOTA_OFF + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * resize quata.
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void resizeQuota(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {
            // quota resize
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QUOTA_RESIZE);
            inputNaElement.addNewChild(VOLUME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(QUOTA_RESIZE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * 쿼터 삭제
     * SMB 사용자에게 제공한 Disk 삭제 1단계
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param quotaTarget the quota target
     * @throws Exception the solution exception
     */
    public void removeQuota(CtrlrInfoVo ctrlrInfoVo, String volumeName, String quotaTarget) throws Exception {
        NaServer naServer = null;

        try {

            // quota delete
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QUOTA_DELETE);

            inputNaElement.addNewChild(VOLUME, volumeName);
            inputNaElement.addNewChild(QTREE, DEFAULT_QTREE_NAME);
            inputNaElement.addNewChild(QUOTA_TARGET, quotaTarget);
            inputNaElement.addNewChild(QUOTA_TYPE, DEFAULT_QUOTA_TYPE_TREE);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(QTREE + " : " + DEFAULT_QTREE_NAME);
                logger.debug(QUOTA_DELETE + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * 1. SMB 사용자에게 제공한 Disk 에 SMB 그룹 볼륨에서 용량 확장
     * 2. SMB 사용자에게 제공한 Disk 용량 회수(TODO 회수전 쿼터 조회 필요)
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param quotaTarget the quota target
     * @param diskLimit the disk limit
     * @throws Exception the solution exception
     */
    public void modifyQuota(CtrlrInfoVo ctrlrInfoVo, String volumeName, String quotaTarget, String diskLimit)
            throws Exception {

        NaServer naServer = null;

        try {

            // quota modify
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QUOTA_MODIFY);

            inputNaElement.addNewChild(VOLUME, volumeName);
            inputNaElement.addNewChild(QTREE, DEFAULT_QTREE_NAME);
            inputNaElement.addNewChild(QUOTA_TARGET, quotaTarget);
            inputNaElement.addNewChild(QUOTA_TYPE, DEFAULT_QUOTA_TYPE_TREE);
            inputNaElement.addNewChild(DISK_LIMIT, diskLimit);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(QTREE + " : " + DEFAULT_QTREE_NAME);
                logger.debug(DISK_LIMIT + " : " + diskLimit);
                logger.debug(QUOTA_ADD + " : success.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /*
     * *************************************************************************
     * ********************** 백업 및 복구
     * *******************************************
     * *****************************************************.
     */

    /**
     * <pre>
     * Primary NAS - 백업용 볼륨스냅샷 생성 스케쥴 정의
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param scheduleName the schedule name
     * @param retensionCount the retension count
     * @param daysOfWeek the days of week
     * @param hoursOfDay the hours of day
     * @throws Exception the solution exception
     */
    public void defineBackupPrimarySchedule(CtrlrInfoVo ctrlrInfoVo, String volumeName, String scheduleName,
            String retensionCount, String daysOfWeek, String hoursOfDay) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(SNAPVAULT_PRIMARY_SET_SNAPSHOT_SCHEDULE);

            NaElement snapshotSchedule = makeSnapshotSchedule(volumeName, scheduleName, retensionCount, daysOfWeek,
                    hoursOfDay);

            inputNaElement.addChildElem(snapshotSchedule);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(SCHEDULE_NAME + " : " + scheduleName);
                logger.debug(RETENTION_COUNT + " : " + retensionCount);
                logger.debug(DAYS_OF_WEEK + " : " + daysOfWeek);
                logger.debug(HOURS_OF_DAY + " : " + hoursOfDay);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * Make snapshot schedule.
     * </pre>
     * 
     * @param volumeName the volume name
     * @param scheduleName the schedule name
     * @param retensionCount the retension count
     * @param daysOfWeek the days of week
     * @param hoursOfDay the hours of day
     * @return the na element
     */
    private NaElement makeSnapshotSchedule(String volumeName, String scheduleName, String retensionCount,
            String daysOfWeek, String hoursOfDay) {

        NaElement snapshotSchedule = new NaElement(SNAPSHOT_SCHEDULE);

        NaElement info = new NaElement(SNAPVAULT_PRIMARY_SNAPSHOT_SCHEDULE_INFO);

        info.addNewChild(RETENTION_COUNT, retensionCount);

        NaElement scheduleInfo = makeScheduleInfo(daysOfWeek, hoursOfDay);
        info.addChildElem(scheduleInfo);

        info.addNewChild(SCHEDULE_NAME, scheduleName);

        info.addNewChild(VOLUME_NAME, volumeName);

        snapshotSchedule.addChildElem(info);

        return snapshotSchedule;
    }

    /**
     * <pre>
     * Make schedule info.
     * </pre>
     * 
     * @param daysOfWeek the days of week
     * @param hoursOfDay the hours of day
     * @return the na element
     */
    private NaElement makeScheduleInfo(String daysOfWeek, String hoursOfDay) {

        NaElement schedule = new NaElement(SCHEDULE2);

        NaElement scheduleInfo = new NaElement(SNAPVAULT_SCHEDULE_INFO);
        scheduleInfo.addNewChild(DAYS_OF_WEEK, daysOfWeek);
        scheduleInfo.addNewChild(HOURS_OF_DAY, hoursOfDay);

        schedule.addChildElem(scheduleInfo);

        return schedule;
    }

    /**
     * <pre>
     * Primary NAS와 Secondary NAS간 Full backup 시작
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param primaryPath the primary path
     * @param primarySystem the primary system
     * @param secondaryPath the secondary path
     * @throws Exception the solution exception
     */
    public void relationshipBackupSchedule(CtrlrInfoVo ctrlrInfoVo, String primaryPath, String primarySystem,
            String secondaryPath) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(SNAPVAULT_SECONDARY_CREATE_RELATIONSHIP);

            NaElement configuration = makeConfiguration(primaryPath, primarySystem, secondaryPath);
            inputNaElement.addChildElem(configuration);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(PRIMARY_PATH + " : " + primaryPath);
                logger.debug(PRIMARY_SYSTEM + " : " + primarySystem);
                logger.debug(SECONDARY_PATH + " : " + secondaryPath);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * Make configuration.
     * </pre>
     * 
     * @param primaryPath the primary path
     * @param primarySystem the primary system
     * @param secondaryPath the secondary path
     * @return the na element
     */
    private NaElement makeConfiguration(String primaryPath, String primarySystem, String secondaryPath) {

        NaElement configuration = new NaElement(CONFIGURATION2);

        NaElement configInfo = new NaElement(SNAPVAULT_CONFIGURATION_INFO);
        configInfo.addNewChild(PRIMARY_PATH, primaryPath);
        configInfo.addNewChild(PRIMARY_SYSTEM, primarySystem);
        configInfo.addNewChild(SECONDARY_PATH, secondaryPath);
        // configInfo.addNewChild("tries-count", ""); // snapvault 실패시 시도 횟수

        configuration.addChildElem(configInfo);

        return configuration;
    }

    /**
     * <pre>
     * 1. Secondary NAS에 백업스케쥴(정책) 정의
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param retensionCount the retension count
     * @param daysOfWeek the days of week
     * @param hoursOfDay the hours of day
     * @param volumeName the volume name
     * @param scheduleName the schedule name
     * @throws Exception the solution exception
     */
    public void defineBackupSecondSchedule(CtrlrInfoVo ctrlrInfoVo, String retensionCount, String daysOfWeek,
            String hoursOfDay, String volumeName, String scheduleName) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(SNAPVAULT_SECONDARY_SET_SNAPSHOT_SCHEDULE);

            NaElement snapshotSchedule = makeSecondarySnapshotSchedule(IS_AUTO_UPDATE_TRUE, retensionCount, daysOfWeek,
                    hoursOfDay, volumeName, scheduleName);

            inputNaElement.addChildElem(snapshotSchedule);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(SCHEDULE_NAME + " : " + scheduleName);
                logger.debug(IS_AUTO_UPDATE + " : " + IS_AUTO_UPDATE_TRUE);
                logger.debug(RETENTION_COUNT + " : " + retensionCount);
                logger.debug(DAYS_OF_WEEK + " : " + daysOfWeek);
                logger.debug(HOURS_OF_DAY + " : " + hoursOfDay);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * Make secondary snapshot schedule.
     * </pre>
     * 
     * @param isAutoUpdate the is auto update
     * @param retensionCount the retension count
     * @param daysOfWeek the days of week
     * @param hoursOfDay the hours of day
     * @param volumeName the volume name
     * @param scheduleName the schedule name
     * @return the na element
     */
    private NaElement makeSecondarySnapshotSchedule(String isAutoUpdate, String retensionCount, String daysOfWeek,
            String hoursOfDay, String volumeName, String scheduleName) {

        NaElement snapshotSchedule = new NaElement(SNAPSHOT_SCHEDULE);

        NaElement info = new NaElement(SNAPVAULT_SECONDARY_SNAPSHOT_SCHEDULE_INFO);

        info.addNewChild(IS_AUTO_UPDATE, isAutoUpdate);

        info.addNewChild(RETENTION_COUNT, retensionCount); // snapshot 저장 갯수

        NaElement scheduleInfo = makeScheduleInfo(daysOfWeek, hoursOfDay);
        info.addChildElem(scheduleInfo);

        info.addNewChild(SCHEDULE_NAME, scheduleName);

        info.addNewChild(VOLUME_NAME, volumeName);

        snapshotSchedule.addChildElem(info);

        return snapshotSchedule;
    }

    /**
     * <pre>
     * 1. Secondary NAS에 백업 정책 제거(스케쥴 변경)
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param scheduleName the schedule name
     * @throws Exception the solution exception
     */
    public void deleteBackupSecondSchedule(CtrlrInfoVo ctrlrInfoVo, String volumeName, String scheduleName)
            throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            
            if(logger.isDebugEnabled()) {
                logger.debug("kkt3");
                logger.debug("getStrgIp (" + ctrlrInfoVo.getStrgIp() +")");  
                logger.debug("getId (" + ctrlrInfoVo.getId() +")");  
                logger.debug("ctrlrInfoVo (" + ctrlrInfoVo.getPasswd() +")");  
            }
            
            
            NaElement inputNaElement = new NaElement(SNAPVAULT_SECONDARY_DELETE_SNAPSHOT_SCHEDULE);

            inputNaElement.addNewChild(SCHEDULE_NAME, scheduleName);

            inputNaElement.addNewChild(VOLUME_NAME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(SCHEDULE_NAME + " : " + scheduleName);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * 2. Secondary NAS에 백업 정책 제거(스케쥴 변경)
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param secondaryPath the secondary path
     * @throws Exception the solution exception
     */
    public void deleteRelationshipBackupSecond(CtrlrInfoVo ctrlrInfoVo, String secondaryPath) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());
            
            if(logger.isDebugEnabled()) {
                logger.debug("kkt_re3");
                logger.debug("getStrgIp (" + ctrlrInfoVo.getStrgIp() +")");  
                logger.debug("getId (" + ctrlrInfoVo.getId() +")");  
                logger.debug("ctrlrInfoVo (" + ctrlrInfoVo.getPasswd() +")");  
            }
            
            NaElement inputNaElement = new NaElement(SNAPVAULT_SECONDARY_DELETE_RELATIONSHIP);

            inputNaElement.addNewChild(SECONDARY_PATH, secondaryPath);

            if (logger.isDebugEnabled()) {
            	logger.debug("kkt_re4");   
            	logger.debug(inputNaElement.toPrettyString(""));
                logger.debug(SECONDARY_PATH + " : " + secondaryPath);
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(SECONDARY_PATH + " : " + secondaryPath);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * 3. Primary NAS에 백업 정책 제거(스케쥴 변경)
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param scheduleName the schedule name
     * @throws Exception the solution exception
     */
    public void deleteBackupPrimarySchedule(CtrlrInfoVo ctrlrInfoVo, String volumeName, String scheduleName)
            throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement("snapvault-primary-delete-snapshot-schedule");

            inputNaElement.addNewChild(SCHEDULE_NAME, scheduleName);

            inputNaElement.addNewChild(VOLUME_NAME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(VOLUME + " : " + volumeName);
                logger.debug(SCHEDULE_NAME + " : " + scheduleName);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * primary schedule 조회
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void searchDefinePrimarySchedule(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement("snapvault-primary-snapshot-schedule-list-info");

            if (!"".equals(volumeName)) {
                inputNaElement.addNewChild(VOLUME_NAME, volumeName);
            }

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * primary schedule 상태 조회
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void searchPrimaryScheduleStatus(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement("snapvault-primary-snapshot-schedule-status-list-info");

            if (!"".equals(volumeName)) {
                inputNaElement.addNewChild(VOLUME_NAME, volumeName);
            }

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * secondary schedule 조회
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void searchDefineSecondarySchedule(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement("snapvault-secondary-snapshot-schedule-list-info");

            if (!"".equals(volumeName)) {
                inputNaElement.addNewChild(VOLUME_NAME, volumeName);
            }

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * secondary schedule 상태 조회
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void searchSecondaryScheduleStatus(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement("snapvault-secondary-snapshot-schedule-status-list-info");

            if (!"".equals(volumeName)) {
                inputNaElement.addNewChild(VOLUME_NAME, volumeName);
            }

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * 1. 백업 목록 조회
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @return the list
     * @throws Exception the solution exception
     */
    public List<SnapshotVo> searchBackupList(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        List<SnapshotVo> list = new ArrayList<SnapshotVo>();

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(SNAPSHOT_LIST_INFO);

            inputNaElement.addNewChild(TARGET_NAME, volumeName);
            inputNaElement.addNewChild(TARGET_TYPE, VOLUME);
            
            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);
            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
            }

            List snapList = outputNaElement.getChildByName(SNAPSHOTS).getChildren();

            Iterator<NaElement> iter = snapList.iterator();
            while (iter.hasNext()) {
                SnapshotVo vo = new SnapshotVo();
                NaElement snapshotInfo = iter.next();
                vo.setName(snapshotInfo.getChildContent(NAME));
                vo.setAccessTime(snapshotInfo.getChildContent(ACCESS_TIME));
                if (logger.isDebugEnabled()) {
                    logger.debug("SNAPSHOT NAME" + " : " + vo.getName());
                    logger.debug("SNAPSHOT ACCESS TIME" + " : " + vo.getAccessTime());
                }
                list.add(vo);
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;

    }

    /**
     * <pre>
     * snapshot 복구.
     * </pre>
     * 
     * @param serviceType the service type
     * @param primaryPath the primary path
     * @param secondaryPath the secondary path
     * @param secondarySnapshot the secondary snapshot
     * @param secondarySystem the secondary system
     * @throws Exception the solution exception
     */
    public void restoreSnapshot(CtrlrInfoVo ctrlrInfoVo, String primaryPath, String secondaryPath, String secondarySnapshot,
            String secondarySystem) throws Exception {

        NaServer naServer = null;

        try {

            // 스냅샷 복구
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(SNAPVAULT_PRIMARY_INITIATE_RESTORE_TRANSFER);
            // NaElement inputNaElement = new
            // NaElement("snapvault-primary-initiate-incremental-restore-transfer");

            inputNaElement.addNewChild(PRIMARY_PATH, primaryPath);
            inputNaElement.addNewChild(SECONDARY_PATH, secondaryPath);
            inputNaElement.addNewChild(SECONDARY_SNAPSHOT, secondarySnapshot);
            inputNaElement.addNewChild(SECONDARY_SYSTEM, secondarySystem);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(PRIMARY_PATH + " : " + primaryPath);
                logger.debug(SECONDARY_PATH + " : " + secondaryPath);
                logger.debug(SECONDARY_SNAPSHOT + " : " + secondarySnapshot);
                logger.debug(SECONDARY_SYSTEM + " : " + secondarySystem);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    

    /**
     * <pre>
     * Primary snapshot 삭제.
     * </pre>
     *
     * @param ctrlrInfoVo the ctrlr info vo
     * @param snapshot the snapshot
     * @param volumeName the volume name
     * @throws Exception the solution exception
     */
    public void removeSnapshot(CtrlrInfoVo ctrlrInfoVo, String snapshot, String volumeName) throws Exception {

        NaServer naServer = null;

        try {

            // 스냅샷 삭제
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement("snapshot-delete");

            inputNaElement.addNewChild("snapshot", snapshot);
            inputNaElement.addNewChild(VOLUME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug("snapshot" + " : " + snapshot);
                logger.debug(VOLUME + " : " + volumeName);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * <pre>
     * Secondary NAS에 복구 release
     * </pre>
     * 
     * @param ctrlrInfoVo the ctrlr info vo
     * @param primaryPath the primary path
     * @param primarySystem the primary system
     * @param secondaryPath the secondary path
     * @throws Exception the solution exception
     */
    public void releaseRelationshipBackupSecond(CtrlrInfoVo ctrlrInfoVo, String primaryPath, String primarySystem, String secondaryPath) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement("snapvault-secondary-release-relationship");

            inputNaElement.addNewChild(PRIMARY_PATH, primaryPath);
            inputNaElement.addNewChild(PRIMARY_SYSTEM, primarySystem);
            inputNaElement.addNewChild(SECONDARY_PATH, secondaryPath);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug(SECONDARY_PATH + " : " + secondaryPath);
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    /*
     * *************************************************************************
     * ********************** NFS
     * ***********************************************
     * *************************************************.
     */

    /**
     * <pre>
     * append Nfs rules.
     * </pre>
     * 
     * @param serviceType the service type
     * @param pathname the pathname
     * @param hostName the host name
     * @throws Exception the solution exception
     */
    public void appendNfsRule(CtrlrInfoVo ctrlrInfoVo, String pathname, String hostName) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement(NFS_EXPORTFS_APPEND_RULES);

            inputElement.addNewChild(PERSISTENT, NFS_PERSISTENT_TRUE);

            NaElement rules = makeRules(pathname, NOSUID_TRUE, ALL_HOSTS_FALSE, hostName, NEGATE_FALSE,
                    SEC_FLAVOR_VALUE);

            inputElement.addChildElem(rules);

            if (logger.isDebugEnabled()) {
                logger.debug(inputElement.toPrettyString(""));
            }

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * Make rules.
     * </pre>
     * 
     * @param pathname the pathname
     * @param nosuid the nosuid
     * @param allHosts the all hosts
     * @param hostName the host name
     * @param negate the negate
     * @param secFlaveor the sec flaveor
     * @return the na element
     */
    private NaElement makeRules(String pathname, String nosuid, String allHosts, String hostName, String negate,
            String secFlaveor) {

        NaElement rules = new NaElement(RULES2);

        NaElement ruleInfo = new NaElement(EXPORTS_RULE_INFO);
        ruleInfo.addNewChild(PATHNAME2, pathname);
        ruleInfo.addNewChild(NOSUID2, nosuid);

        NaElement readWrite = makeReadWrite(allHosts, hostName, negate);
        ruleInfo.addChildElem(readWrite);

        NaElement root = makeRoot(allHosts, hostName, negate);
        ruleInfo.addChildElem(root);

        NaElement secFlavor = makeSecFlavor(secFlaveor);
        ruleInfo.addChildElem(secFlavor);

        rules.addChildElem(ruleInfo);

        return rules;
    }

    /**
     * <pre>
     * Make read write.
     * </pre>
     * 
     * @param allHosts the all hosts
     * @param hostName the host name
     * @param negate the negate
     * @return the na element
     */
    private NaElement makeReadWrite(String allHosts, String hostName, String negate) {

        NaElement readWrite = new NaElement(READ_WRITE);

        NaElement exportHostNameInfo = new NaElement(EXPORTS_HOSTNAME_INFO);

        exportHostNameInfo.addNewChild(ALL_HOSTS, allHosts);
        exportHostNameInfo.addNewChild(NAME, hostName);
        exportHostNameInfo.addNewChild(NEGATE2, negate);

        readWrite.addChildElem(exportHostNameInfo);

        return readWrite;
    }

    /**
     * <pre>
     * Make read write.
     * </pre>
     * 
     * @param allHosts the all hosts
     * @param hostName the host name
     * @param negate the negate
     * @return the na element
     */
    private NaElement makeRoot(String allHosts, String hostName, String negate) {

        NaElement readWrite = new NaElement("root");

        NaElement exportHostNameInfo = new NaElement(EXPORTS_HOSTNAME_INFO);

        exportHostNameInfo.addNewChild(ALL_HOSTS, allHosts);
        exportHostNameInfo.addNewChild(NAME, hostName);
        exportHostNameInfo.addNewChild(NEGATE2, negate);

        readWrite.addChildElem(exportHostNameInfo);

        return readWrite;
    }

    /**
     * <pre>
     * Make sec flavor.
     * </pre>
     * 
     * @param secFlavor the sec flavor
     * @return the na element
     */
    private NaElement makeSecFlavor(String secFlavor) {

        NaElement secFlavorElement = new NaElement(SEC_FLAVOR);

        NaElement secFlavorInfo = new NaElement(SEC_FLAVOR_INFO);

        secFlavorInfo.addNewChild("flavor", secFlavor);

        secFlavorElement.addChildElem(secFlavorInfo);

        return secFlavorElement;
    }

    /**
     * <pre>
     * Delete nfs rule.
     * </pre>
     * 
     * @param serviceType the service type
     * @param pathname the pathname
     * @throws Exception the solution exception
     */
    public void deleteNfsRule(CtrlrInfoVo ctrlrInfoVo, String pathname) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement(NFS_EXPORTFS_DELETE_RULES);

            inputElement.addNewChild(PERSISTENT, NFS_PERSISTENT_TRUE);

            NaElement pathnames = makePathNames(pathname);

            inputElement.addChildElem(pathnames);

            if (logger.isDebugEnabled()) {
                logger.debug(inputElement.toPrettyString(""));
            }

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * Make path names.
     * </pre>
     * 
     * @param pathname the pathname
     * @return the na element
     */
    private NaElement makePathNames(String pathname) {

        NaElement pathnames = new NaElement(PATHNAMES2);

        NaElement ruleInfo = new NaElement(PATHNAME_INFO);
        ruleInfo.addNewChild(NAME, pathname);

        pathnames.addChildElem(ruleInfo);

        return pathnames;
    }

    /**
     * <pre>
     * Modify nfs rule.
     * </pre>
     * 
     * @param serviceType the service type
     * @param pathname the pathname
     * @param hostName the host name
     * @throws Exception the solution exception
     */
    public void modifyNfsRule(CtrlrInfoVo ctrlrInfoVo, String pathname, String hostName) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement(NFS_EXPORTFS_MODIFY_RULE);

            inputElement.addNewChild(PERSISTENT, NFS_PERSISTENT_TRUE);

            NaElement rules = makeModifyRule(pathname, NOSUID_TRUE, ALL_HOSTS_FALSE, hostName, NEGATE_FALSE,
                    SEC_FLAVOR_VALUE);

            inputElement.addChildElem(rules);

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * Make modify rule.
     * </pre>
     * 
     * @param pathname the pathname
     * @param nosuid the nosuid
     * @param allHosts the all hosts
     * @param hostName the host name
     * @param negate the negate
     * @param secFlaveor the sec flaveor
     * @return the na element
     */
    private NaElement makeModifyRule(String pathname, String nosuid, String allHosts, String hostName, String negate,
            String secFlaveor) {

        NaElement rules = new NaElement(RULE);

        NaElement ruleInfo = new NaElement(EXPORTS_RULE_INFO);
        ruleInfo.addNewChild(PATHNAME2, pathname);
        ruleInfo.addNewChild(NOSUID2, nosuid);

        NaElement readWrite = makeReadWrite(allHosts, hostName, negate);
        ruleInfo.addChildElem(readWrite);

        NaElement secFlavor = makeSecFlavor(secFlaveor);
        ruleInfo.addChildElem(secFlavor);

        rules.addChildElem(ruleInfo);

        return rules;
    }

    /**
     * <pre>
     * Search nfs rule.
     * </pre>
     * 
     * @param serviceType the service type
     * @param pathname the pathname
     * @throws Exception the solution exception
     */
    public void searchNfsRule(CtrlrInfoVo ctrlrInfoVo, String pathname) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement(NFS_EXPORTFS_LIST_RULES);

            if (!"".equals(pathname))
                inputElement.addNewChild(PATHNAME2, pathname);

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * *************************************************************************
     * ********************** CIFS
     * **********************************************
     * **************************************************.
     */

    /**
     * <pre>
     * Append cifs rule.
     * </pre>
     * 
     * @param serviceType the service type
     * @param pathname the pathname
     * @param shareName the share name
     * @throws Exception the solution exception
     */
    public void appendCifsRule(CtrlrInfoVo ctrlrInfoVo, String pathname, String shareName) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement(CIFS_SHARE_ADD);

            inputElement.addNewChild(PATH2, pathname);
            inputElement.addNewChild(SHARE_NAME, shareName);
            inputElement.addNewChild(CIFS_IS_BROWSE, CIFS_IS_BROWSE_FALSE);

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * <pre>
     * Delete cifs rule.
     * </pre>
     * 
     * @param serviceType the service type
     * @param shareName the share name
     * @throws Exception the solution exception
     */
    public void deleteCifsRule(CtrlrInfoVo ctrlrInfoVo, String shareName) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement(CIFS_SHARE_DELETE);

            inputElement.addNewChild(SHARE_NAME, shareName);

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * <pre>
     * cifs access rule.
     * </pre>
     *
     * @param ctrlrInfoVo the ctrlr info vo
     * @param shareName the share name
     * @param userName the user name
     * @throws Exception the solution exception
     */
    public void appendCifsAccessRule(CtrlrInfoVo ctrlrInfoVo, String shareName, String userName) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement(CIFS_SHARE_ACE_SET);

            inputElement.addNewChild(CIFS_ACCESS_RIGHTS, CIFS_SHARE_ACE_SET_RWX);
            inputElement.addNewChild(SHARE_NAME, shareName);
            inputElement.addNewChild(CIFS_ACCESS_USER_NAME, userName);

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * <pre>
     * cifs delete rule.
     * </pre>
     *
     * @param ctrlrInfoVo the ctrlr info vo
     * @param shareName the share name
     * @param userName the user name
     * @throws Exception the solution exception
     */
    public void deleteCifsAccessRule(CtrlrInfoVo ctrlrInfoVo, String shareName, String userName) throws Exception {

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement(CIFS_SHARE_DELETE_SET);

            inputElement.addNewChild(SHARE_NAME, shareName);
            inputElement.addNewChild(CIFS_ACCESS_USER_NAME, userName);

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    // /**
    // * <pre>
    // * Modify cifs rule.
    // * </pre>
    // *
    // * @param shareName the share name
    // * @throws Exception the solution exception
    // */
    // public void modifyCifsRule(String shareName) throws Exception {
    //        
    // try {
    // NetAppConnectionMngr mngr = new NetAppConnectionMngr();
    // mngr.getConnection();
    // naServer = mngr.getNaServer();
    //            
    // NaElement inputElement = new NaElement("cifs-share-change");
    //            
    // inputElement.addNewChild(SHARE_NAME, shareName);
    //            
    // NaElement outputElement = naServer.invokeElem(inputElement);
    //            
    // if (logger.isDebugEnabled()) {
    // logger.debug(outputElement.toPrettyString(""));
    // }
    // } catch (Exception e) {
    // throw e;
    // } finally {
    // try {
    // naServer.close();
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }
    // }

    /*
     * *************************************************************************
     * ********************** 스토리지/볼륨/성능 조회
     * *************************************
     * ***********************************************************.
     */

    /**
     * <pre>
     * 1. 스토리지 전체, 사용량, 가용량 목록 조회
     * </pre>
     * 
     * @param serviceType the service type
     * @return the storage capity vo
     * @throws Exception the solution exception
     */
    public List<CapityVo> searchStorageCapity(CtrlrInfoVo ctrlrInfoVo) throws Exception {

        List<CapityVo> list = new ArrayList<CapityVo>();

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(AGGR_LIST_INFO);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
            }

            List aggrInfoList = outputNaElement.getChildByName(AGGREGATES).getChildren();

            Iterator<NaElement> iter = aggrInfoList.iterator();

            while (iter.hasNext()) {
                NaElement aggrInfo = iter.next();

                CapityVo capity = new CapityVo();

                capity.setAggregates(aggrInfo.getChildContent(NAME));
                capity.setTotal(aggrInfo.getChildContent(SIZE_TOTAL));
                capity.setUsed(aggrInfo.getChildContent(SIZE_USED));
                capity.setAvailable(aggrInfo.getChildContent(SIZE_AVAILABLE));
                capity.setCount(aggrInfo.getChildContent(VOLUME_COUNT));

                list.add(capity);
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;

    }

    /**
     * <pre>
     * 1. 스토리지 특정 Aggrgate 의 전체, 사용량, 가용량 조회
     * </pre>
     * 
     * @param serviceType the service type
     * @param aggrgate the aggrgate
     * @return the list
     * @throws Exception the solution exception
     */
    public CapityVo searchStorageCapity(CtrlrInfoVo ctrlrInfoVo, String aggrgate) throws Exception {

        CapityVo capity = new CapityVo();

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(AGGR_LIST_INFO);
            inputNaElement.addNewChild(AGGREGATE, aggrgate);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

//            if (logger.isDebugEnabled()) {
//                logger.debug(outputNaElement.toPrettyString(""));
//            }

            List aggrInfoList = outputNaElement.getChildByName(AGGREGATES).getChildren();

            Iterator<NaElement> iter = aggrInfoList.iterator();

            while (iter.hasNext()) {
                NaElement aggrInfo = iter.next();

                if (aggrgate.equals(aggrInfo.getChildContent(NAME))) {
                    capity.setAggregates(aggrInfo.getChildContent(NAME));
                    capity.setTotal(aggrInfo.getChildContent(SIZE_TOTAL));
                    capity.setUsed(aggrInfo.getChildContent(SIZE_USED));
                    capity.setAvailable(aggrInfo.getChildContent(SIZE_AVAILABLE));
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return capity;

    }

    /**
     * <pre>
     * 1. 볼륨 전체 용량 조회
     * 2. 볼륨 사용량 조회
     * </pre>
     * 
     * @param serviceType the service type
     * @return the array list
     * @throws Exception the solution exception
     */
    public List<CapityVo> searchVolumeCapity(CtrlrInfoVo ctrlrInfoVo) throws Exception {

        List<CapityVo> elements = new ArrayList<CapityVo>();

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(VOLUME_LIST_INFO);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
            	logger.debug("########TEST########");
                logger.debug(outputNaElement.toPrettyString(""));
            }

            List<NaElement> volList = outputNaElement.getChildByName(VOLUMES).getChildren();
            
            for (NaElement volumeInfo : volList) {

                CapityVo capity = new CapityVo();

                capity.setVolumeName(volumeInfo.getChildContent(NAME));
                capity.setTotal(volumeInfo.getChildContent(SIZE_TOTAL));
                capity.setUsed(volumeInfo.getChildContent(SIZE_USED));
                capity.setAvailable(volumeInfo.getChildContent(SIZE_AVAILABLE));
                capity.setSnapReservedPercent(volumeInfo.getChildContent(SNAPSHOT_PERCENT_RESERVED));
                
                if (logger.isDebugEnabled()) {
                	logger.debug("########TEST########");
                    logger.debug("볼륨명 : " + capity.getVolumeName());
                    logger.debug("Disk 용량 : " + capity.getTotal());
                    logger.debug("Disk 사용량 : " + capity.getUsed());
                    logger.debug("Disk 가용량 : " + capity.getAvailable());
                }

                elements.add(capity);
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return elements;

    }

    /**
     * <pre>
     * 1. 특정 볼륨 용량 조회
     * 2. 특정 볼륨 사용량 조회
     * </pre>
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @return the array list
     * @throws Exception the solution exception
     */
    public CapityVo searchVolumeCapity(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        CapityVo result = new CapityVo();

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(VOLUME_LIST_INFO);
            inputNaElement.addNewChild(VOLUMES, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);

            if (logger.isDebugEnabled()) {
//                logger.debug(outputNaElement.toPrettyString(""));
            }

            List volList = outputNaElement.getChildByName(VOLUMES).getChildren();
            Iterator volIter = volList.iterator();

            while (volIter.hasNext()) {
                NaElement volumeInfo = (NaElement) volIter.next();

                result.setVolumeName(volumeInfo.getChildContent(NAME));
                result.setTotal(volumeInfo.getChildContent(SIZE_TOTAL));
                result.setUsed(volumeInfo.getChildContent(SIZE_USED));
                result.setAvailable(volumeInfo.getChildContent(SIZE_AVAILABLE));
                result.setSnapReservedPercent(volumeInfo.getChildContent(SNAPSHOT_PERCENT_RESERVED));
                
                if (logger.isDebugEnabled()) {
                    logger.debug("볼륨명 : " + result.getVolumeName());
                    logger.debug("Disk 용량 : " + result.getTotal());
                    logger.debug("Disk 사용량 : " + result.getUsed());
                    logger.debug("Disk 가용량 : " + result.getAvailable());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;

    }

    /**
     * <pre>
     * 사용자별 할당 조회(쿼타 한건 조회)
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @param qtreeName the qtree name
     * @return the capity vo
     * @throws Exception the solution exception
     */
    public CapityVo searchQuotaOne(CtrlrInfoVo ctrlrInfoVo, String volumeName, String qtreeName) throws Exception {

        CapityVo capityVo = new CapityVo();

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QUOTA_REPORT);
            inputNaElement.addNewChild(VOLUME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);
            List quotaList = outputNaElement.getChildByName(QUOTAS).getChildren();

            Iterator quotaIter = quotaList.iterator();

            while (quotaIter.hasNext()) {
                NaElement quota = (NaElement) quotaIter.next();

                if (qtreeName.equals(quota.getChildContent(TREE))) {
                    // 볼륨명
                    capityVo.setVolumeName(quota.getChildContent(VOLUME));
                    // 큐트리명
                    capityVo.setQtreeName(quota.getChildContent(TREE));
                    // Disk 용량
                    capityVo.setTotal(quota.getChildContent(DISK_LIMIT));
                    // Disk 사용량
                    capityVo.setUsed(quota.getChildContent(DISK_USED));
                }
            }

            if (logger.isDebugEnabled()) {
//                logger.debug(outputNaElement.toPrettyString(""));
                logger.debug("볼륨명 : " + capityVo.getVolumeName());
                logger.debug("큐트리명 : " + capityVo.getQtreeName());
                logger.debug("Disk 용량 : " + capityVo.getTotal());
                logger.debug("Disk 사용량 : " + capityVo.getUsed());
            }
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return capityVo;
    }

    
    /**
     * <pre>
     * 사용자별 할당 리스트 조회(쿼타 여러건 조회)
     * </pre>.
     *
     * @param serviceType the service type
     * @return the list
     * @throws Exception the solution exception
     */
    public List<CapityVo> searchQuota(CtrlrInfoVo ctrlrInfoVo) throws Exception {
        return searchQuota(ctrlrInfoVo, "");
    }
    
    /**
     * <pre>
     * 사용자별 할당 리스트 조회(쿼타 여러건 조회)
     * </pre>.
     *
     * @param serviceType the service type
     * @param volumeName the volume name
     * @return the list
     * @throws Exception the solution exception
     */
    public List<CapityVo> searchQuota(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        List<CapityVo> list = new ArrayList<CapityVo>();

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QUOTA_REPORT);
            if (!"".equals(volumeName)) {
                inputNaElement.addNewChild(VOLUME, volumeName);
            }

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }

            NaElement outputNaElement = naServer.invokeElem(inputNaElement);
            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
            }
            
            List quotaList = outputNaElement.getChildByName(QUOTAS).getChildren();

            Iterator quotaIter = quotaList.iterator();
            
            while (quotaIter.hasNext()) {

                CapityVo capityVo = new CapityVo();

                NaElement quota = (NaElement) quotaIter.next();

                // 볼륨명
                capityVo.setVolumeName(quota.getChildContent(VOLUME));
                // 큐트리명
                capityVo.setQtreeName(quota.getChildContent(TREE));
                // Disk 용량
                capityVo.setTotal(quota.getChildContent(DISK_LIMIT));
                // Disk 사용량
                capityVo.setUsed(quota.getChildContent(DISK_USED));

                if (logger.isDebugEnabled()) {
                    logger.debug("볼륨명 : " + capityVo.getVolumeName());
                    logger.debug("큐트리명 : " + capityVo.getQtreeName());
                    logger.debug("Disk 용량 : " + capityVo.getTotal());
                    logger.debug("Disk 사용량 : " + capityVo.getUsed());
                }

                list.add(capityVo);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    /**
     * <pre>
     * 큐트리 리스트 조회
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @param volumeName the volume name
     * @return the array list
     * @throws Exception the solution exception
     */
    public List<String> searchQtreeList(CtrlrInfoVo ctrlrInfoVo, String volumeName) throws Exception {

        List<String> list = new ArrayList<String>();

        NaServer naServer = null;

        try {
            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputNaElement = new NaElement(QTREE_LIST);
            inputNaElement.addNewChild(VOLUME, volumeName);

            if (logger.isDebugEnabled()) {
                logger.debug(inputNaElement.toPrettyString(""));
            }
            
            NaElement outputNaElement = naServer.invokeElem(inputNaElement);
            List qtreeInfo = outputNaElement.getChildByName(QTREES).getChildren();
            Iterator qtreeInfoIter = qtreeInfo.iterator();
            while (qtreeInfoIter.hasNext()) {
                NaElement qtreeInfoElm = (NaElement) qtreeInfoIter.next();
                list.add(qtreeInfoElm.getChildContent(QTREE));
                if (logger.isDebugEnabled()) {
                    logger.debug(qtreeInfoElm.getChildContent(QTREE));
                }
            }

            if (logger.isDebugEnabled()) {
                logger.debug(outputNaElement.toPrettyString(""));
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return list;

    }

    /**
     * <pre>
     * 성능 정보 조회
     * TODO 맞는지 모르겠다
     * </pre>
     * 
     * .
     * 
     * @param serviceType the service type
     * @throws Exception the solution exception
     */
    public void searchPerformence(CtrlrInfoVo ctrlrInfoVo) throws Exception {

        NaServer naServer = null;

        try {

            NetAppConnectionMngr mngr = new NetAppConnectionMngr();

            naServer = mngr.getConnection(ctrlrInfoVo.getStrgIp(), ctrlrInfoVo.getId(), ctrlrInfoVo.getPasswd());

            NaElement inputElement = new NaElement("perf-object-get-instances");
            inputElement.addNewChild("objectname", "perf");

            if (logger.isDebugEnabled()) {
                logger.debug(inputElement.toPrettyString(""));
            }

            // NaElement inputElement = new NaElement("perf-object-list-info");
            // NaElement inputElement = new
            // NaElement("perf-object-instance-list-info");

            NaElement outputElement = naServer.invokeElem(inputElement);

            if (logger.isDebugEnabled()) {
                logger.debug(outputElement.toPrettyString(""));
            }

        } catch (Exception e) {
            e.printStackTrace();
            int errNo = 99999; 
            if (e instanceof NaAPIFailedException) {
                errNo = ((NaAPIFailedException) e).getErrno();
            }
            throw e;
        } finally {
            try {
                if (naServer != null) {
                    naServer.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
