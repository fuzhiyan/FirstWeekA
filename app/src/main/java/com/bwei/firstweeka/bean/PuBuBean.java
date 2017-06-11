package com.bwei.firstweeka.bean;

/**
 * Created by Administrator on 2017/6/10.
 * time:
 * author:付智焱
 */

public class PuBuBean {
    private int image;
    private String text;

    public int getImage() {
        return image;
    }

    public String getText() {
        return text;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "PuBuBean{" +
                "image=" + image +
                ", text='" + text + '\'' +
                '}';
    }
}
