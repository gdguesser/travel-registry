package com.travelregistry.travel;

public class TravelDto {

    private String origin;
    private String destiny;
    private float distanceBetweenOriginAndDestiny;

    public TravelDto(String origin, String destiny, float distanceBetweenOriginAndDestiny) {
        this.origin = origin;
        this.destiny = destiny;
        this.distanceBetweenOriginAndDestiny = distanceBetweenOriginAndDestiny;
    }

    @Deprecated
    public TravelDto(String origin) {
        this.origin = origin;
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
}
