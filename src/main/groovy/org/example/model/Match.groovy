package org.example.model

abstract class Match {
    List<Vagas> candidatoLikedEmpresa;
    List<Candidato> empresaLikedCandidato;
    String nome
    String email
    String senha



    List VagaCurtida(Vagas vaga){
        candidatoLikedEmpresa.add(vaga)
        candidatoLikedEmpresa
    }
    void CandidatoCurtido(Candidato candidato) {
        empresaLikedCandidato.add(candidato)
    }

    void LikeCandidato(Candidato candidato, Vagas vaga){
        candidato.VagaCurtida(vaga)
        vaga.setLiked(1)
        println("Você curtiu a vaga de $vaga.getTitulo()!")

    }
    void LikeEmpresa(Empresa empresa, Candidato candidato){
        empresa.CandidatoCurtido(candidato)
        println "Você curtiu o: $candidato.getNome()!"
        VerificarMatch(candidato)
    }

    boolean VerificarMatch(Candidato candidato){
        boolean match
        match = candidatoLikedEmpresa.contains(empresaLikedCandidato)
        match
    }
    boolean VerificarMatch(Empresa empresa){
        boolean match;
        match = empresaLikedCandidato.contains(candidatoLikedEmpresa)
        match
    }



}
