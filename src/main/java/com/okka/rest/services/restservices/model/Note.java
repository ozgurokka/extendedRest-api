package com.okka.rest.services.restservices.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

/**
 * Created by ozgurokka on 9/6/21 9:19 PM
 */
@Entity
public class Note {

    @Id
    @GeneratedValue
    private int id;

    private String note;

    @JsonIgnore
    @ManyToOne(fetch=FetchType.LAZY)
    private Student student;

    public Note() {
    }

    public int getId() {
        return id;
    }

    public String getNote() {
        return note;
    }

    public Student getStudent() {
        return student;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
