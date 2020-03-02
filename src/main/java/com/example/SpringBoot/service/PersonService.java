package com.example.SpringBoot.service;

import com.example.SpringBoot.dao.PersonDao;
import com.example.SpringBoot.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {

    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.addPerson(person);
    }

    public List<Person> getAllPeople() {
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonById(id);
    }
}
