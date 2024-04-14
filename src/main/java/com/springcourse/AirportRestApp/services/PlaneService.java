package com.springcourse.AirportRestApp.services;

import com.springcourse.AirportRestApp.DTO.PlaneDTO;
import com.springcourse.AirportRestApp.models.Phone;
import com.springcourse.AirportRestApp.models.Plane;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class PlaneService {

    private final AllRepository allRepository;
    private final TransferToDTO transferToDTO;

    public PlaneService(AllRepository allRepository, TransferToDTO transferToDTO) {
        this.allRepository = allRepository;
        this.transferToDTO = transferToDTO;
    }
    public PlaneDTO findById(Long id) {
        return transferToDTO.execute(allRepository.plane.findById(id).get());
    }

    public void saveAll(List<Plane> planes) {
        allRepository.plane.saveAll(planes);
    }
}
