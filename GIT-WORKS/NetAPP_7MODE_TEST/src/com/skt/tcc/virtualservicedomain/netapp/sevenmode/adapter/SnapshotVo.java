package com.skt.tcc.virtualservicedomain.netapp.sevenmode.adapter;

public class SnapshotVo {

    /** Qtree 명.*/
    private String qtreeName;
    
    /** 스냅샷 이름. */
    private String name = "";
    
    /** 스냅샷 생성 시간(long 타입). */
    private String accessTime = "";
    
    /** OS 영역 여부. */
    private String isOs;
    
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
     * Gets the name.
     * </pre>
     *
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * <pre>
     * Sets the name.
     * </pre>
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * <pre>
     * Gets the access time.
     * </pre>
     *
     * @return the access time
     */
    public String getAccessTime() {
        return accessTime;
    }
    
    /**
     * <pre>
     * Sets the access time.
     * </pre>
     *
     * @param accessTime the new access time
     */
    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    /**
     * <pre>
     * Gets the checks if is os.
     * </pre>
     *
     * @return the checks if is os
     */
    public String getIsOs() {
        return isOs;
    }

    /**
     * <pre>
     * Sets the checks if is os.
     * </pre>
     *
     * @param isOs the new checks if is os
     */
    public void setIsOs(String isOs) {
        this.isOs = isOs;
    }
    
}
