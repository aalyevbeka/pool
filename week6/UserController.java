package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserRepo userRepo;

    @RequestMapping(value = "user/save",method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody User user){
        user = userRepo.save(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @RequestMapping(value ="get/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> findUserById(@PathVariable int id){
        User user = userRepo.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);

    }
    @RequestMapping(value = "findall",method = RequestMethod.GET)
    public ResponseEntity<?> findAll(@RequestBody User user){
        List<User> users = userRepo.findAll();
        return new ResponseEntity<>(users,HttpStatus.OK);
    }


    @RequestMapping(value = "findByNameContaining/{name}",method = RequestMethod.GET)
    public ResponseEntity<?> findByNameContaining(@PathVariable String name){
        return new ResponseEntity<>(userRepo.findByNameContaining(name),HttpStatus.OK);
    }
}
