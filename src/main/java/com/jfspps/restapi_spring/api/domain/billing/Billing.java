package com.jfspps.restapi_spring.api.domain.billing;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Billing {

    private String iban;
    private String swift;

    private Card card;
}
