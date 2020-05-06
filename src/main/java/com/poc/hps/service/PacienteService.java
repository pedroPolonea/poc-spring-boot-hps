package com.poc.hps.service;

import com.poc.hps.entity.PacienteEntity;

import java.util.List;

public interface PacienteService {

    List<PacienteEntity> findAllPatientNotTallAndDead();

    List<PacienteEntity> findAll();
}
