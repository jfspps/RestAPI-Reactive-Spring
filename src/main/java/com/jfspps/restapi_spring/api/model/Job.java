package com.jfspps.restapi_spring.api.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Job implements Serializable {

    private String title;
    private String company;
}