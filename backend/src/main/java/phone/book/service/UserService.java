package phone.book.service;


import phone.book.model.User;

public interface UserService {

    void save(User user);

    User findByLogin(String login);
}
