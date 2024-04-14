package com.springcourse.AirportRestApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@EqualsAndHashCode(of = {"phoneNumber", "departureFlights", "arriveFlights", "planes", "airlines"})
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "airports")
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private Integer runways; //количество взлетных полос

//    @ToString.Exclude
    @OneToMany(mappedBy = "airport", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
    private List<Phone> phoneNumber;

//    @ToString.Exclude
    @OneToMany(mappedBy = "departureAirport", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
    private Set<Flight>  departureFlights;

//    @ToString.Exclude
    @OneToMany(mappedBy = "arriveAirport", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
    private Set<Flight> arriveFlights;

//    @ToString.Exclude
    @OneToMany(mappedBy = "AirportCurrent", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<Plane> planes;

//    @ToString.Exclude
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinTable(name = "airports_airlines",
            joinColumns = @JoinColumn(name = "id_airports"),
            inverseJoinColumns = @JoinColumn(name = "id_airlines"))
    private Set<Airline> airlines;
}
