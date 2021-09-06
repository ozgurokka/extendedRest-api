package com.okka.rest.services.restservices.dao;

import com.okka.rest.services.restservices.model.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ozgurokka on 9/6/21 4:55 PM
 */
public interface UserDao extends CrudRepository<Student,String> {
}
