package com.okka.rest.services.restservices.dao;

import com.okka.rest.services.restservices.model.Note;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ozgurokka on 9/7/21 10:30 AM
 */
public interface NoteDao extends CrudRepository<Note,Integer> {
}
