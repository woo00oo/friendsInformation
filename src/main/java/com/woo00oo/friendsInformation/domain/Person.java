package com.woo00oo.friendsInformation.domain;

import com.sun.istack.NotNull;
import com.woo00oo.friendsInformation.domain.dto.Birthday;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private int age;

    private String hobby;

    @NotNull
    private String bloodType;
    
    private String address;

    @Embedded
    private Birthday birthday;


    private String job;

    @ToString.Exclude
    private String phoneNumber;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Block block;

}
