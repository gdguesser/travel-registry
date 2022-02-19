package com.travelregistry.travel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Travel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String origin;

    private String destiny;

    private float distanceBetweenOriginAndDestiny;

    public Travel(String origin, String destiny, float distanceBetweenOriginAndDestiny) {
        this.origin = origin;
        this.destiny = destiny;
        this.distanceBetweenOriginAndDestiny = distanceBetweenOriginAndDestiny;
    }

    @Deprecated
    public Travel() {
    }

    public Long getId() {
        return id;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public float getDistanceBetweenOriginAndDestiny() {
        return distanceBetweenOriginAndDestiny;
    }

    public TravelDto toDto() {
        return new TravelDto(this.origin, this.destiny, this.distanceBetweenOriginAndDestiny);
    }
}
