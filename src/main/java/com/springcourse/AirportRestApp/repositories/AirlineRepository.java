package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.Airline;
import com.springcourse.AirportRestApp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirlineRepository extends JpaRepository<Airline, Long> {
}
