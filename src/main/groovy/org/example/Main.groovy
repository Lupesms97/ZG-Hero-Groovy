package org.example

import org.example.model.Candidato
import org.example.model.Empresa
import org.example.model.Vagas

import java.time.LocalDate
import java.time.format.DateTimeFormatter

static void main( args) {
        Empresa empresaA = new Empresa()
        Vagas vagaA = new Vagas()
        empresaA.setNome("Amor e brigradeiro")
        empresaA.setCnpj("123456789-10");
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        LocalDate data = LocalDate.parse("29/01/2018", formato)
        empresaA.setDataFundacao(data)
        empresaA.setSenha("SemRelavancia")
        empresaA.setQuantidadeFuncionario(50)
        empresaA.setEmail "empresaA@hotmail.com"
//        vagaA.setTitulo("Desenvovedor Senior")
        vagaA.setDescricaoVaga("VocÊ vai virar noites acordados para realizar seu sonho")
        vagaA.setSalario(5000d)
        vagaA.setLocalizacao("Remoto")
        vagaA.setTipoContrato("CLT")
        empresaA.setVaga(vagaA)
        empresaA.AdicionarVagaPublicada(vagaA)

        Empresa empresaB = new Empresa()
        Vagas vagaB = new Vagas()
        empresaB.setNome("Sorverteria ")
        empresaB.setCnpj("123123098-12")
        LocalDate dataA = LocalDate.parse("01/10/2000", formato)
        empresaB.setDataFundacao(dataA)
        empresaB.setSenha("SemRelavancia")
        empresaB.setQuantidadeFuncionario(20)
        empresaB.setEmail "Empresa@gmail.com"
//        vagaB.setTitulo("Analista Beck-end Junior")
        vagaB.setDescricaoVaga("VocÊ vai virar noites acordados para descobrir bug que você inventou")
        vagaB.setSalario(2500d)
        vagaB.setLocalizacao("presencial")
        vagaB.setTipoContrato("CLT")
        empresaB.setVaga(vagaB)
        empresaB.AdicionarVagaPublicada(vagaB)

        Vagas vagaC = new Vagas ()
//        vagaC.setTitulo("Desenvovedor front-end")
        vagaC.setDescricaoVaga("VocÊ vai virar noites acordados para trocar cor de botão")
        vagaC.setSalario(4500)
        vagaC.setLocalizacao("Remoto")
        vagaC.setTipoContrato("CLT")
        empresaB.setVaga(vagaC)
        empresaB.AdicionarVagaPublicada(vagaC)

        Candidato candidato1 = new Candidato()
        candidato1.setNome("Felipe")
        candidato1.setEmail("Lupesms97@gmail.com")
        candidato1.setCidade("Volta Redonda")
        candidato1.setDatadeNacimento(new LocalDate(29,01,1997))
        candidato1.setAreaDeAtuacao("Desenvolvedor Back-end")
        candidato1.setSenha("SenhaTeste")
        candidato1.setTempoDeExperiencia(10)


        Candidato candidato2 = new Candidato()
        candidato2.setNome("Carlos")
        candidato2.setEmail("carlinhos@gmail.com")
        candidato2.setCidade("Volta Redonda")
        candidato2.setDatadeNacimento(new LocalDate(20,12,1997))
        candidato2.setAreaDeAtuacao("Desenvolvedor Full-stack")
        candidato2.setSenha("SenhaTeste")
        candidato2.setTempoDeExperiencia(7)



        Candidato candidato3 = new Candidato()
        candidato3.setNome("Enzo")
        candidato3.setEmail("Enzo@gmail.com")
        candidato3.setCidade("Volta Redonda")
        candidato3.setDatadeNacimento(new LocalDate(01,01,2000))
        candidato3.setAreaDeAtuacao("Desenvolvedor front-end")
        candidato3.setSenha("SenhaTeste")
        candidato3.setTempoDeExperiencia(8)



        candidato1.LikeCandidato(vagaC, candidato1)
        candidato1.LikeCandidato(vagaB, candidato1)

        candidato2.LikeCandidato(vagaB, candidato2)

        candidato3.LikeCandidato(vagaC, candidato3)

        empresaA.LikeEmpresa(candidato1)

        candidato1.LikeCandidato(vagaA, candidato1)

//
//
//        println empresaB
//        empresaB.MostarVagsPublicadas()
//
//        println empresaA
//        println empresaA.getVaga()
//        println candidato1
//        println candidato2
//        println candidato3

    }

