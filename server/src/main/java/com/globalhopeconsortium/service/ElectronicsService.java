package com.globalhopeconsortium.service;

import java.util.List;
import com.globalhopeconsortium.model.Electronics;
import com.globalhopeconsortium.repository.ElectronicsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ElectronicsService {

    @Autowired
    private ElectronicsRepository electronicsRepository;

    public List<Electronics> getAllElectronics() {
        return electronicsRepository.findAll();
    }
}