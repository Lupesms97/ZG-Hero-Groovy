package org.example.model
import groovy.transform.ToString

@ToString
class Vagas {
    String titulo
    double salario
    String localizacao
    String tipoContrato
    String descricaoVaga
    List<Candidato> candidatoesDisponiveis

    Vagas(String titulo, double salario) {
        this.titulo = titulo
        this.salario = salario
    }
    Vagas(){}

    String getTitulo() {
        return titulo
    }

    void setTitulo(String titulo) {
        this.titulo = titulo
    }
}
