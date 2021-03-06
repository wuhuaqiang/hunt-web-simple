package com.hunt.util;

/**
 * @Author ouyangan
 * @Date 2016/10/8/13:41
 * @Description
 */
public enum ResponseCode {
    success(10000, "操作成功"),
    error(20000, "服务器错误"),
//    unknown_account(20001, "账户不存在"),
//    forbidden_account(20002, "账户已休眠"),
    unknown_account(20001, "用户名或密码不正确"),
    forbidden_account(20002, "用户名或密码不正确"),
    password_incorrect(20003, "密码错误"),
    verify_captcha_error(20004, "验证码错误,请重新刷新并滑动验证码!"),
    unauthorized(20005, "无操作权限"),
    can_not_edit(20006, "该条记录无法编辑"),
    unauthenticated(20007, "未登录"),
    forbidden_ip(20008, "IP地址不允许访问该网站"),// 非法请求
    not_found_url(20009, "url不存在"),
    param_format_error(30001, "参数格式错误"),
    missing_parameter(30002, "缺少参数"),
    name_already_exist(30003, "该名称已存在"),
    data_not_exist(30004, "该记录不存在"),
    login_name_already_exist(30005, "该登录名已存在"),
    code_already_exist(30006, "该编码已存在"),
    fullname_already_exist(30007, "该全称已存在"),
    //    dormant_account(30008, "账户已休眠"),
    dormant_account(30008, "用户名或密码不正确"),
    //    account_expiration(30009,"帐号已过期"),
    account_expiration(30009, "用户名或密码不正确"),
    oldpassword_error(30010, "旧密码验证错误"),
    old_new_password_error(30011, "新密码不能与旧密码相同"),
    lock_account(30012, "由于用户名或密码输入错误次数大于10次，帐号已锁定！");

    private int code;
    private String msg;

    ResponseCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "ResponseCode{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
