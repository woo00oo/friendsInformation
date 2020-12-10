package com.woo00oo.friendsInformation.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Birthday {

    private int yearOfBirthday;


    private int monthOfBirthday;

    private int dayOfBirthday;
}
