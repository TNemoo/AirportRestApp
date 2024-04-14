package com.springcourse.AirportRestApp.DTO;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.springcourse.AirportRestApp.models.Flight;
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
public class PlaneDTO {
    private Long id;
    private String planeModel;
    private Double maxBaggage;//m3
    private Integer
            boardNumber, //бортовой номер
            speed, //км/ч
            crew, //экипаж
            chairEconomy,
            chairComfort,
            chairBusiness,
            chairFirst;
    //    @ToString.Exclude
//    private Set<FlightDTO> flights;
    private List<Long> flightsNumber;
    //    @ToString.Exclude
//    private Set<SeatDTO> seats;
    private Set<SeatDTO> seatDTOS;
    private AirlineDTO airline;
    private AirportDTO AirportCurrent;

}


