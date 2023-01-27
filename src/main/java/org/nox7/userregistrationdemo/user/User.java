package org.nox7.userregistrationdemo.user;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity(name="`user`")
public class User {
    private Long id;
    private String firstName;
    private String email;
    private LocalDate registrationDate;
    private Integer registrationTimestamp;
    private Integer age;

    public User(){

    }

    public User(Long id,
                String firstName,
                String email,
                LocalDate registrationDate,
                Integer registrationTimestamp,
                Integer age) {
        this.id = id;
        this.firstName = firstName;
        this.email = email;
        this.registrationDate = registrationDate;
        this.registrationTimestamp = registrationTimestamp;
        this.age = age;
    }

    public User(String firstName,
                String email,
                LocalDate registrationDate,
                Integer registrationTimestamp,
                Integer age) {
        this.firstName = firstName;
        this.email = email;
        this.registrationDate = registrationDate;
        this.registrationTimestamp = registrationTimestamp;
        this.age = age;
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

    public Integer getAge() {
        return age;
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

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", registrationDate=" + registrationDate +
                ", registrationTimestamp=" + registrationTimestamp +
                ", age=" + age +
                '}';
    }
}
