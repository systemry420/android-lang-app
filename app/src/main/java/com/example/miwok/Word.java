package com.example.miwok;

public class Word {
    private String mDefaultWord;
    private  String mMiwokWord;
    private int nImageResID = -1;
    private int mAudioResID;

    public Word(String mDefaultWord, String mMiwokWord, int mAudioResID) {
        this.mDefaultWord = mDefaultWord;
        this.mMiwokWord = mMiwokWord;
        this.mAudioResID = mAudioResID;
    }

    public Word(String mDefaultWord, String mMiwokWord, int nImageResID, int mAudioResID) {
        this.mDefaultWord = mDefaultWord;
        this.mMiwokWord = mMiwokWord;
        this.nImageResID = nImageResID;
        this.mAudioResID = mAudioResID;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }

    public int getnImageResID() { return nImageResID; }

    public boolean hasImage() {
        return nImageResID != -1;
    }

    public int getmAudioResID() { return  mAudioResID; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultWord='" + mDefaultWord + '\'' +
                ", mMiwokWord='" + mMiwokWord + '\'' +
                ", nImageResID=" + nImageResID +
                ", mAudioResID=" + mAudioResID +
                '}';
    }
}
