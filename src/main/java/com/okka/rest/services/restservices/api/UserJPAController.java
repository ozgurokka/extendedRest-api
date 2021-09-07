package com.okka.rest.services.restservices.api;

import com.okka.rest.services.restservices.model.Note;
import com.okka.rest.services.restservices.model.Student;
import com.okka.rest.services.restservices.service.NoteService;
import com.okka.rest.services.restservices.service.UserJPAService;
import com.okka.rest.services.restservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RequestMapping("jpa")
@RestController
public class UserJPAController {

    @Autowired
    private UserJPAService userService;

    @Autowired
    private NoteService noteService;

    @GetMapping("/users")
    public List<Student> getAllUsers(){
     return userService.getAllUser();
    }

    @GetMapping("/users/{id}")
    public Student getUser(@PathVariable int id ){
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
    @PostMapping("/users/{id}/posts")
    public ResponseEntity<Object> createPost(@PathVariable int id, @Valid @RequestBody Note note) {
        Student s = userService.getUser(id);

        note.setStudent(s);

        noteService.save(note);


        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(note.getId()).toUri();

        return ResponseEntity.created(location).build();

    }

}
