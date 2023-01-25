package org.example.model

abstract class Match {
    List<Vagas> candidatoLikedVaga = new ArrayList<>()
    List<Candidato> empresaLikedCandidato = new ArrayList<>()
    String nome
    String email
    String senha
    boolean match




    void LikeCandidato( Vagas vaga, Candidato candidato){
       candidatoLikedVaga.add(vaga)
        println("Você curtiu a vaga !")
        VerificarMatch(candidato)
        println(getMatch())


    }
    void LikeEmpresa(Candidato candidato){
        empresaLikedCandidato.add(candidato)
        VerificarMatch(candidato)
        println(getMatch())

    }
//    Verificar o match do empresa
    boolean VerificarMatch(Vagas vaga){

        if (candidatoLikedVaga.contains(vaga)) setMatch(true)
        else setMatch(false)
        getMatch()
    }
//    Verificar o match da candidato
    boolean VerificarMatch(Candidato candidato){
        boolean match;
        if (empresaLikedCandidato.contains(candidato)) setMatch(true)
        else setMatch(false)
        getMatch()

    }



}
