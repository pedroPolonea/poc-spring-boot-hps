package com.poc.hps.repository;

import com.poc.hps.entity.AltaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AltaRepository extends JpaRepository<AltaEntity, Long> {
}
