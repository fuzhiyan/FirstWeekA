package com.bwei.firstweeka.bean;

/**
 * Created by Administrator on 2017/6/10.
 * time:
 * author:付智焱
 */

public class Bean {
    private String title;
    private String text;
    private String image;

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public String getImage() {
        return image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImage(String image) {
        this.image = image;
    }



    @Override
    public String toString() {
        return "Bean{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
