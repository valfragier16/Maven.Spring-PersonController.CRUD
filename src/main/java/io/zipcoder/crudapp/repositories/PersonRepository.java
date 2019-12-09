package io.zipcoder.crudapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import io.zipcoder.crudapp.models.Person;

import java.util.Map;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
    Person findById(Long id);

}
