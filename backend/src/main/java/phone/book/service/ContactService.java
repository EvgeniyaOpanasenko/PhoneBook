package phone.book.service;


import phone.book.model.Contact;

import java.util.List;

public interface ContactService {

    boolean save(Contact contact);

    boolean delete(long id);

    boolean edit(long id);

    List<Contact> getAll();
}
