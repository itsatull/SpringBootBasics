package com.springbootbasics.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    //1.way to handle get request
   // @RequestMapping(value = "/",method = RequestMethod.GET)
    //2.way
    @GetMapping("/")
    public String helloworld(){
        return "home page";
    }

}
