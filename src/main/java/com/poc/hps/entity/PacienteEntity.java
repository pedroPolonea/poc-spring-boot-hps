package com.poc.hps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "paciente")
public class PacienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_paciente", nullable = false)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "sobreNome", nullable = false)
    private String sobreNome;
    @Column(name = "data_nascimento", nullable = false)
    private LocalDateTime dataNascimento;

    @OneToMany(mappedBy="pacienteEntity", orphanRemoval=true, cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AltaEntity> altas;

    @OneToOne(mappedBy="pacienteEntity", orphanRemoval=true, cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private MorteEntity morteEntity;

    @OneToMany(mappedBy="pacienteEntity", orphanRemoval=true, cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<InternamentoEntity> internamentoEntities;

    @OneToMany(mappedBy="pacienteEntity", orphanRemoval=true, cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ConsultaEntity> consultaEntities;

    @Override
    public String toString(){
        return "PacienteEntity : "+this.id;
    }
}
