package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.AirportDTO;
import com.springcourse.AirportRestApp.models.Airport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AirportService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public AirportService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }
    public AirportDTO findById(Long id) {
        return transferToDTO.execute(allRepository.airport.findById(id).get());
    }

    public void saveAll(List<Airport> airports) {
        allRepository.airport.saveAll(airports);
    }
}
