package com.springcourse.AirportRestApp.models;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Set;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//@EqualsAndHashCode(of = {"planes", "airports"})
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "airlines")
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_company")
    private String nameCompany;

    private String owner;

    @Column(name = "payment_account")
    private String paymentAccount;

//    @ToString.Exclude
    @OneToMany(mappedBy = "airline", cascade = {CascadeType.PERSIST, CascadeType.REFRESH, CascadeType.REMOVE})
    private Set<Plane> planes;

//    @ToString.Exclude
    @ManyToMany(mappedBy = "airlines", cascade = {CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<Airport> airports;
}
