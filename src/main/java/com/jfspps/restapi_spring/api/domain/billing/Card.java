package com.jfspps.restapi_spring.api.domain.billing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Card {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
}
