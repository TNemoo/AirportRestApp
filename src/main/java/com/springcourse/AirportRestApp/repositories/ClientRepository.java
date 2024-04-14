package com.springcourse.AirportRestApp.repositories;

import com.springcourse.AirportRestApp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
