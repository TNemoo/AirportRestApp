package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.ClientDTO;
import com.springcourse.AirportRestApp.models.Client;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ClientService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public ClientService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }
    public ClientDTO findById(Long id) {
        return transferToDTO.execute(allRepository.client.findById(id).get());
    }

    public void saveAll(List<Client> clients) {
        allRepository.client.saveAll(clients);
    }
}
