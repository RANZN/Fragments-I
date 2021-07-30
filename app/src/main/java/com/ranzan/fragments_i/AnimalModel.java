package com.ranzan.fragments_i;

public class AnimalModel {
    private String name;
    private int imageId;

    public AnimalModel(String name, int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
