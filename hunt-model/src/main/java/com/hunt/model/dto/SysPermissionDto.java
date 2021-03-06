package com.hunt.model.dto;

/**
 * @Author: ouyangan
 * @Date: 2016-10-12 14:21
 * @Description:
 */
public class SysPermissionDto {

    // id :
    private Integer id;

    // name :名称
    private String name;

    // description :描述
    private String description;

    // code :编码
    private String code;

    // sys_permission_group_id :分组id
    private Integer sysPermissionGroupId;

    // is_final :是否可删除
    private Integer isFinal;

    // rank :排序
    private Integer rank;

    // create_time :创建时间
    private java.util.Date createTime;

    // update_time :更新时间
    private java.util.Date updateTime;

    // create_by :创建人id
    private Integer createBy;

    // update_by :更新人id
    private Integer updateBy;
    //创建人名字
    private String createName;
    //更新人名字
    private String updateName;

    // status :数据状态,1:正常,2:删除
    private Integer status;

    private String sysPermissionGroupName;

    // requestUrl :请求地址
    private String requestUrl;

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName;
    }

    @Override
    public String toString() {
        return "SysPermissionDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", sysPermissionGroupId=" + sysPermissionGroupId +
                ", isFinal=" + isFinal +
                ", rank=" + rank +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", createBy=" + createBy +
                ", updateBy=" + updateBy +
                ", status=" + status +
                ", sysPermissionGroupName='" + sysPermissionGroupName + '\'' +
                '}';
    }

    public String getSysPermissionGroupName() {
        return sysPermissionGroupName;
    }

    public void setSysPermissionGroupName(String sysPermissionGroupName) {
        this.sysPermissionGroupName = sysPermissionGroupName;
    }

    /**
     * get
     *
     * @return Integer
     */
    public Integer getId() {
        return id;
    }

    /**
     * set
     *
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * get 名称
     *
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * set 名称
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get 描述
     *
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * set 描述
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get 编码
     *
     * @return String
     */
    public String getCode() {
        return code;
    }

    /**
     * set 编码
     *
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * get 分组id
     *
     * @return Integer
     */
    public Integer getSysPermissionGroupId() {
        return sysPermissionGroupId;
    }

    /**
     * set 分组id
     *
     * @param sysPermissionGroupId
     */
    public void setSysPermissionGroupId(Integer sysPermissionGroupId) {
        this.sysPermissionGroupId = sysPermissionGroupId;
    }

    /**
     * get 是否可删除
     *
     * @return Integer
     */
    public Integer getIsFinal() {
        return isFinal;
    }

    /**
     * set 是否可删除
     *
     * @param isFinal
     */
    public void setIsFinal(Integer isFinal) {
        this.isFinal = isFinal;
    }

    /**
     * get 排序
     *
     * @return Integer
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * set 排序
     *
     * @param rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * get 创建时间
     *
     * @return java.util.Date
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * set 创建时间
     *
     * @param createTime
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * get 更新时间
     *
     * @return java.util.Date
     */
    public java.util.Date getUpdateTime() {
        return updateTime;
    }

    /**
     * set 更新时间
     *
     * @param updateTime
     */
    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * get 创建人id
     *
     * @return Integer
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * set 创建人id
     *
     * @param createBy
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * get 更新人id
     *
     * @return Integer
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * set 更新人id
     *
     * @param updateBy
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * get 数据状态,1:正常,2:删除
     *
     * @return Integer
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * set 数据状态,1:正常,2:删除
     *
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

}
