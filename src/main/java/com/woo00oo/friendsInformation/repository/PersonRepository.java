package com.woo00oo.friendsInformation.repository;

import com.woo00oo.friendsInformation.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByName(String name);

    List<Person> findByBlockIsNull();

    List<Person> findByBloodType(String bloodType);


    @Query(value = "select person from Person person where person.birthday.monthOfBirthday = ?1 and person.birthday.dayOfBirthday = ?2")
    List<Person> findByMonthOfBirthday(int monthOfBirthday, int dayOfBirthday);



    //@Query(value = "select person from Person person where person.birthday.monthOfBirthday = :monthOfBirthday and person.birthday.dayOfBirthday = :dayOfBirthday")
    //List<Person> findByMonthOfBirthday(@Param("monthOfBirthday") int monthOfBirthday,@Param("dayOfBirthday") int dayOfBirthday);
}
