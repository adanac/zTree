package com.adanac.study.ztree.vo;

/**
 * Created by allen on 2017/3/15.
 */
public class LibraryVo {
    /*  id      */
    private String id;
    /*  目标id  */
    private String targetId;
    /*  pid     */
    private String pId;
    /*  目标pid      */
    private String targetPId;
    /*  "inner"：成为子节点，"prev"：成为同级前一个节点，"next"：成为同级后一个节点  */
    private String moveType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getTargetPId() {
        return targetPId;
    }

    public void setTargetPId(String targetPId) {
        this.targetPId = targetPId;
    }

    public String getMoveType() {
        return moveType;
    }

    public void setMoveType(String moveType) {
        this.moveType = moveType;
    }
}
