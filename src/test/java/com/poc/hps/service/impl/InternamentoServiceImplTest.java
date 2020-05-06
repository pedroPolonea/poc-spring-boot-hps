package com.poc.hps.service.impl;

import com.poc.hps.entity.InternamentoEntity;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class InternamentoServiceImplTest {

    @Autowired
    private InternamentoServiceImpl internamentoService;

    @Test
    public void shouldReturnIntentionWithoutRegistrationOfDischarge() {
        List<InternamentoEntity> internamentoEntityLis = internamentoService.findAllHospitalizedWithoutDischarge();

        Assert.assertTrue(internamentoEntityLis.size() > 0);
    }
}