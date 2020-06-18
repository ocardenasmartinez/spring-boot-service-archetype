package cl.marino.service.controllers;

import cl.marino.service.business.Business;
import cl.marino.service.dao.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private Business business;

    @PostMapping("/create")
    public ResponseEntity<String> createUser() {
        return new ResponseEntity<>(String.valueOf(business.createUser()), HttpStatus.OK);
    }

    @GetMapping("/getusers")
    public ResponseEntity<List<UserDTO>> getUsers() {
        return new ResponseEntity<>(business.getAllUsers(), HttpStatus.OK);
    }

}
