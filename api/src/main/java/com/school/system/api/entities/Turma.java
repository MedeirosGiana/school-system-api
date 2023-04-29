package com.school.system.api.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;

    public Turma(Integer id, Integer numeroTurma, Integer numeroVagas, Instant inicio, Curso curso) {
        this.id = id;
        this.numeroTurma = numeroTurma;
        this.numeroVagas = numeroVagas;
        this.inicio = inicio;
        this.curso = curso;

    }
    public Turma() {
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

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Turma turma = (Turma) o;
        return Objects.equals(id, turma.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
