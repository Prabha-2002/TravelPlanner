//package com.prabha.restapp.model;
//
//public class TopPortalRequest {
//
//    private String name;
//    private double rate;
//    private double rating;
//    private String location;
//    private String imageUrl;
//    private Long locationId; // Field to hold location ID
//
//    // Getters and Setters
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getRate() {
//        return rate;
//    }
//
//    public void setRate(double rate) {
//        this.rate = rate;
//    }
//
//    public double getRating() {
//        return rating;
//    }
//
//    public void setRating(double rating) {
//        this.rating = rating;
//    }
//
//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }
//
//    public String getImageUrl() {
//        return imageUrl;
//    }
//
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }
//
//    public Long getLocationId() {
//        return locationId;
//    }
//
//    public void setLocationId(Long locationId) {
//        this.locationId = locationId;
//    }
//
//    // Method to convert to TopPortal entity
//    public TopPortal toTopPortal() {
//        TopPortal topPortal = new TopPortal();
//        topPortal.setName(this.name);
//        topPortal.setRate(this.rate);
//        topPortal.setRating(this.rating);
//        topPortal.setLocation(this.location);
//        topPortal.setImageUrl(this.imageUrl);
//        return topPortal;
//    }
//}



package com.prabha.restapp.model;

public class TopPortalRequest {

    private String name;
    private double rate;
    private double rating;
    private String location;
    private String imageUrl;
    private Long locationId; // Field to hold location ID

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getLocationId() {
        return locationId;
    }

    public void setLocationId(Long locationId) {
        this.locationId = locationId;
    }

    // Method to convert to TopPortal entity
    public TopPortal toTopPortal() {
        TopPortal topPortal = new TopPortal();
        topPortal.setName(this.name);
        topPortal.setRate(this.rate);
        topPortal.setRating(this.rating);
        topPortal.setImageUrl(this.imageUrl);
        return topPortal;
    }
}
