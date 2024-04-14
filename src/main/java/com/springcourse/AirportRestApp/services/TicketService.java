package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.TicketDTO;
import com.springcourse.AirportRestApp.models.Ticket;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class TicketService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public TicketService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }
    public TicketDTO findById(Long id) {
        return transferToDTO.execute(allRepository.ticket.findById(id).get());
    }

    public void saveAll(List<Ticket> tickets) {
        allRepository.ticket.saveAll(tickets);
    }
}
