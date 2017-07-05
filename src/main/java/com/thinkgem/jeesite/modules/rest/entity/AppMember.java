package com.thinkgem.jeesite.modules.rest.entity;

import java.util.Date;

/**
 * Created by Garvey on 2017/7/5.
 * 用户实体，记录注册用户信息
 */
public class AppMember {

    public static final int MAN = 1;
    public static final int WOMAN = 0;


    private String id;
    private String username;
    private String mobile;
    //生日
    private Date birthday;
    //0：女，1：男
    private int sex;
    //电子邮箱
    private String email;
    private String token;
    //token过期日期
    private Date expireDate;
    //系统
    private String sysType;
    //用户积分
    private int point;
    //是否注销
    private int isUnregister;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public String getSysType() {
        return sysType;
    }

    public void setSysType(String sysType) {
        this.sysType = sysType;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public int getIsUnregister() {
        return isUnregister;
    }

    public void setIsUnregister(int isUnregister) {
        this.isUnregister = isUnregister;
    }
}
