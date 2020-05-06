package com.poc.hps.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "internamento")
public class InternamentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_internamento", nullable = false)
    private Long id;

    @Column(name = "data_entrada", nullable = false)
    private LocalDateTime dataEntrada;

    @Column(name = "data_saida")
    private LocalDateTime dataSaida;

    @ManyToOne
    @JoinColumn(name="id_paciente",nullable = true)
    private PacienteEntity pacienteEntity;

    @Override
    public String toString(){
        return "InternamentoEntity : "+this.id;
    }
}
