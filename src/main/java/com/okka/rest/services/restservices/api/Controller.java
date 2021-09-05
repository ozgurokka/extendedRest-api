package com.okka.rest.services.restservices.api;

import com.okka.rest.services.restservices.model.HWBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping(path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping(path = "/hello-world-bean")
    public HWBean helloWorldBean(){
        return new HWBean("Hello World");
    }

    @GetMapping(path = "/hello-world-bean-parameter/{param}")
    public HWBean helloWorldBeanParameter(@PathVariable String param){
        return new HWBean(param);
    }

}
