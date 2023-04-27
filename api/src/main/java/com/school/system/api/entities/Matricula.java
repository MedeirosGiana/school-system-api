package com.school.system.api.entities;

import java.util.Date;
import java.util.Objects;

public class Matricula {
    private Date dataMatricula;
    private Integer prestacao;
    private Aluno aluno;
    private Turma turma;
    public Matricula(){
    }

    public Matricula(Date dataMatricula, Integer prestacao, Aluno aluno, Turma turma) {
        this.dataMatricula = dataMatricula;
        this.prestacao = prestacao;
        this.aluno = aluno;
        this.turma = turma;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public Integer getPrestacao() {
        return prestacao;
    }

    public void setPrestacao(Integer prestacao) {
        this.prestacao = prestacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(dataMatricula, matricula.dataMatricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataMatricula);
    }
}
