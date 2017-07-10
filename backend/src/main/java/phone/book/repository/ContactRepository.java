package phone.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import phone.book.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {
}
