package com.travelregistry.person;

import java.time.LocalDateTime;

public class PersonDto {
    private final Long id;
    private final String name;
    private final String surname;
    private final String email;
    private final String biography;
    private final LocalDateTime dob;

    public PersonDto(Long id, String name, String surname, String email, String biography, LocalDateTime dob) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.biography = biography;
        this.dob = dob;
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

    public LocalDateTime getDob() {
        return dob;
    }
}
