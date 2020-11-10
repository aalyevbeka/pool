package flyway.demo.controller;
import flyway.demo.model.User;
import flyway.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {


    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody User user) {
        user = repository.save(user);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable int id){
        User user = repository.getOne(id);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}

