package com.example.recyclerview_iiwe;

public class StudentModel {
    private String name;
    private int age;
    private String address;
    private String Dob;
    private int imageId;

    public StudentModel(String name, int age, String address, String Dob, int imageId) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.Dob = Dob;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getDob() {
        return Dob;
    }

    public int getImageId() {
        return imageId;
    }
}