package com.poc.hps.service.impl;

import com.poc.hps.entity.InternamentoEntity;
import com.poc.hps.repository.InternamentoRepository;
import com.poc.hps.service.InternamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternamentoServiceImpl implements InternamentoService {

    @Autowired
    private InternamentoRepository internamentoRepository;

    @Override
    public List<InternamentoEntity> findAllHospitalizedWithoutDischarge() {
        return internamentoRepository.findAllHospitalizedWithoutDischarge();
    }
}
