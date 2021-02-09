package com.jfspps.restapi_spring.api.domain.billing;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Card implements Serializable {

    private String type;
    private String number;
    private ExpirationDate expirationDate;
}
