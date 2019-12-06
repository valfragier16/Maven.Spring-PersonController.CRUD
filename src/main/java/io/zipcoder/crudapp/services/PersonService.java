package io.zipcoder.crudapp.services;

import io.zipcoder.crudapp.repositories.PersonRepository;

public class PersonService {
    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

}
