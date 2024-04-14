package com.springcourse.AirportRestApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@EqualsAndHashCode(of = {"flights", "seats", "airline", "AirportCurrent"})
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planes")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plane_model")
    private String planeModel;

    private Integer speed; //км/ч

    @Column(name = "max_baggage")
    private Double maxBaggage;//m3

    @Column(name = "board_number")
    private Integer boardNumber; //объем бака

    private Integer crew; //экипаж

    @Column(name = "chair_economy")
    private Integer chairEconomy;

    @Column(name = "chair_comfort")
    private Integer chairComfort;

    @Column(name = "chair_business")
    private Integer chairBusiness;

    @Column(name = "chair_first")
    private Integer chairFirst;

//    @ToString.Exclude
    @OneToMany(mappedBy = "plane", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<Flight> flights;

//    @ToString.Exclude
    @OneToMany(mappedBy = "plane", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
    private Set<Seat> seats;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_airlines")
    private Airline airline;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_Airport_current")
    private Airport AirportCurrent;
}


