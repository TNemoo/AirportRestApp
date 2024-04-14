package com.springcourse.AirportRestApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;

@ToString
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@EqualsAndHashCode(of = {"allFlightTime", "privateClient", "charClass"})
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "client_details")
//@Embeddable
public class ClientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "payment_account")
    private String paymentAccount;

    @Column(name = "all_flight_time")
    private Float allFlightTime; //min

    @Column(name = "private_client")
    private Boolean privateClient;

    @Column(name = "char_class")
    private CharClass charClass;
}