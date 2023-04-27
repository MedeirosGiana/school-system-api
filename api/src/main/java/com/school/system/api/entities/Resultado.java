package com.school.system.api.entities;

public class Resultado {
    private Double notaObtida;

    public Resultado() {
    }
    public Resultado(Double notaObtida) {
        this.notaObtida = notaObtida;
    }

    public Double getNotaObtida() {
        return notaObtida;
    }

    public void setNotaObtida(Double notaObtida) {
        this.notaObtida = notaObtida;
    }

}
