package com.globalhopeconsortium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.globalhopeconsortium.model.Transport;

public interface TransportRepository extends JpaRepository<Transport, Long> {
}