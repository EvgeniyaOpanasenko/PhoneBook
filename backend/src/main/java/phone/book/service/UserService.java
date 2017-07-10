package phone.book.service;


import phone.book.model.User;

public interface UserService {

    boolean save(User user);

    User findByLogin(String login);

    Iterable<User> getAll();

    User getById(long id);
}
