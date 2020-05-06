package com.poc.hps.service.impl;

import com.poc.hps.entity.ConsultaEntity;
import com.poc.hps.repository.ConsultaRepository;
import com.poc.hps.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsultaServiceImpl implements ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;


    @Override
    public List<ConsultaEntity> findAll() {
        return consultaRepository.findAll();
    }
}
