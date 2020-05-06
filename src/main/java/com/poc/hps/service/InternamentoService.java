package com.poc.hps.service;

import com.poc.hps.entity.InternamentoEntity;

import java.util.List;

public interface InternamentoService {

    List<InternamentoEntity> findAllHospitalizedWithoutDischarge();
}
