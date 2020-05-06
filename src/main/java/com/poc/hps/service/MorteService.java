package com.poc.hps.service;

import com.poc.hps.entity.MorteEntity;

import java.util.List;

public interface MorteService {

    List<MorteEntity> findAllDeadWhoHaveAlreadyBeenHospitalized();
}
