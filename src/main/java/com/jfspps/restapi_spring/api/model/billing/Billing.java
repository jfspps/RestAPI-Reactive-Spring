package com.jfspps.restapi_spring.api.model.billing;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Billing implements Serializable {

    private String iban;
    private String swift;

    private Card card;
}
