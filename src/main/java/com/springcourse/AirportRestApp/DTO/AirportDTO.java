package com.springcourse.AirportRestApp.DTO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AirportDTO {
    private Long id;
    private String name;
    private String address;
    private Integer runways; //количество взлетных полос
//    @ToString.Exclude
//    private List<PhoneDTO> phoneNumber;
//    @ToString.Exclude
//    private Set<FlightDTO>  departureFlights;
//    @ToString.Exclude
//    private Set<FlightDTO> arriveFlights;
//    @ToString.Exclude
//    private Set<PlaneDTO> planes;
//    @ToString.Exclude
//    private Set<AirlineDTO> airlines;
}
