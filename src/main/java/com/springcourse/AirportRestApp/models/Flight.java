package com.springcourse.AirportRestApp.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@EqualsAndHashCode(of = {"departureAirport", "arriveAirport", "plane", "tickets"})
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date departure;

    private Date arrive;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_departure_airport")
    private Airport departureAirport;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_arrive_airport")
    private Airport arriveAirport;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "id_plane")
    private Plane plane;

//    @ToString.Exclude
    @OneToMany(mappedBy = "flight", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<Ticket> tickets;
}
