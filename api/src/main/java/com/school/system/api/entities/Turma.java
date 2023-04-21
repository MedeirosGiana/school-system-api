package com.school.system.api.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_turmas")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer numeroTurma;
    @Column(nullable = false)
    private Integer numeroVagas;
    @Column(nullable = false)
    private Date dataInicio;

    public Turma(){
    }

    public Turma(Integer id, Integer numeroTurma, Integer numeroVagas, Date dataInicio) {
        this.id = id;
        this.numeroTurma = numeroTurma;
        this.numeroVagas = numeroVagas;
        this.dataInicio = dataInicio;
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }
}
