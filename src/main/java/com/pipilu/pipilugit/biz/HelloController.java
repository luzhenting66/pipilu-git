package com.pipilu.pipilugit.biz;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/{name}")
    public String name(@PathVariable("name")String name){

        return "hello,welcome to git "+name
                +"  github  pubKey ";
    }
}
