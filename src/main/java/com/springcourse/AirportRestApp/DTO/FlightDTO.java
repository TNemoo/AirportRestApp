package com.springcourse.AirportRestApp.DTO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@ToString
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {
    private Long id;
    private Date departure;
    private Date arrive;
    private AirportDTO departureAirport;
    private AirportDTO arriveAirport;
    private PlaneDTO plane;
//    @ToString.Exclude
//    private Set<TicketDTO> tickets;
}
