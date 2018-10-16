package com.hunt.model.dto;

import java.util.Date;

/**
 * <p>
 *
 * </p>
 *
 * @author ${author}
 * @since 2018-10-15
 */
public class SysSystemsettingDto {
    private Date visitstarttime;
    private Date visitendtime;
    private String iplist;
    private String txtemailaddr;
    private String txtemailport;
    private String txtemailusername;
    private String txtemailpwd;
    private Double txtloginfalsecount;
    private Double txtloginlocktime;
    private Double txteditpwdtime;
    private Date createTime;
    private Date updateTime;
    private Double createBy;
    private Double updateBy;
    private String rank;
    private Long txtsessionmaxtime;
    private Long txtsessionmaxcount;
    private String sysSystemsettingId;


    public Date getVisitstarttime() {
        return visitstarttime;
    }

    public void setVisitstarttime(Date visitstarttime) {
        this.visitstarttime = visitstarttime;
    }

    public Date getVisitendtime() {
        return visitendtime;
    }

    public void setVisitendtime(Date visitendtime) {
        this.visitendtime = visitendtime;
    }

    public String getIplist() {
        return iplist;
    }

    public void setIplist(String iplist) {
        this.iplist = iplist;
    }

    public String getTxtemailaddr() {
        return txtemailaddr;
    }

    public void setTxtemailaddr(String txtemailaddr) {
        this.txtemailaddr = txtemailaddr;
    }

    public String getTxtemailport() {
        return txtemailport;
    }

    public void setTxtemailport(String txtemailport) {
        this.txtemailport = txtemailport;
    }

    public String getTxtemailusername() {
        return txtemailusername;
    }

    public void setTxtemailusername(String txtemailusername) {
        this.txtemailusername = txtemailusername;
    }

    public String getTxtemailpwd() {
        return txtemailpwd;
    }

    public void setTxtemailpwd(String txtemailpwd) {
        this.txtemailpwd = txtemailpwd;
    }

    public Double getTxtloginfalsecount() {
        return txtloginfalsecount;
    }

    public void setTxtloginfalsecount(Double txtloginfalsecount) {
        this.txtloginfalsecount = txtloginfalsecount;
    }

    public Double getTxtloginlocktime() {
        return txtloginlocktime;
    }

    public void setTxtloginlocktime(Double txtloginlocktime) {
        this.txtloginlocktime = txtloginlocktime;
    }

    public Double getTxteditpwdtime() {
        return txteditpwdtime;
    }

    public void setTxteditpwdtime(Double txteditpwdtime) {
        this.txteditpwdtime = txteditpwdtime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Double getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Double createBy) {
        this.createBy = createBy;
    }

    public Double getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Double updateBy) {
        this.updateBy = updateBy;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Long getTxtsessionmaxtime() {
        return txtsessionmaxtime;
    }

    public void setTxtsessionmaxtime(Long txtsessionmaxtime) {
        this.txtsessionmaxtime = txtsessionmaxtime;
    }

    public Long getTxtsessionmaxcount() {
        return txtsessionmaxcount;
    }

    public void setTxtsessionmaxcount(Long txtsessionmaxcount) {
        this.txtsessionmaxcount = txtsessionmaxcount;
    }

    public String getSysSystemsettingId() {
        return sysSystemsettingId;
    }

    public void setSysSystemsettingId(String sysSystemsettingId) {
        this.sysSystemsettingId = sysSystemsettingId;
    }

    @Override
    public String toString() {
        return "SysSystemsetting{" +
                "visitstarttime=" + visitstarttime +
                ", visitendtime=" + visitendtime +
                ", iplist=" + iplist +
                ", txtemailaddr=" + txtemailaddr +
                ", txtemailport=" + txtemailport +
                ", txtemailusername=" + txtemailusername +
                ", txtemailpwd=" + txtemailpwd +
                ", txtloginfalsecount=" + txtloginfalsecount +
                ", txtloginlocktime=" + txtloginlocktime +
                ", txteditpwdtime=" + txteditpwdtime +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createBy=" + createBy +
                ", updateBy=" + updateBy +
                ", rank=" + rank +
                ", txtsessionmaxtime=" + txtsessionmaxtime +
                ", txtsessionmaxcount=" + txtsessionmaxcount +
                ", sysSystemsettingId=" + sysSystemsettingId +
                "}";
    }

}
