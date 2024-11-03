package com.springsecuritycourse.springsection1.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class WelcomeContoller {

    @GetMapping("/welcome")
    public String welcomeSecurity(){
        return "Welcome to Spring Security Course";
    }
}
