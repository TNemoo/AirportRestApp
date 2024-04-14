package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.CharClass;
import com.springcourse.AirportRestApp.models.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
