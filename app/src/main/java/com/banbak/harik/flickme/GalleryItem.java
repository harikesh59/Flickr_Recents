package com.banbak.harik.flickme;

/**
 * Created by harik on 1/10/2018.
 */

public class GalleryItem {

    private String mCaption;
    private String mId;
    private String mUrl;
    @Override
    public String toString() {
        return mCaption;
    }

    public String getCaption() {
        return mCaption;
    }

    public String getId() {
        return mId;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setCaption(String caption) {
        mCaption = caption;
    }

    public void setId(String id) {
        mId = id;
    }

    public void setUrl(String url) {
        mUrl = url;
    }
}
