package com.jfspps.restapi_spring.api.domain.billing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExpirationDate {

    private String date;
    private String timezone_type;
    private String timezone;
}
