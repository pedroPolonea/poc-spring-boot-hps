package com.poc.hps.repository;

import com.poc.hps.entity.InternamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InternamentoRepository extends JpaRepository<InternamentoEntity, Long> {
    @Query(
            value = "SELECT i.* " +
                    "FROM internamento i " +
                    "WHERE NOT EXISTS ( " +
                    "   SELECT 1" +
                    "   FROM alta a" +
                    "   WHERE a.id_paciente = i.id_paciente " +
                    ") ",
            nativeQuery = true)
    List<InternamentoEntity> findAllHospitalizedWithoutDischarge();
}
