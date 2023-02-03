package org.example.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static jdk.nashorn.internal.runtime.GlobalFunctions.parseInt;
import static org.junit.jupiter.api.Assertions.*;

class CandidatoTest {

    @Test
    void testGetIdade() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(1995, 5, 20);
        Period periodo = Period.between(dataNascimento, hoje);
        int idade = periodo.getYears();

        int idadeEsperada = 27;

        assertEquals(idadeEsperada, idade);
    }
}