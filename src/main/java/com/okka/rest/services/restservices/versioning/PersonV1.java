package com.okka.rest.services.restservices.versioning;

/**
 * Created by ozgurokka on 9/6/21 11:55 AM
 */
public class PersonV1 {
    private String name;

    public PersonV1() {
        super();
    }

    public PersonV1(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}