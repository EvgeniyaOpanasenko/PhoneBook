package phone.book.service;


import phone.book.model.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAll();

    Contact getById(long articleId);

    boolean create(Contact contact);

    void update(Contact contact);

    void delete(long id);

    List<Contact> getContactsByAuthorId(long id);
}