package org.example.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    List<Vagas> vagasPublicadas = new ArrayList<>();
    @BeforeEach
    @Test
    void testeAdicioanarVagsPublicadas() {
        Vagas vagaJava = new Vagas("Desenvolvedor Java", 10200);
        Vagas vagaPython = new Vagas("Desenvolvedor Python", 120000);
        Vagas vagaCbol = new Vagas("Desenvolvedor Cbol", 12000);
        vagasPublicadas.add(vagaJava);
        vagasPublicadas.add(vagaPython);
        vagasPublicadas.add(vagaCbol);

    }



    @Test
    void testeMostarVagsPublicadasJava() {

        String resultado = vagasPublicadas.get(0).toString();
        String resultadoEsperado = "org.example.model.Vagas(Desenvolvedor Java, 10200.0, null, null, null, null)";
        assertEquals(resultadoEsperado, resultado);
    }
    @Test
    void testeMostarVagsPublicadasCbol() {

        String resultado = vagasPublicadas.get(2).toString();
        String resultadoEsperado = "org.example.model.Vagas(Desenvolvedor Cbol, 12000.0, null, null, null, null)";
        assertEquals(resultadoEsperado, resultado);
    }

}