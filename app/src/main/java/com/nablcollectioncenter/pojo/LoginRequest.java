package com.nablcollectioncenter.pojo;

/**
 * Created by raj on 3/16/2018.
 */

public class LoginRequest {

    private String userName;
    private String password;
    private String grant_type;

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

    public String getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }
}
