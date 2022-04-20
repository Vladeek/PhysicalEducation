package com.example.physicaleducation.Models;

public class Faculty {
    private String mID;
    private String mUniversityID;
    private String mFacultyName;

    public Faculty(String mID, String mUniversityID, String mFacultyName) {
        this.mID = mID;
        this.mUniversityID = mUniversityID;
        this.mFacultyName = mFacultyName;
    }

    public Faculty(String mID, String mFacultyName) {
        this.mID = mID;
        this.mFacultyName = mFacultyName;
    }

    public Faculty() {
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmUniversityID() {
        return mUniversityID;
    }

    public void setmUniversityID(String mUniversityID) {
        this.mUniversityID = mUniversityID;
    }

    public String getmFacultyName() {
        return mFacultyName;
    }

    public void setmFacultyName(String mFacultyName) {
        this.mFacultyName = mFacultyName;
    }

}
