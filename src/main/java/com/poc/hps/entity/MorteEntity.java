package com.poc.hps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "morte")
public class MorteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_morte", nullable = false)
    private Long id;
    @Column(name = "data", nullable = false)
    private LocalDateTime dataMorte;

    @ManyToOne
    @JoinColumn(name="id_paciente", nullable=false, unique = true)
    private PacienteEntity pacienteEntity;

    @Override
    public String toString(){
        return "MorteEntity : "+this.id;
    }
}
