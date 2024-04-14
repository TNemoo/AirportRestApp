package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.SeatDTO;
import com.springcourse.AirportRestApp.models.Seat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class SeatService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public SeatService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }
    public SeatDTO findById(Long id) {
        return transferToDTO.execute(allRepository.seat.findById(id).get());
    }

    public void saveAll(List<Seat> seats) {
        allRepository.seat.saveAll(seats);
    }
}
