package com.poc.hps.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "consulta")
public class ConsultaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_consulta", nullable = false)
    private Long id;
    @Column(name = "data")
    private LocalDateTime dataConsulta;

    @ManyToOne
    @JoinColumn(name="id_medico")
    private MedicoEntity medicoEntity;

    @ManyToOne
    @JoinColumn(name="id_paciente", nullable=false)
    private PacienteEntity pacienteEntity;

    @Override
    public String toString(){
        return "ConsultaEntity : "+this.id;
    }
}
