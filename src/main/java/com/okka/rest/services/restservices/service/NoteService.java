package com.okka.rest.services.restservices.service;

import com.okka.rest.services.restservices.dao.NoteDao;
import com.okka.rest.services.restservices.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ozgurokka on 9/7/21 10:30 AM
 */
@Service
public class NoteService {
    @Autowired
    private NoteDao dao;

    public Note save(Note n){
        dao.save(n);
        return  n;
    }
}
