package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.PhoneDTO;
import com.springcourse.AirportRestApp.models.Phone;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PhoneService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public PhoneService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }
    public PhoneDTO findById(Long id) {
        return transferToDTO.execute(allRepository.phone.findById(id).get());
    }

    public void saveAll(List<Phone> phones) {
        allRepository.phone.saveAll(phones);
    }
}
