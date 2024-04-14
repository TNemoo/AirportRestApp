package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.*;
import com.springcourse.AirportRestApp.models.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransferToDTO {

    private final ModelMapper mapper; //нужно создать бин в AppApplication
    private final AllRepository allRepository;

    public TransferToDTO(ModelMapper mapper, AllRepository allRepository) {
        this.mapper = mapper;
        this.allRepository = allRepository;
    }

    public AirlineDTO execute(Airline airline) {
        AirlineDTO airlineDTO = mapper.map(airline, AirlineDTO.class);
        airlineDTO.setQuantityPlanes(airline.getPlanes().size());
        return airlineDTO;
    }

    public AirportDTO execute(Airport airport) {
        return mapper.map(airport, AirportDTO.class);
    }

    public ClientDTO execute(Client client) {
        return mapper.map(client, ClientDTO.class);
    }

    public ClientDetailsDTO execute(ClientDetails clientDetails) {
        return mapper.map(clientDetails, ClientDetailsDTO.class);
    }

    public FlightDTO execute(Flight flight) {
        return mapper.map(flight, FlightDTO.class);
    }

    public PhoneDTO execute(Phone phone) {
        return mapper.map(phone, PhoneDTO.class);
    }

    public PlaneDTO execute(Plane plane) {
        PlaneDTO planeDTO = mapper.map(plane, PlaneDTO.class);
        List<Long> flightsNumber = plane.getFlights().stream().map(a -> a.getId()).toList();
        planeDTO.setFlightsNumber(flightsNumber);
        return planeDTO;
    }

    public SeatDTO execute(Seat seat) {
        return mapper.map(seat, SeatDTO.class);
    }

    public TicketDTO execute(Ticket ticket) {
        return mapper.map(ticket, TicketDTO.class);
    }
}

/*

    public AirlineDTO airline(Airline airline) {
        return mapper.map(airline, AirlineDTO.class);
    }

    public AirportDTO airport(Airport airport) {
        return mapper.map(airport, AirportDTO.class);
    }

    public ClientDTO client(Client client) {
        return mapper.map(client, ClientDTO.class);
    }

    public ClientDetailsDTO clientDetails(ClientDetails clientDetails) {
        return mapper.map(clientDetails, ClientDetailsDTO.class);
    }

    public FlightDTO flight(Flight flight) {
        return mapper.map(flight, FlightDTO.class);
    }

    public PhoneDTO phone(Phone phone) {
        return mapper.map(phone, PhoneDTO.class);
    }

    public PlaneDTO plane(Plane plane) {
        return mapper.map(plane, PlaneDTO.class);
    }

    public SeatDTO seat(Seat seat) {
        return mapper.map(seat, SeatDTO.class);
    }

    public TicketDTO ticket(Ticket ticket) {
        return mapper.map(ticket, TicketDTO.class);
    }

 */