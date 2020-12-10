package com.woo00oo.friendsInformation.repository;

import com.woo00oo.friendsInformation.domain.Person;
import com.woo00oo.friendsInformation.domain.dto.Birthday;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class PersonRepositoryTests {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void crud(){
        Person person = new Person();
        person.setName("test");
        person.setAge(25);

        personRepository.save(person);

//        System.out.println(personRepository.findAll());

        List<Person> people = personRepository.findAll();

        assertThat(people.size()).isEqualTo(1);
        assertThat(people.get(0).getName()).isEqualTo("test");
        assertThat(people.get(0).getAge()).isEqualTo(25);
    }

    @Test
    public void getBirthday(){
        Birthday birthday1 = Birthday.builder()
                .yearOfBirthday(2020)
                .monthOfBirthday(8)
                .dayOfBirthday(1)
                .build();

        Birthday birthday2= Birthday.builder()
                .yearOfBirthday(2020)
                .monthOfBirthday(8)
                .dayOfBirthday(2)
                .build();

        Person person = Person.builder()
                .name("테스트1")
                .age(10)
                .bloodType("A")
                .birthday(birthday1)
                .build();

        Person person2 = Person.builder()
                .name("테스트1")
                .age(10)
                .bloodType("B")
                .birthday(birthday2)
                .build();

        personRepository.save(person);
        personRepository.save(person2);

        List<Person> personList = personRepository.findByMonthOfBirthday(8,2);

        personList.forEach(System.out::println);



    }



}