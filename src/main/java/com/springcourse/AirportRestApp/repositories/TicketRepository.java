package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.CharClass;
import com.springcourse.AirportRestApp.models.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
