package com.school.system.api.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_avaliacoes")
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private Double nota;
    @Column(nullable = false)
    private Date data;

    public Avaliacao() {
    }

    public Avaliacao(Integer id, Double nota, Date data) {
        this.id = id;
        this.nota = nota;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
