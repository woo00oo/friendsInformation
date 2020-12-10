package com.woo00oo.friendsInformation.service;

import com.woo00oo.friendsInformation.domain.Block;
import com.woo00oo.friendsInformation.domain.Person;
import com.woo00oo.friendsInformation.repository.BlockRepository;
import com.woo00oo.friendsInformation.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private BlockRepository blockRepository;

    public List<Person> getPeopleExcludeBlocks(){
        return personRepository.findByBlockIsNull();
    }

    public List<Person> getPeopleByName(String name){
        return personRepository.findByName(name);
    }

    @Transactional
    public Person getPerson(Long id){
        Person person = personRepository.findById(id).orElse(null);

        log.info("person: {}",person);

        return person;
    }
}
