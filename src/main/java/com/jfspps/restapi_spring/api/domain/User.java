package com.jfspps.restapi_spring.api.domain;

import com.jfspps.restapi_spring.api.domain.billing.Billing;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String gender;
    private Name name;
    private Location location;
    private String email;
    private Login login;
    private String phone;
    private Job job;
    private Billing billing;
    private String language;
    private String currency;
}
