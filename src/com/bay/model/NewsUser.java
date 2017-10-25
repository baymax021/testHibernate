package com.bay.model;

/**
 * Created by baymax on 2017/10/24.
 * No cross no  crown.
 */

public class NewsUser {
    private int id;
    private String userName;
    private String userPassword;
    private String userType;

    public NewsUser() {
    }

    public NewsUser(int id, String userName, String userPassword, String userType) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "NewsUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userType='" + userType + '\'' +
                '}';
    }
}
