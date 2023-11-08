package com.example.aliva.aliva.models;

public class HotelModel {

    private int image;
    private String name;
    private String location;
    private String description;
    private double rating;
    private int price;

    public HotelModel(int image, String name, String location, String description, double rating, int price) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.price = price;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
