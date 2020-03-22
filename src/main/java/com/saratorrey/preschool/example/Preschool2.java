package com.saratorrey.preschool.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Preschool2 {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String url;
    private String image;

    public String getName() {

        return name;
    }

    public void setName( String name ) {

        this.name = name;
    }

    public String getUrl() {

        return url;
    }

    public void setUrl( String url ) {

        this.url = url;
    }

    public String getImage() {

        return image;
    }

    public void setImage( String image ) {

        this.image = image;
    }
}