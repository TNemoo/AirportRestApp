package com.springcourse.AirportRestApp.DTO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.springcourse.AirportRestApp.models.CharClass;
import lombok.*;

import javax.persistence.*;

@ToString
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Embeddable
public class ClientDetailsDTO {
    private Long id;
    private String paymentAccount;
    private Float allFlightTime; //min
    private Boolean privateClient;
    private CharClass charClass;
}