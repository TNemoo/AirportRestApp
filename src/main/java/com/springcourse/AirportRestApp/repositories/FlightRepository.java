package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.CharClass;
import com.springcourse.AirportRestApp.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
