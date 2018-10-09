package com.hunt.model.dto;

import java.io.Serializable;

/**
 * @Auther: whq
 * @Date: 2018/10/9 13:24
 * @Description:
 */
public class SystemUserUrlPermissionDto{
    /**
     * 權限的名字
     */
    private String roleName;
    /**
     * 權限的id
     */
    private String roleId;
    /**
     * 權限對應的code
     */
    private String roleCode;
    /**
     * 菜單對應權限的id
     */
    private String sysPermissionGroupId;
    /**
     * 是否可以修改
     */
    private String isFinal;
    /**
     * 请求url
     */
    private String requestUrl;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getSysPermissionGroupId() {
        return sysPermissionGroupId;
    }

    public void setSysPermissionGroupId(String sysPermissionGroupId) {
        this.sysPermissionGroupId = sysPermissionGroupId;
    }

    public String getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(String isFinal) {
        this.isFinal = isFinal;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    @Override
    public String toString() {
        return "SystemUserUrlPermission{" +
                "roleName='" + roleName + '\'' +
                ", roleId='" + roleId + '\'' +
                ", roleCode='" + roleCode + '\'' +
                ", sysPermissionGroupId='" + sysPermissionGroupId + '\'' +
                ", isFinal='" + isFinal + '\'' +
                ", requestUrl='" + requestUrl + '\'' +
                '}';
    }
}
