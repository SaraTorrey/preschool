package com.saratorrey.preschool.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Kita {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String shortDescription;
    private String url;
    private String image;

    @OneToMany(cascade = CascadeType.ALL)
    private List<KitaComment> comments = new ArrayList<>();

    public List<KitaComment> getComments() {

        return comments;
    }

    public void setComments( List<KitaComment> comments ) {

        this.comments = comments;
    }

    public void setId( long id) {
        this.id = id;
    }

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

    public String getShortDescription() {

        return shortDescription;
    }

    public void setShortDescription( String shortDescription ) {

        this.shortDescription = shortDescription;
    }

    @Override public String toString() {

        return "Preschool" +
                + id +
               "as shown in the photo" + image + "is called" + name + "the url is" +
                url + shortDescription;
    }
}