package org.example.controller;

import org.springframework.data.annotation.Id;

/**
 * Created by qsym on 2017/2/4.
 */
public class registerModel {
    @Id
    private String id;

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String userName;
    private String pwd;
    private String email;
}
