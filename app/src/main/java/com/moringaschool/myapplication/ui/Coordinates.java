
package com.moringaschool.myapplication.ui;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Coordinates {

    @SerializedName("latitude")
    @Expose
    private Double latitude;
    @SerializedName("longitude")
    @Expose
    private Double longitude;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Coordinates() {
    }

    /**
     * 
     * @param latitude
     * @param longitude
     */
    public Coordinates(Double latitude, Double longitude) {
        super();
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public static class YelpBusinessesSearchResponse {

        @SerializedName("total")
        @Expose
        private Integer total;
        @SerializedName("businesses")
        @Expose
        private List<Business> businesses = null;
        @SerializedName("region")
        @Expose
        private Region region;

        /**
         * No args constructor for use in serialization
         *
         */
        public YelpBusinessesSearchResponse() {
        }

        /**
         *
         * @param total
         * @param region
         * @param businesses
         */
        public YelpBusinessesSearchResponse(Integer total, List<Business> businesses, Region region) {
            super();
            this.total = total;
            this.businesses = businesses;
            this.region = region;
        }

        public Integer getTotal() {
            return total;
        }

        public void setTotal(Integer total) {
            this.total = total;
        }

        public List<Business> getBusinesses() {
            return businesses;
        }

        public void setBusinesses(List<Business> businesses) {
            this.businesses = businesses;
        }

        public Region getRegion() {
            return region;
        }

        public void setRegion(Region region) {
            this.region = region;
        }

    }
}
