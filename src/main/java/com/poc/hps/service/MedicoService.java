package com.poc.hps.service;

import com.poc.hps.entity.MedicoEntity;

import java.util.List;

public interface MedicoService {
    List<MedicoEntity> findAll();
}
