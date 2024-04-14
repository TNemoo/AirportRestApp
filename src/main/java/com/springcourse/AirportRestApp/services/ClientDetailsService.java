package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.ClientDTO;
import com.springcourse.AirportRestApp.DTO.ClientDetailsDTO;
import com.springcourse.AirportRestApp.models.ClientDetails;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ClientDetailsService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public ClientDetailsService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }
    public ClientDetailsDTO findById(Long id) {
        return transferToDTO.execute(allRepository.clientDetails.findById(id).get());
    }

    public void saveAll(List<ClientDetails> clientDetails) {
        allRepository.clientDetails.saveAll(clientDetails);
    }
}
