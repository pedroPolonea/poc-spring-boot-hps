package com.poc.hps.repository;

import com.poc.hps.entity.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<PacienteEntity, Long> {

    @Query(
            value = "SELECT p.* " +
                    "FROM paciente p " +
                    "WHERE NOT EXISTS (" +
                    "   SELECT 1 " +
                    "   FROM alta a " +
                    "   WHERE a.id_paciente = p.id_paciente" +
                    ") AND NOT EXISTS ( " +
                    "   SELECT 1 " +
                    "   FROM morte m " +
                    "   WHERE m.id_paciente = p.id_paciente" +
                    ") AND NOT EXISTS (" +
                    "   SELECT 1 " +
                    "   FROM  consulta c " +
                    "   WHERE c.id_paciente = p.id_paciente) ",
            nativeQuery = true)
    List<PacienteEntity> findAllPatientNotTallAndDead();

}
