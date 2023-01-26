package org.example

import org.example.model.Candidato
import org.example.model.Empresa
import org.example.model.Match
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
        vagaA.setTitulo("Desenvovedor Senior")
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
        vagaB.setTitulo("Analista Beck-end Junior")
        vagaB.setDescricaoVaga("VocÊ vai virar noites acordados para descobrir bug que você inventou")
        vagaB.setSalario(2500d)
        vagaB.setLocalizacao("presencial")
        vagaB.setTipoContrato("CLT")
        empresaB.setVaga(vagaB)
        empresaB.AdicionarVagaPublicada(vagaB)

        Vagas vagaC = new Vagas ()
        vagaC.setTitulo("Desenvovedor front-end")
        vagaC.setDescricaoVaga("VocÊ vai virar noites acordados para trocar cor de botão")
        vagaC.setSalario(4500)
        vagaC.setLocalizacao("Remoto")
        vagaC.setTipoContrato("CLT")
        empresaB.setVaga(vagaC)
        empresaB.AdicionarVagaPublicada(vagaC)

        Candidato candidato1 = new Candidato()
        candidato1.setNome("Felipe")
        candidato1.setEmail("Lupesms97@gmail.com")
        candidato1.setUF("Volta Redonda")
        candidato1.setCep("27288088")
        candidato1.setCpf("173776666712")
        candidato1.setDataNascimento(new LocalDate(1997,01,29))
        candidato1.getIdade(candidato1.getDataNascimento())
        candidato1.setDescicao("Desenvolvedor Back-end")
        candidato1.setSenha("SenhaTeste")



        Candidato candidato2 = new Candidato()
        candidato2.setNome("Carlos")
        candidato2.setEmail("carlinhos@gmail.com")
        candidato2.setUF("Volta Redonda")
        candidato2.setCep "2728890"
        candidato2.setCpf("17377666657")
        candidato2.setDataNascimento(new LocalDate(20,12,1997))
        candidato2.getIdade(candidato2.getDataNascimento())
        candidato2.setDescicao("Desenvolvedor Full-stack")
        candidato2.setSenha("SenhaTeste")




        Candidato candidato3 = new Candidato()
        candidato3.setNome("Enzo")
        candidato3.setEmail("Enzo@gmail.com")
        candidato3.setUF("Volta Redonda")
        candidato3.setCep("27288082")
        candidato3.setCpf("12345678911")
        candidato3.setDataNascimento(new LocalDate(01,01,2000))
        candidato3.getIdade(candidato3.getDataNascimento())
        candidato3.setDescicao("Desenvolvedor front-end")
        candidato3.setSenha("SenhaTeste")




        candidato1.LikeCandidato(vagaC, candidato1,empresaB)

        println("")

        empresaB.LikeEmpresa(candidato1, vagaC)

        println("")

        candidato1.LikeCandidato(vagaB, candidato1, empresaB)

        println("")

        candidato2.LikeCandidato(vagaB, candidato2, empresaB)

        println("")

        candidato3.LikeCandidato(vagaC, candidato3, empresaB)

        println("")

        empresaA.LikeEmpresa(candidato1, vagaA)

        println("")

        candidato1.LikeCandidato(vagaA, candidato1, empresaA)

        empresaB.MostrarCandidatosCurtidos()
        println("--------")
        empresaA.MostrarCandidatosCurtidos()
        println("--------")

        candidato1.MostrarVagasCurtidas()
        println("--------")
        candidato2.MostrarVagasCurtidas()
        println("--------")
        candidato3.MostrarVagasCurtidas()
        println("--------")



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

