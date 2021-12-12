package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;
import com.cajanegra.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class getAtPos_Test {
    private static SingleLinkedListImpl<Character> listaLlena;
    private static SingleLinkedListImpl<Character> listaVacia;

    @BeforeAll
    static void inicializarLista() {
        listaLlena = new SingleLinkedListImpl<>('A', 'B', 'C', 'D');
        listaVacia = new SingleLinkedListImpl<>();
    }

    @ParameterizedTest
    @CsvSource({
            "-1",
            "0",
            "1",
            "2"
    })
    public void getAtPos_vacia_test(int pos) {

        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            listaVacia.getAtPos(pos);
        });

    }

   @Test
    public void getAtPos_llena_test_malas(){
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            listaLlena.getAtPos(-1);
        });
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            listaLlena.getAtPos(0);
        });
        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            listaLlena.getAtPos(listaLlena.size()+1);
        });
    }
    @ParameterizedTest(name="[{index}] -> elem=''{0}'', salidaEsperada={1}")
    @CsvSource({
            "1, 'A'",
            "2, 'B'",
            "3, 'C'",
            "4, 'D'",

    })
    public void getAtPos_llena_test_buenas(int elem,Character salidaEsperada){

        assertEquals(salidaEsperada,listaLlena.getAtPos(elem));

    }
}

