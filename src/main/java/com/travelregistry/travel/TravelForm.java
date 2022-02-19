package com.travelregistry.travel;

public class TravelForm {

    private String origin;
    private String destiny;
    private float distanceBetweenOriginAndDestiny;

    public String getOrigin() {
        return origin;
    }

    public String getDestiny() {
        return destiny;
    }

    public float getDistanceBetweenOriginAndDestiny() {
        return distanceBetweenOriginAndDestiny;
    }

    public Travel toModel() {
        return new Travel(this.origin, this.destiny, this.distanceBetweenOriginAndDestiny);
    }
}
