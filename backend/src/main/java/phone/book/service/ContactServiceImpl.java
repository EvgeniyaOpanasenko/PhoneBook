package phone.book.service;

import org.springframework.stereotype.Service;
import phone.book.model.Contact;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {
    @Override
    public boolean save(Contact contact) {
        return false;
    }

    @Override
    public boolean delete(long id) {
        return false;
    }

    @Override
    public boolean edit(long id) {
        return false;
    }

    @Override
    public List<Contact> getAll() {
        return null;
    }
}
