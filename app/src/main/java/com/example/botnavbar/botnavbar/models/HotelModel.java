package com.example.botnavbar.botnavbar.models;

public class HotelModel {

    private int image;
    private String name;
    private String location;
    private double rating;
    private int price;

    public HotelModel(int image, String name, String location, double rating, int price) {
        this.image = image;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.price = price;
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
