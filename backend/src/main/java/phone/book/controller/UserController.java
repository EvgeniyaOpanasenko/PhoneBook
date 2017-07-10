package phone.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import phone.book.model.User;
import phone.book.service.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/all-users")
    public ResponseEntity<List<User>> getAllContacts() {
        List<User> contacts = (List<User>) service.getAll();
        return new ResponseEntity<List<User>>(contacts, HttpStatus.OK);
    }

}
