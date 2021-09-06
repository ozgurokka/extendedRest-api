package com.okka.rest.services.restservices.api;

import com.okka.rest.services.restservices.model.HWBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Qualifier("messageSource")
    @Autowired
    private MessageSource msg;

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

    @GetMapping(path = "/hello-world-i18n")
    public String helloWorldi18n(){
        return msg.getMessage("good.morning.message",null, "Günaydın", LocaleContextHolder.getLocale());
    }
}
