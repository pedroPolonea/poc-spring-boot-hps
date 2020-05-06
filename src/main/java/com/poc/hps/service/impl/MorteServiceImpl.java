package com.poc.hps.service.impl;

import com.poc.hps.entity.MorteEntity;
import com.poc.hps.repository.MorteRepository;
import com.poc.hps.service.MorteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MorteServiceImpl implements MorteService {

    @Autowired
    private MorteRepository morteRepository;

    @Override
    public List<MorteEntity> findAllDeadWhoHaveAlreadyBeenHospitalized() {
        return morteRepository.findAllDeadWhoHaveAlreadyBeenHospitalized();
    }
}
