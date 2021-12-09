package com.practica.cajanegra;
import java.util.Arrays;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.cajanegra.SingleLinkedListImpl;

public class sizeTest {

    private static SingleLinkedListImpl<Character> lista;

    @BeforeAll
    static void inicializarLista() {
        lista = new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');
    }

    @Test
    public void tamanoCeroTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl();
        int cont=0;
        for (Object c:lista) {cont++;}
        assertEquals(cont,lista.size());
    }

    @Test
    public void tamanoUnoTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl('A');
        int cont=0;
        for (Object c:lista) {cont++;}
        assertEquals(cont,lista.size());
    }

    @Test
    public void tamanoDosTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl('A','A');
        int cont=0;
        for (Object c:lista) {cont++;}
        assertEquals(cont,lista.size());
    }

    @Test
    public void tamanoSieteTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl('A', 'B', 'L', 'M', 'N', 'X', 'Y');
        int cont=0;
        for (Object c:lista) {cont++;}
        assertEquals(cont,lista.size());
    }

    @Test
    public void tamanoNTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z','A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z','A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z','A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z','A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');
        int cont=0;
        for (Object c:lista) {cont++;}
        assertEquals(cont,lista.size());
    }


}
