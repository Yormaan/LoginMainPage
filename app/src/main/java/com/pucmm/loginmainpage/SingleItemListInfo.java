package com.pucmm.loginmainpage;


public class SingleItemListInfo {
    private int image_avatar;
    private int id;
    private String title;
    private String description;

    public SingleItemListInfo(int image_avatar, int id, String title, String description) {
        this.image_avatar = image_avatar;
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public int getImage_avatar() {
        return image_avatar;
    }

    public void setImage_avatar(int image_avatar) {
        this.image_avatar = image_avatar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
