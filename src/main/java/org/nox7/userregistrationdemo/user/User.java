package org.nox7.userregistrationdemo.user;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity(name="`user`")
@Table
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long id;
    private String firstName;
    private String email;
    private LocalDate registrationDate;
    private Integer registrationTimestamp;
    @Transient
    private Integer accountAge;

    public User(){

    }

    public User(Long id,
                String firstName,
                String email,
                LocalDate registrationDate,
                Integer registrationTimestamp) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.registrationDate = registrationDate;
        this.registrationTimestamp = registrationTimestamp;
    }

    public User(String firstName,
                String email,
                LocalDate registrationDate,
                Integer registrationTimestamp) {
        this.firstName = firstName;
        this.email = email;
        this.registrationDate = registrationDate;
        this.registrationTimestamp = registrationTimestamp;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public Integer getRegistrationTimestamp() {
        return registrationTimestamp;
    }

    public Integer getAccountAge() {
        return Period.between(this.registrationDate, LocalDate.now()).getDays() * 86400;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public void setRegistrationTimestamp(Integer registrationTimestamp) {
        this.registrationTimestamp = registrationTimestamp;
    }

    public void setAccountAge(Integer age) {
        this.accountAge = accountAge;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", registrationDate=" + registrationDate +
                ", registrationTimestamp=" + registrationTimestamp +
                ", accountAge=" + accountAge +
                '}';
    }
}
