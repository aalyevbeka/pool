package library.controller;


import library.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/user/")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "byid/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUserById(@PathVariable int id){
        return new ResponseEntity<Object>(userRepository.findById(id), HttpStatus.OK);
    }


    @RequestMapping(value = "all", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers(){
        return new ResponseEntity<Object>(userRepository.findAll(),HttpStatus.OK);
    }


}
