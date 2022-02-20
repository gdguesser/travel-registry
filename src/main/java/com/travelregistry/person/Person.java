package com.travelregistry.person;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String email;
    private String biography;
    private final LocalDateTime memberSince = LocalDateTime.now();

    public Person(Long id, String name, String surname, String email, String biography) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.biography = biography;
    }

    public Person(String name, String surname, String email, String biography) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.biography = biography;
    }

    @Deprecated
    public Person() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getBiography() {
        return biography;
    }

    public LocalDateTime getMemberSince() {
        return memberSince;
    }

    public PersonDto toDto() {
        return new PersonDto(this.id, this.name, this.surname, email, this.biography, this.memberSince);
    }
}
