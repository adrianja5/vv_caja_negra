package com.practica.cajanegra;
import java.util.Arrays;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;
//import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.cajanegra.SingleLinkedListImpl;

public class reverseTest {

    private static SingleLinkedListImpl<Character> lista;

    @BeforeAll
    static void inicializarLista() {
        lista = new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');
    }

    @Test
    public void reverseListaVaciaTest(){
        SingleLinkedListImpl normal = new SingleLinkedListImpl<>();
        SingleLinkedListImpl reverseada = new SingleLinkedListImpl<>();
        assertEquals(normal.reverse().toString(),reverseada.toString());
    }

    @Test
    public void reverseUnElementosTest(){
        SingleLinkedListImpl normal = new SingleLinkedListImpl<>('A');
        SingleLinkedListImpl reverseada = new SingleLinkedListImpl<>( 'A');
        assertEquals(normal.reverse().toString(),reverseada.toString());
    }

    @Test
    public void reverseDosElementosTest(){
        SingleLinkedListImpl normal = new SingleLinkedListImpl<>('A', 'Z');
        SingleLinkedListImpl reverseada = new SingleLinkedListImpl<>('Z', 'A');
       assertEquals(normal.reverse().toString(),reverseada.toString());
    }



    @Test
    public void reverseNElementosTest(){
        SingleLinkedListImpl normal = new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');
        SingleLinkedListImpl reverseada = new SingleLinkedListImpl<>('Z', 'Y', 'X', 'N', 'M', 'L', 'B', 'A');
        assertEquals(normal.reverse().toString(),reverseada.toString());
    }
}
