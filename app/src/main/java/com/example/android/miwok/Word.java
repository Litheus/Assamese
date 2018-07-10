package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgResourceId = IS_IMG_AVAILABLE;
    private static final int IS_IMG_AVAILABLE = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResouceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResouceId;

    }

    public Word(String defaultTranslation, String miwokTranslation, int imgResourceId, int audioResouceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImgResourceId = imgResourceId;
        mAudioResourceId = audioResouceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getmImgResourceId() { return mImgResourceId;}

    public int getmAudioResourceId(){ return mAudioResourceId;}

    public boolean hasImage(){
        return mImgResourceId != IS_IMG_AVAILABLE;
    }
}
