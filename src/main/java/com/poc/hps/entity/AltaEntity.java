package com.poc.hps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "alta")
public class AltaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_alta", nullable = false)
    private Long id;
    @Column(name = "data_alta", nullable = false)
    private LocalDateTime dataAlta;

    @ManyToOne
    @JoinColumn(name="id_paciente", nullable=false)
    private PacienteEntity pacienteEntity;

    @Override
    public String toString(){
        return "AltaEntity : "+this.id;
    }
}
