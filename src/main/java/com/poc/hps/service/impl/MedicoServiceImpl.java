package com.poc.hps.service.impl;

import com.poc.hps.entity.MedicoEntity;
import com.poc.hps.repository.MedicoRepository;
import com.poc.hps.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServiceImpl implements MedicoService {
    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public List<MedicoEntity> findAll() {
        return medicoRepository.findAll();
    }
}
