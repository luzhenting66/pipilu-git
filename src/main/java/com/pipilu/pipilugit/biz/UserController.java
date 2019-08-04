package com.pipilu.pipilugit.biz;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hello/{name}")
    public String hellUser(@PathVariable("name")String name){
        return "hello,"+name;
    }
}
