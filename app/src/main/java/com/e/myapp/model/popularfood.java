package com.e.myapp.model;

public class popularfood {
    String name;
    String image;
    String price;

    public String getName () {
        return name;
    }

    public String getImage () {
        return image;
    }

    public String getPrice () {
        return price;
    }

    public popularfood ( String name, String image, String price ) {
        this.name = name;
        this.image = image;
        this.price = price;
    }



}
