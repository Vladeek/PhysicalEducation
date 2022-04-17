package com.example.physicaleducation.Models;

public class Teacher {

    private String mID;
    private String mName;
    private String mLogin;
    private String mPassword;
    private boolean isAdmin;

    public Teacher() {

    }

    public void setID(String id) {this.mID = id;}
    public String getID(){return this.mID;}
    public void setName(String name) {this.mName = name;}
    public String getName(){return this.mName;}
    public void setLogin(String login) {this.mLogin = login;}
    public String getLogin(){return this.mLogin;}
    public void setPassword(String password) {this.mPassword = password;}
    public String getPassword(){return this.mPassword;}
    public boolean isAdmin() {
        return isAdmin;
    }
    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
