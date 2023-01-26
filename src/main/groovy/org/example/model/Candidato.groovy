package org.example.model
import groovy.transform.ToString

import java.time.LocalDate
import java.time.Period

@ToString
class Candidato extends Match {

    String nome
    String email
    String senha
    String UF
    String cep
    String descicao
    LocalDate dataNascimento
    String cpf
    List<Vagas> candidatoLikedEmpresa = new ArrayList<>()


    int getIdade(LocalDate dataNascimento) {
        LocalDate hoje = LocalDate.now();
        Period periodo = Period.between(dataNascimento, hoje);
        periodo.getYears();


    }
}