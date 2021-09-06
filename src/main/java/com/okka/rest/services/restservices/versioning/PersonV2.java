package com.okka.rest.services.restservices.versioning;

/**
 * Created by ozgurokka on 9/6/21 11:55 AM
 */
public class PersonV2 {
    private Name name;

    public PersonV2() {
        super();
    }

    public PersonV2(Name name) {
        super();
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

}