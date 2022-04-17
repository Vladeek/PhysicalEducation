package com.example.physicaleducation.Models;

public class NormativePass {
    private String mID;
    private String mStudentID;
    private String date;
    private String mark;
    private String mTeacherID;
    private String result;
    private String mNormativeID;

    public NormativePass(String mID, String mStudentID, String date, String mark, String mTeacherID, String result, String mNormativeID) {
        this.mID = mID;
        this.mStudentID = mStudentID;
        this.date = date;
        this.mark = mark;
        this.mTeacherID = mTeacherID;
        this.result = result;
        this.mNormativeID = mNormativeID;
    }

    public NormativePass() {
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmStudentID() {
        return mStudentID;
    }

    public void setmStudentID(String mStudentID) {
        this.mStudentID = mStudentID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getmTeacherID() {
        return mTeacherID;
    }

    public void setmTeacherID(String mTeacherID) {
        this.mTeacherID = mTeacherID;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getmNormativeID() {
        return mNormativeID;
    }

    public void setmNormativeID(String mNormativeID) {
        this.mNormativeID = mNormativeID;
    }
}
