package com.example.physicaleducation.Models;

public class Student {
    private String mID;
    private String mGroupID;
    private String birthDate;
    private boolean male;
    private String studentName;

    public Student(String mID, String mGroupID, String birthDate, boolean male, String studentName) {
        this.mID = mID;
        this.mGroupID = mGroupID;
        this.birthDate = birthDate;
        this.male = male;
        this.studentName = studentName;
    }

    public Student() {
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmGroupID() {
        return mGroupID;
    }

    public void setmGroupID(String mGroupID) {
        this.mGroupID = mGroupID;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
