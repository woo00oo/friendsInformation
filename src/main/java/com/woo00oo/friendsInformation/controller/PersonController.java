package com.woo00oo.friendsInformation.controller;

import com.woo00oo.friendsInformation.domain.Person;
import com.woo00oo.friendsInformation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    public Person getPerson(Long id){
        return personService.getPerson(id);
    }
}
