package phone.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phone.book.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String name);
}