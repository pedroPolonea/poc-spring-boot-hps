package com.poc.hps.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "medico")
public class MedicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_medico", nullable = false)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "sobreNome", nullable = false)
    private String sobreNome;

    @OneToMany(mappedBy="medicoEntity", orphanRemoval=true, cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ConsultaEntity> consultaEntities;

    @Override
    public String toString(){
        return "MedicoEntity : "+this.id;
    }
}
