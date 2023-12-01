package com.example.aliva.aliva.models;

public class HotelModel {

    private int image;
    private String name;
    private String location;
    private String description;
    private String rating;
    private String price;

    public HotelModel(String name, String location, String description, String rating, String price) {
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.price = price;
        this.description = description;
    }

    public HotelModel(int image, String name, String location, String description, String rating, String price) {
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
