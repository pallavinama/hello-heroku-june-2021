package com.example.TestAppH.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class AppController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.CREATED)
    public String doHello(){
        return "Hello Heroku";
    }
    @RequestMapping(value = "/hi/{name}", method = RequestMethod.GET)
    public String doHi(@PathVariable String name) {
        return "What's happening, " + name;
    }

}
