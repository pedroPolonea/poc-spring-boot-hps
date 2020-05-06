package com.poc.hps.repository;

import com.poc.hps.entity.MorteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MorteRepository extends JpaRepository<MorteEntity, Long> {

    @Query(
            value = "SELECT m.* " +
                    "FROM morte m " +
                    "JOIN internamento i on m.id_paciente = i.id_paciente",
            nativeQuery = true)
    List<MorteEntity> findAllDeadWhoHaveAlreadyBeenHospitalized();
}
