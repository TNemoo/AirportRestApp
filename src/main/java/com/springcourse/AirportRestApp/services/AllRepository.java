package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.repositories.*;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class AllRepository {
    protected final AirlineRepository airline;
    protected final AirportRepository airport;
    protected final ClientRepository client;
    protected final ClientDetailsRepository clientDetails;
    protected final FlightRepository flight;
    protected final PhoneRepository phone;
    protected final PlaneRepository plane;
    protected final SeatRepository seat;
    protected final TicketRepository ticket;

    public AllRepository(AirlineRepository airline, AirportRepository airport
            , ClientRepository client, ClientDetailsRepository clientDetails, FlightRepository flight
            , PhoneRepository phone, PlaneRepository plane, SeatRepository seat, TicketRepository ticket) {
        this.airline = airline;
        this.airport = airport;
        this.client = client;
        this.clientDetails = clientDetails;
        this.flight = flight;
        this.phone = phone;
        this.plane = plane;
        this.seat = seat;
        this.ticket = ticket;
    }
}
