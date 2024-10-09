package com.globalhopeconsortium.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.globalhopeconsortium.model.Electronics;

public interface ElectronicsRepository extends JpaRepository<Electronics, Long> {
}