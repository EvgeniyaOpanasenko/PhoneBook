package phone.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import phone.book.model.Contact;
import phone.book.model.User;
import phone.book.service.ContactService;
import phone.book.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class MainController {

    @Autowired
    private UserService userService;

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<List<Contact>> findContacts(@PathVariable long id) {
        List<Contact> contacts =  contactService.getContactsByAuthorId(id);
        return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createUser(@RequestBody User user, UriComponentsBuilder builder) {
        boolean flag = userService.save(user);
        if (flag == false) {
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/user?id={id}").buildAndExpand(user.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

  /*  @GetMapping("/user{id}")
    public ResponseEntity<List<Contact>> getAllContactsByUser() {
        List<Contact> contacts =  contactService.getContactsByAuthor(id);
        return new ResponseEntity<List<User>>(contacts, HttpStatus.OK);
    }*/
}
