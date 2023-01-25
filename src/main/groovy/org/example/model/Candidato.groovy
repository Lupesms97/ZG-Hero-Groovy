package org.example.model
import groovy.transform.ToString

@ToString
class Candidato extends Match{

    Date datadeNacimento
    String cidade
    String areaDeAtuacao
    int tempoDeExperiencia
    List<Vagas> candidatoLikedEmpresa


    List VagaCurtida(Vagas vaga){
        candidatoLikedEmpresa.add(vaga)
        getCandidatoLikedEmpresa()
    }

}
