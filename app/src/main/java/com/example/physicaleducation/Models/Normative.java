package com.example.physicaleducation.Models;

public class Normative {
    private String mID;
    private String mNormativeName;
    private String mNormativeDescription;
    private boolean mSMG;
    private boolean male;

    public Normative(String mID, String mNormativeName, String mNormativeDescription, boolean mSMG, boolean male) {
        this.mID = mID;
        this.mNormativeName = mNormativeName;
        this.mNormativeDescription = mNormativeDescription;
        this.mSMG = mSMG;
        this.male = male;
    }

    public Normative() {
    }

    public String getmID() {
        return mID;
    }

    public void setmID(String mID) {
        this.mID = mID;
    }

    public String getmNormativeName() {
        return mNormativeName;
    }

    public void setmNormativeName(String mNormativeName) {
        this.mNormativeName = mNormativeName;
    }

    public String getmNormativeDescription() {
        return mNormativeDescription;
    }

    public void setmNormativeDescription(String mNormativeDescription) {
        this.mNormativeDescription = mNormativeDescription;
    }

    public boolean ismSMG() {
        return mSMG;
    }

    public void setmSMG(boolean mSMG) {
        this.mSMG = mSMG;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
