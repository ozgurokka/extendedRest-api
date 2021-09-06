package com.okka.rest.services.restservices.api;

import com.okka.rest.services.restservices.model.Student;
import com.okka.rest.services.restservices.service.UserJPAService;
import com.okka.rest.services.restservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RequestMapping("jpa")
@RestController
public class UserJPAController {

    @Autowired
    private UserJPAService userService;

    @GetMapping("/users")
    public List<Student> getAllUsers(){
     return userService.getAllUser();
    }

    @GetMapping("/users/{id}")
    public Student getUser(@PathVariable String id ){
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@Valid @RequestBody Student user) {
        Student savedUser = userService.save(user);
        // CREATED
        // /user/{id}     savedUser.getId()

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
