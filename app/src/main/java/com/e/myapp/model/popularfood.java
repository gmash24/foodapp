package com.e.myapp.model;

public class popularfood {
    String name;
    Integer image;
    String price;


    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public Integer getImage () {
        return image;
    }

    public void setImage ( Integer image ) {
        this.image = image;
    }

    public String getPrice () {
        return price;
    }

    public void setPrice ( String price ) {
        this.price = price;
    }

    public popularfood ( String name, Integer image, String price ) {
        this.name = name;
        this.image = image;
        this.price = price;
    }



}
