package com.omelchenkoaleks.toolsshop;

import androidx.annotation.NonNull;

public class Drill {
    private String mTitle;
    private String mInfo;
    private int mImageResourceId;

    public Drill(String title, String info, int imageResourceId) {
        mTitle = title;
        mInfo = info;
        mImageResourceId = imageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getInfo() {
        return mInfo;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    @NonNull
    @Override
    public String toString() {
        return mTitle;
    }
}
