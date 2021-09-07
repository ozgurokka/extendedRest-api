package com.okka.rest.services.restservices.service;

import com.okka.rest.services.restservices.UserNotFoundException;
import com.okka.rest.services.restservices.dao.UserDao;
import com.okka.rest.services.restservices.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by ozgurokka on 9/4/21 1:26 PM
 */
@Service
public class UserJPAService {

    @Autowired
    private UserDao dao;

    public List<Student> getAllUser(){
        return (List<Student>) dao.findAll();
    }

    public Student getUser(int id){
        Optional<Student> a = dao.findById(id);
        if(a.isPresent())
            return a.get();
        throw new UserNotFoundException(id+"");
    }

    public Student save(Student user) {
        dao.save(user);
        return user;
    }
}
