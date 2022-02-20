package com.travelregistry.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/register")
    public PersonDto register(@RequestBody PersonForm personForm) {

        boolean emailAlreadyExists = personRepository.existsPersonByEmail(personForm.getEmail());

        if (emailAlreadyExists) {
            throw new IllegalArgumentException("E-mail já está cadastrado");
        }

        Person person = personForm.toModel();
        personRepository.save(person);
        return person.toDto();
    }

    @GetMapping
    public List<PersonDto> listAll() {
        List<Person> personsList = personRepository.findAll();
        List<PersonDto> personsDtoList = new ArrayList<>();

        if (!personsList.isEmpty()) {
            for (Person person : personsList) {
                personsDtoList.add(person.toDto());
            }
        }

        return personsDtoList;
    }
}
