package com.ashu.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/spring-boot")
public class SpringBootController {

    @RequestMapping(method = RequestMethod.GET, path = "/helloworldget")
    public @ResponseBody String helloWorld(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/helloworldpost")
    public @ResponseBody String helloWorld(@RequestBody String name){
        return "Hello " + name;
    }
}
