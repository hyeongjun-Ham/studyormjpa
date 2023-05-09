package org.studyjpa;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
public class Album extends Item{

    private String artist;
}
