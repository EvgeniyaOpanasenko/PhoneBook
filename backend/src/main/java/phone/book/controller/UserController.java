package phone.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import phone.book.repository.UserRepository;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;


}
