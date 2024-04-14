package com.springcourse.AirportRestApp.controllers;

import com.springcourse.AirportRestApp.services.*;
import org.springframework.stereotype.Component;

@Component
public class AllServices {
    protected final AirlineService airline;
    protected final AirportService airport;
    protected final ClientService client;
    protected final ClientDetailsService clientDetails;
    protected final FlightService flight;
    protected final PhoneService phone;
    protected final PlaneService plane;
    protected final SeatService seat;
    protected final TicketService ticket;

    public AllServices(AirlineService airline, AirportService airport, ClientDetailsService clientDetails
            , ClientService client, FlightService flight, PhoneService phone, PlaneService plane, SeatService seat
            , TicketService ticket) {
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