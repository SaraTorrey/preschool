package com.saratorrey.preschool.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class KitaComment {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String comment;

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

    public String getComment() {

        return comment;
    }

    public void setComment( String comment ) {

        this.comment = comment;
    }
}