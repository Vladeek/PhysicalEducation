package com.example.physicaleducation.Models;

public class University {
    private String mID;
    private String mUniversityName;

    public University(String mID, String mUniversityName) {
        this.mID = mID;
        this.mUniversityName = mUniversityName;
    }

    public University() {
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmUniversityName() {
        return mUniversityName;
    }

    public void setmUniversityName(String mUniversityName) {
        this.mUniversityName = mUniversityName;
    }




}



