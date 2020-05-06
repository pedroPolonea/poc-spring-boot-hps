package com.poc.hps.service.impl;

import com.poc.hps.repository.AltaRepository;
import com.poc.hps.service.AltaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AltaServiceImpl implements AltaService {
    @Autowired
    private AltaRepository altaRepository;
}
