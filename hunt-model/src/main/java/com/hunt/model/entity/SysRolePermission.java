package com.hunt.model.entity;

/**
 * @Author: ouyangan
 * @Date: 2016-10-12 14:21
 * @Description:
 */
public class SysRolePermission {

    // id :
    private Integer id;

    // sys_permission_id :权限id
    private Integer sysPermissionId;

    // sys_role_id :角色id
    private Integer sysRoleId;

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

    // status :数据状态,1:正常,2:删除
    private Integer status;

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
     * get 权限id
     *
     * @return Integer
     */
    public Integer getSysPermissionId() {
        return sysPermissionId;
    }

    /**
     * set 权限id
     *
     * @param sysPermissionId
     */
    public void setSysPermissionId(Integer sysPermissionId) {
        this.sysPermissionId = sysPermissionId;
    }

    /**
     * get 角色id
     *
     * @return Integer
     */
    public Integer getSysRoleId() {
        return sysRoleId;
    }

    /**
     * set 角色id
     *
     * @param sysRoleId
     */
    public void setSysRoleId(Integer sysRoleId) {
        this.sysRoleId = sysRoleId;
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

    @Override
    public String toString() {
        return "SysRolePermission{" +
                "id='" + id + '\'' +
                ", sysPermissionId='" + sysPermissionId + '\'' +
                ", sysRoleId='" + sysRoleId + '\'' +
                ", rank='" + rank + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", status=" + status +
                '}';
    }
}
