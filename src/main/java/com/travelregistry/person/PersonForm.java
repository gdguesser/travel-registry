package com.travelregistry.person;

import java.time.LocalDateTime;

public class PersonForm {
    private final String name;
    private final String surname;
    private final String email;
    private final String biography;

    public PersonForm(String name, String surname, String email, String biography) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.biography = biography;
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

    public Person toModel() {
        return new Person(this.name, this.surname, this.email, this.biography);
    }
}
