package phone.book.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min = 5, max = 10)
    @Pattern(regexp = "\\`|\\~|\\!|\\@|\\#|\\$|\\%|\\^|\\&|\\*|" +
            "\\(|\\)|\\+|\\=|\\[|\\{|\\]|\\}|\\||\\\\|\\'|\\<|\\,|" +
            "\\.|\\>|\\?|\\/|\\\"\"|\\;|\\:|\\s")
    private String login;

    @Size(min = 5)
    private String password;
    private String passwordConfirm;

    @Size(min = 5)
    private String FIO;


    @OneToMany(mappedBy = "user")
    List<Contact> contactList;

    public User() {
    }

    public User(String login, String password,
                String FIO) {
        this.login = login;
        this.password = password;
        this.FIO = FIO;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }
}