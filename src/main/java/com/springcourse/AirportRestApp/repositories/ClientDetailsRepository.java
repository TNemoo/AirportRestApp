package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.Client;
import com.springcourse.AirportRestApp.models.ClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDetailsRepository extends JpaRepository<ClientDetails, Long> {
}
