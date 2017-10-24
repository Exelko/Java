package com.example.android.miwok;

/**
 * Created by Symkach on 10/21/2017.
 */

public class Word {
    private String englishTranslation;
    private int imgResId;
    private int soundResId;

    public Word(String englishTranslation,  int mSoundResId, int mImgResId) {
        this.englishTranslation = englishTranslation;
        this.soundResId = mSoundResId;
        this.imgResId = mImgResId;
    }

    public String getEnglishTranslation() {
        return englishTranslation;
    }

    public int getImgResId() {
        return imgResId;
    }

    public int getSoundResId() { return soundResId; }
}

