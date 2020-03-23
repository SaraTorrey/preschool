package com.saratorrey.preschool.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Preschool {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String url;
    private String image;

    public Long getId() {

        return id;
    }

    public void setId( Long id ) {

        this.id = id;
    }

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


    @Override public String toString() {

        return "Preschool" +
                + id +
               "as shown in the photo" + image + "is called" + name + "the url is" +
                url;
    }
}