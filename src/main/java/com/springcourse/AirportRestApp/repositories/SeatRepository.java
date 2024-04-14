package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.CharClass;
import com.springcourse.AirportRestApp.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
