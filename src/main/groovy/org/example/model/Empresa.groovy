package org.example.model

import java.time.LocalDate
import groovy.transform.ToString

@ToString
class Empresa extends Match{

    String cnpj
    int quantidadeFuncionario
    LocalDate dataFundacao
    Vagas vaga
    List<Vagas> vagasPublicadas = new ArrayList<>()
    List<Candidato> empresaLikedCandidato

    Empresa(Vagas vaga) {
        this.vaga = vaga
    }

    Empresa() {
    }

    List<String> mostrarCandidatoDisponiveis(Vagas vaga) {
        List<String> verCandidatos = null
        for (Candidato candidato : vaga.getCandidatoesDisponiveis()) {
            verCandidatos.add(String.valueOf(candidato));
        }
        verCandidatos
    }
    void AdicionarVagaPublicada(Vagas vaga){
        vagasPublicadas.add(vaga)
    }

    void MostarVagsPublicadas() {
        for (Vagas vaga : vagasPublicadas)
            println vaga

    }


}
