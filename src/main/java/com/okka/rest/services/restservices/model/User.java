package com.okka.rest.services.restservices.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.validation.constraints.Size;

public class User {

    @JsonIgnore
    private String id;

    @Size(min = 2, message = "İsim min 2 karakter olmalıdır.")
    private String name;
    private String surname;

    public User(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
