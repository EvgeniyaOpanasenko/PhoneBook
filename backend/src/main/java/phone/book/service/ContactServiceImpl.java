package phone.book.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import phone.book.model.Contact;
import phone.book.repository.ContactRepository;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;

    @Override
    public synchronized boolean create(Contact contact) {

        if (getAll().stream().anyMatch(c -> c.getCellPhone().
                equals(contact.getCellPhone()))) {
            return false;
        } else {
            repository.save(contact);
        }
        return true;
    }

    @Override
    public void update(Contact contact) {

    }

    @Override
    public void delete(long id) {

    }

    @Override
    public List<Contact> getAll() {
        return (List<Contact>) repository.findAll();
    }

    @Override
    public Contact getById(long articleId) {
        return null;
    }
}