package com.example.miwok;

public class Word {
    private String mDefaultWord;
    private  String mMiwokWord;

    public Word(String mDefaultWord, String mMiwokWord) {
        this.mDefaultWord = mDefaultWord;
        this.mMiwokWord = mMiwokWord;
    }

    public String getDefaultWord() {
        return mDefaultWord;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }
}
