package com.jfspps.restapi_spring.api.domain.billing;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ExpirationDate implements Serializable {

    private String date;
    private String timezone_type;
    private String timezone;
}
