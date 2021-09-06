package com.okka.rest.services.restservices.service;

import com.okka.rest.services.restservices.UserNotFoundException;
import com.okka.rest.services.restservices.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ozgurokka on 9/4/21 1:26 PM
 */
@Service
public class UserService {

    private static List<Student> userList = new ArrayList<>();

    private static Student u1 = new Student("1","özgür","okka");
    private static Student u2 = new Student("2","özlem","okka");
    private static Student u3 = new Student("3","fatma","okka");

    static {
        userList.add(u1);userList.add(u2);userList.add(u3);
    }

    public List<Student> getAllUser(){
        return  userList;
    }
    public Student getUser(String id){
        for (Student u: userList) {
            if(u.getId().equals(id))
                return  u;
        }
        throw new UserNotFoundException(id);
    }

    public Student save(Student user) {
        if (user.getId() == null) {
            user.setId(userList.size()+1+"");
        }
        userList.add(user);
        return user;
    }
}
