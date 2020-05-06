package com.poc.hps.service.impl;

import com.poc.hps.entity.PacienteEntity;
import com.poc.hps.repository.PacienteRepository;
import com.poc.hps.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;


    @Override
    public List<PacienteEntity> findAllPatientNotTallAndDead() {
        return pacienteRepository.findAllPatientNotTallAndDead();
    }

    @Override
    public List<PacienteEntity> findAll() {
        return pacienteRepository.findAll();
    }



}
