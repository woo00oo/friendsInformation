package com.woo00oo.friendsInformation.repository;

import com.woo00oo.friendsInformation.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
