package com.poc.hps.service.impl;

import com.poc.hps.entity.MorteEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MorteServiceImplTest {

    @Autowired
    private MorteServiceImpl morteService;

    @Test
    public void shouldReturnADeadPatientWhoHasBeenHospitalized() {
        List<MorteEntity> morteEntities = morteService.findAllDeadWhoHaveAlreadyBeenHospitalized();

        Assert.assertTrue(morteEntities.size() > 0);
    }
}