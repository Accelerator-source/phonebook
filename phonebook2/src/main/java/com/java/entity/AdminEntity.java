package com.java.entity;

/**
 * @description 管理员实体
 * @Author Wangxw
 * @Date 2019/12/17 12:01
 * @Version 1.0
 */
public class AdminEntity {
    /**
     * id
     */
    private Integer id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
