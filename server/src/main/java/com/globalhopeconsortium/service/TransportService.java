package com.globalhopeconsortium.service;

import java.util.List;
import com.globalhopeconsortium.model.Transport;
import com.globalhopeconsortium.repository.TransportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportService {

    @Autowired
    private TransportRepository transportRepository;

    public List<Transport> getAllTransportServices() {
        return transportRepository.findAll();
    }
}