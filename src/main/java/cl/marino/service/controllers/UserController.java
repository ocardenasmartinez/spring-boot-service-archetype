package cl.marino.service.controllers;

import cl.marino.service.business.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Business business;

    @GetMapping("/")
    public String createUser(@RequestParam String firstName, @RequestParam String lastName){
        return "Hello " + business.createUser(firstName, lastName);
    }

}
