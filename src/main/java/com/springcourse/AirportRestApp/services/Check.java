package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.ClientDTO;
import com.springcourse.AirportRestApp.models.*;
import com.springcourse.AirportRestApp.repositories.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class Check {

    private final ClientRepository clientRepository;

    public Check(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public void check1(Long id) {
        Client client = clientRepository.findById(id).get();

        /** ClientDetails */
        client.getClientDetails();

        /** Tickets */
        Set<Ticket> tickets = client.getTickets();

        /** Flight */
        Set<Flight> flights = new HashSet<>();

        for (Ticket ticket : tickets)
            flights.add(ticket.getFlight());

        /** Plane */
        Set<Plane> planes = new HashSet<>();

        for (Flight flight : flights)
            planes.add(flight.getPlane());

        /** Airline */
        Set<Airline> airlines = new HashSet<>();
        /** Seat */
        Set<Seat> seats = new HashSet<>();

        for (Plane plane : planes) {
            airlines.add(plane.getAirline());
            seats.addAll(plane.getSeats());
        }

        /** Airport */
        Set<Airport> airports = new HashSet<>();

        for (Airline airline : airlines)
            airports.addAll(airline.getAirports());

        System.out.println();
        System.out.println(client);
        System.out.println(client.getClientDetails());
        System.out.println(tickets);
        System.out.println(flights);
        System.out.println(planes);
        System.out.println(airlines);
        System.out.println(seats);
        System.out.println(airports);
        System.out.println();
    }
}
