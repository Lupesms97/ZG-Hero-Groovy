package org.example.model

import groovy.transform.ToString

@ToString
abstract class Match {
    List<Vagas> candidatoLikedVaga = new ArrayList<>()
    List<Candidato> empresaLikedCandidato = new ArrayList<>()
    String nome
    String email
    String senha
    String UF
    String cep
    String descicao


    void LikeCandidato(Vagas vaga, Candidato candidato,Empresa empresa) {
        candidatoLikedVaga.add(vaga)

        if (empresa.empresaLikedCandidato.contains(candidato)) println("Deram match")
        else print("Não deram match")
    }

    void LikeEmpresa(Candidato candidato, Vagas vaga) {
        empresaLikedCandidato.add(candidato)

        if (candidato.candidatoLikedVaga.contains(vaga)) print("Deram match")
        else print("Não deram macth")

    }

    List<Vagas> MostrarVagasCurtidas() {
        for (Vagas vaga : candidatoLikedVaga)
            println(vaga)
    }

    List<Candidato> MostrarCandidatosCurtidos() {
        for (Candidato candidato : empresaLikedCandidato)
            println(candidato)
    }
}

