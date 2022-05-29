package com.raven.model;

public class Model_User_Account {

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isStatus() {
        return acc_status;
    }

    public void setStatus(boolean acc_status) {
        this.acc_status = acc_status;
    }

    public Model_User_Account(int userID, String userName, String gender, boolean acc_status) {
        this.userID = userID;
        this.userName = userName;
        this.gender = gender;
        this.acc_status = acc_status;
    }

    public Model_User_Account() {
    }

    private int userID;
    private String userName;
    private String gender;
    private boolean acc_status;
}
