package com.example.physicaleducation.Models;

public class Group {
    private String mID;
    private String mCourseID;
    private String mTeacherID;
    private int mUGroupNumber;
    private boolean mSMG;

    public Group(String mID, String mCourseID, String mTeacherID, int mUGroupNumber, boolean mSMG) {
        this.mID = mID;
        this.mCourseID = mCourseID;
        this.mTeacherID = mTeacherID;
        this.mUGroupNumber = mUGroupNumber;
        this.mSMG = mSMG;
    }

    public Group() {
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmCourseID() {
        return mCourseID;
    }

    public void setmCourseID(String mCourseID) {
        this.mCourseID = mCourseID;
    }

    public String getmTeacherID() {
        return mTeacherID;
    }

    public void setmTeacherID(String mTeacherID) {
        this.mTeacherID = mTeacherID;
    }

    public int getmUGroupNumber() {
        return mUGroupNumber;
    }

    public void setmUGroupNumber(int mUGroupNumber) {
        this.mUGroupNumber = mUGroupNumber;
    }

    public boolean ismSMG() {
        return mSMG;
    }

    public void setmSMG(boolean mSMG) {
        this.mSMG = mSMG;
    }
}
