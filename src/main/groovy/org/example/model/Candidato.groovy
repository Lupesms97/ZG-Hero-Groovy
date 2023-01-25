package org.example.model
import groovy.transform.ToString

import java.time.LocalDate

@ToString
class Candidato extends Match{

    LocalDate datadeNacimento
    String cidade
    String areaDeAtuacao
    int tempoDeExperiencia
    List<Vagas> candidatoLikedEmpresa = new ArrayList<>()



}
