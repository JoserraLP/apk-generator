package org.openapitools.server.response;



import com.google.gson.annotations.SerializedName;

import java.util.*;
import java.io.*;

import org.openapitools.server.model.*;


public class LocationResponse {

    @SerializedName("resource")
    private String resource;

    @SerializedName("method")
    private String method;

    @SerializedName("params")
    private Params params;

    @SerializedName("sender")
    private String sender;

    @SerializedName("idRequest")
    private String idRequest;

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(String idRequest) {
        this.idRequest = idRequest;
    }

    public class Params {
    
      
        @SerializedName("latitude")
        private Double latitude;

      
        @SerializedName("longitude")
        private Double longitude;

      
        @SerializedName("radius")
        private Double radius;



      
        public Double getlatitude() {
            return latitude;
        }

      
        public Double getlongitude() {
            return longitude;
        }

      
        public Double getradius() {
            return radius;
        }


    }


}



