package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.Airline;
import com.springcourse.AirportRestApp.models.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}
