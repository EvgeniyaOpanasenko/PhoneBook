package phone.book.service;


import phone.book.model.User;

public interface UserService {

    void save(User user);

    User findByLogin(String login);

    Iterable<User> getAll();

    User getById(long id);
}
