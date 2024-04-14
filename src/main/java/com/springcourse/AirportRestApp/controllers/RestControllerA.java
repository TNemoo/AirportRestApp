package com.springcourse.AirportRestApp.controllers;

import com.springcourse.AirportRestApp.DTO.*;
import com.springcourse.AirportRestApp.services.Check;
import com.springcourse.AirportRestApp.services.PushSQL;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class RestControllerA {

    private final AllServices services;
    private final Check check;
    private final PushSQL pushSQL;

    public RestControllerA(AllServices services, Check check, PushSQL pushSQL) {
        this.services = services;
        this.check = check;
        this.pushSQL = pushSQL;
    }

    @GetMapping("/airline/{id}")
    public AirlineDTO airline(@PathVariable Long id) {
        return services.airline.findById(id);
    }

    @GetMapping("/airport/{id}")
    public AirportDTO airport(@PathVariable Long id) {
        return services.airport.findById(id);
    }

    @GetMapping("/client/{id}")
    public ClientDTO clientDetails(@PathVariable Long id) {
        return services.client.findById(id);
    }

    @GetMapping("/clientDetails/{id}")
    public ClientDetailsDTO client(@PathVariable Long id) {
        return services.clientDetails.findById(id);
    }

    @GetMapping("/flight/{id}")
    public FlightDTO flight(@PathVariable Long id) {
        return services.flight.findById(id);
    }

    @GetMapping("/phone/{id}")
    public PhoneDTO phone(@PathVariable Long id) {
        return services.phone.findById(id);
    }

    @GetMapping("/plane/{id}")
    public PlaneDTO plane(@PathVariable Long id) {
        return services.plane.findById(id);
    }

    @GetMapping("/seat/{id}")
    public SeatDTO seat(@PathVariable Long id) {
        return services.seat.findById(id);
    }

    @GetMapping("/ticket/{id}")
    public TicketDTO ticket(@PathVariable Long id) {
        return services.ticket.findById(id);
    }

    @GetMapping("/check")
    public void check1() {
        check.check1(1L);
    }

    @GetMapping("/push")
    public void push() {
        pushSQL.setSeatsToPlanes();
    }
}
