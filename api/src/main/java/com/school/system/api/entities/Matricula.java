package com.school.system.api.entities;

import java.util.Date;

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
}
