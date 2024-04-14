package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.CharClass;
import com.springcourse.AirportRestApp.models.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Long> {
}
