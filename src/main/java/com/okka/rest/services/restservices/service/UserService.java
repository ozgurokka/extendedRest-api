package com.okka.rest.services.restservices.service;

import com.okka.rest.services.restservices.UserNotFoundException;
import com.okka.rest.services.restservices.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ozgurokka on 9/4/21 1:26 PM
 */
@Service
public class UserService {

    private static List<User> userList = new ArrayList<>();

    private static User u1 = new User("1","özgür","okka");
    private static User u2 = new User("2","özlem","okka");
    private static User u3 = new User("3","fatma","okka");

    static {
        userList.add(u1);userList.add(u2);userList.add(u3);
    }

    public List<User> getAllUser(){
        return  userList;
    }
    public User getUser(String id){
        for (User u: userList) {
            if(u.getId().equals(id))
                return  u;
        }
        throw new UserNotFoundException(id);
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(userList.size()+1+"");
        }
        userList.add(user);
        return user;
    }
}
