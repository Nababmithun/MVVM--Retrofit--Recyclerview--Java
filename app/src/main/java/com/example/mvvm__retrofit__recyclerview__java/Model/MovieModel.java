package com.example.mvvm__retrofit__recyclerview__java.Model;

public class MovieModel {
    private String title;
    private String image;


    public MovieModel(String title, String image) {
        this.title = title;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
