package com.example.physicaleducation.Models;

public class Course {
    private String mID;
    private String mUFacultyID;
    private int mCourse;

    public Course(String mID, String mUFacultyID, int mCourse) {
        this.mID = mID;
        this.mUFacultyID = mUFacultyID;
        this.mCourse = mCourse;
    }

    public Course() {
    }
    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmUFacultyID() {
        return mUFacultyID;
    }

    public void setmUFacultyID(String mUFacultyID) {
        this.mUFacultyID = mUFacultyID;
    }

    public int getmCourse() {
        return mCourse;
    }

    public void setmCourse(int mCourse) {
        this.mCourse = mCourse;
    }




}
