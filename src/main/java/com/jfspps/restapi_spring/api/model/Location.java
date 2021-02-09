package com.jfspps.restapi_spring.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Location implements Serializable {

    private String street;
    private String city;
    private String state;
    private String postcode;
}