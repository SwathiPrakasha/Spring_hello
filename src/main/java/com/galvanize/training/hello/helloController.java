package com.galvanize.training.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/hello")
    public String printHello(){
        return ("Hello there");
    }

    @GetMapping("/hello/{name}")
    public String printHello(@PathVariable("name") String name){
        return ("Hello " + name);

    }



}
