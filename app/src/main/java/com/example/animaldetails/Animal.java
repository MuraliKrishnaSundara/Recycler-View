package com.example.animaldetails;

public class Animal {

    private String name;
    private String sound;
    private int imageView;

    public Animal(String name, String sound, int imageView) {
        this.name = name;
        this.sound = sound;
        this.imageView = imageView;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public int getImageView() {
        return imageView;
    }
}