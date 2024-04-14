package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.AirlineDTO;
import com.springcourse.AirportRestApp.models.Airline;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AirlineService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public AirlineService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }

    public AirlineDTO findById(Long id) {
        return transferToDTO.execute(allRepository.airline.findById(id).get());
    }

    public int getCountPlanes(Long id){
        return allRepository.airline.findById(id).get().getPlanes().size();
    }

    public void saveAll(List<Airline> airlines) {
        allRepository.airline.saveAll(airlines);
    }
}
