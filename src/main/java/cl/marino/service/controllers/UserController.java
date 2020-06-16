package cl.marino.service.controllers;

import cl.marino.service.business.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private Business business;

    @GetMapping("/")
    public ResponseEntity<String> createUser() {
        return new ResponseEntity<>(String.valueOf(business.createUser()), HttpStatus.OK);
    }

}
