package com.poc.hps.service.impl;

import com.poc.hps.entity.PacienteEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PacienteServiceImplTest {

    @Autowired
    private PacienteServiceImpl pacienteService;

    @Test
    public void shouldReturnPatientWhoIsNotDeadWasNotDischargedAndDidDotGoThroughConsultation() {
        List<PacienteEntity> pacienteEntities = pacienteService.findAllPatientNotTallAndDead();

        Assert.assertTrue(pacienteEntities.size() > 0);
    }
}