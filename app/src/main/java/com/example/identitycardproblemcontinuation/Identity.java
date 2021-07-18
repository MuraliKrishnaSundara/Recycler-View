package com.example.identitycardproblemcontinuation;

public class Identity {

    private String company;
    private int imageView;
    private String age;
    private String profession;

    public Identity(String company, int imageView, String age, String profession) {
        this.company = company;
        this.imageView = imageView;
        this.age = age;
        this.profession = profession;
    }

    public String getCompany() {
        return company;
    }

    public int getImageView() {
        return imageView;
    }

    public String getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }
}