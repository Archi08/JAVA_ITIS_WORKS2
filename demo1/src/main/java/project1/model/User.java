package project1;


import javax.persistence.*;
import java.util.List;

/**
 * 25.01.17
 * User
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
@Entity
@Table(name = "pflb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;



    @Column(name = "user_name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "otech")
    private String otech;

    @Column(name = "email")
    private String email;


    public User() {
    }

    public User(String name, String surname, String otech, String email) {
        this.name = name;
        this.surname = surname;
        this.otech = otech;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getOtech() {
        return otech;
    }

    public void setOtech(String otech) {
        this.otech = otech;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
