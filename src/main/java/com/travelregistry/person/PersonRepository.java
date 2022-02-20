package com.travelregistry.person;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    boolean existsPersonByEmail(String personEmail);
}
