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

public class toStringTest {

    private static SingleLinkedListImpl<Character> lista=new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');;
    String l=lista.toString();
    //System.out.println(lista);



    @BeforeAll
    static void inicializarLista() {
        lista = new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');
    }


    @Test
    public void stringVaciaTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl();
        String string="[]";
        assertEquals(string,lista.toString());
    }
    @Test
    public void stringUnoTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl('A');
        String string="[A]";
        assertEquals(string,lista.toString());
    }
    @Test
    public void stringDosTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl('A','A');
        String string="[A,A]";
        assertEquals(string,lista.toString());
    }
    @Test
    public void stringNTest(){
        SingleLinkedListImpl lista= new SingleLinkedListImpl('A','B','L','M','N','X','Y','Z');
        String string="[A,B,L,M,N,X,Y,Z]";
        assertEquals(string,lista.toString());//expected,actual
    }
}
