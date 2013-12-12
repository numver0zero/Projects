
package com.skt.tcc.virtualservicedomain.netapp.sevenmode.adapter;

public class CapityVo {

    /** 총량. (단위 Quota 의 경우 KByte, 스토리지나 Volume 의 경우 byte) */
    private String total = "";

    /** 사용량. (단위 Quota 의 경우 Kbyte, 스토리지나 Volume 의 경우 byte) */
    private String used = "";

    /** 가용량. (단위 Quota 의 경우 Kbyte, 스토리지나 Volume 의 경우 byte) */
    private String available = "";

    /** Aggregates. */
    private String aggregates;

    /** 볼륨 이름. */
    private String volumeName = "";

    /** 큐트리 이름. */
    private String qtreeName = "";
    
    /** 컨트롤러 이름. CCH_A,CCH_B/VDI_A,VDI_B/BAK_A */
    private String contrlId = "";
    
    /** 갯수. */
    private String count = "";
    
    /** 스냅샷 Reserved Percent. */
    private String snapReservedPercent;

    /**
     * <pre>
     * Gets the total.
     * </pre>
     * 
     * @return the total
     */
    public String getTotal() {
        return total;
    }

    /**
     * <pre>
     * Sets the total.
     * </pre>
     * 
     * @param total the new total
     */
    public void setTotal(String total) {
        this.total = total;
    }

    /**
     * <pre>
     * Gets the used.
     * </pre>
     * 
     * @return the used
     */
    public String getUsed() {
        return used;
    }

    /**
     * <pre>
     * Sets the used.
     * </pre>
     * 
     * @param used the new used
     */
    public void setUsed(String used) {
        this.used = used;
    }

    /**
     * <pre>
     * Sets the available.
     * </pre>
     * 
     * @param available the new available
     */
    public void setAvailable(String available) {
        this.available = available;
    }

    /**
     * <pre>
     * Gets the available.
     * </pre>
     * 
     * @return the available
     */
    public String getAvailable() {
        return available;
    }

    /**
     * <pre>
     * Gets the aggregates.
     * </pre>
     * 
     * @return the aggregates
     */
    public String getAggregates() {
        return aggregates;
    }

    /**
     * <pre>
     * Sets the aggregates.
     * </pre>
     * 
     * @param aggregates the new aggregates
     */
    public void setAggregates(String aggregates) {
        this.aggregates = aggregates;
    }

    /**
     * <pre>
     * Gets the volume name.
     * </pre>
     * 
     * @return the volume name
     */
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * <pre>
     * Sets the volume name.
     * </pre>
     * 
     * @param volumeName the new volume name
     */
    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

    /**
     * <pre>
     * Gets the qtree name.
     * </pre>
     * 
     * @return the qtree name
     */
    public String getQtreeName() {
        return qtreeName;
    }

    /**
     * <pre>
     * Sets the qtree name.
     * </pre>
     * 
     * @param qtreeName the new qtree name
     */
    public void setQtreeName(String qtreeName) {
        this.qtreeName = qtreeName;
    }

    /**
     * <pre>
     * Gets the contrl id.
     * </pre>
     *
     * @return the contrl id
     */
    public String getContrlId() {
        return contrlId;
    }

    /**
     * <pre>
     * Sets the contrl id.
     * </pre>
     *
     * @param contrlId the new contrl id
     */
    public void setContrlId(String contrlId) {
        this.contrlId = contrlId;
    }

    /**
     * <pre>
     * Gets the count.
     * </pre>
     *
     * @return the count
     */
    public String getCount() {
        return count;
    }

    /**
     * <pre>
     * Sets the count.
     * </pre>
     *
     * @param count the new count
     */
    public void setCount(String count) {
        this.count = count;
    }


    /**
     * <pre>
     * Gets the snap reserved percent.
     * </pre>
     *
     * @return the snap reserved percent
     */
    public String getSnapReservedPercent() {
        return snapReservedPercent;
    }

    /**
     * <pre>
     * Sets the snap reserved percent.
     * </pre>
     *
     * @param snapReservedPercent the new snap reserved percent
     */
    public void setSnapReservedPercent(String snapReservedPercent) {
        this.snapReservedPercent = snapReservedPercent;
    }
}
