package phone.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import phone.book.model.Contact;
import phone.book.service.ContactService;

import java.util.List;

@RestController
@RequestMapping("user")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping("all-contacts")
    public ResponseEntity<List<Contact>> getAllContacts(){
        List<Contact> contacts = service.getAll();
        return new ResponseEntity<List<Contact>>(contacts, HttpStatus.OK);
    }
}