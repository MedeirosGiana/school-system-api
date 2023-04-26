package com.school.system.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_turma")
public class Turma implements Serializable {
    private static final Integer serialVersionUID = 1;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer numeroTurma;

    private Integer numeroVagas;

    private Instant inicio;

    public Turma(Integer id, Integer numeroTurma, Integer numeroVagas, Instant inicio) {
        this.id = id;
        this.numeroTurma = numeroTurma;
        this.numeroVagas = numeroVagas;
        this.inicio = inicio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroTurma() {
        return numeroTurma;
    }

    public void setNumeroTurma(Integer numeroTurma) {
        this.numeroTurma = numeroTurma;
    }

    public Integer getNumeroVagas() {
        return numeroVagas;
    }

    public void setNumeroVagas(Integer numeroVagas) {
        this.numeroVagas = numeroVagas;
    }

    public Instant getInicio() {
        return inicio;
    }

    public void setInicio(Instant inicio) {
        this.inicio = inicio;
    }



}
