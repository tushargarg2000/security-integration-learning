package com.acciojob.springsecurityintegration;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIs {


    @GetMapping("hiAll")
    public String sayHello(){

        return "Hello Everyone! Welcome to spring authentication class";
    }


    @GetMapping("hiAdmin")
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    public String helloAdmin(){
        return "Hi Admin, You have been authenticated, Welcome Admin";
    }

    @GetMapping("hiUser")
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String helloUser(){
        return "Hi User, You have been authenticated, Welcome User";
    }

}
