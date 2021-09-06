package com.okka.rest.services.restservices.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
public class Student {

    @Id
    private String id;

    @Size(min = 2, message = "İsim min 2 karakter olmalıdır.")
    private String name;

    private String surname;

    public Student(String id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Student(){}

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
