package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.FlightDTO;
import com.springcourse.AirportRestApp.models.Flight;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class FlightService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public FlightService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }
    public FlightDTO findById(Long id) {
        return transferToDTO.execute(allRepository.flight.findById(id).get());
    }

    public void saveAll(List<Flight> flights) {
        allRepository.flight.saveAll(flights);
    }
}
