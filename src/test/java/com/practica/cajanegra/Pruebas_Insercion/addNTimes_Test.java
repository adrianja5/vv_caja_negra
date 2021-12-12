package com.practica.cajanegra.Pruebas_Insercion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;
import com.cajanegra.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class addNTimes_Test {

    private SingleLinkedListImpl<Character> listaLlena;
    private SingleLinkedListImpl<Character> listaVacia;

    @BeforeEach
     void inicializarLista() {
        listaLlena = new SingleLinkedListImpl<>('A', 'B', 'C', 'D');
        listaVacia = new SingleLinkedListImpl<>();
    }

    /*Testeando con números incorrectos*/
    @ParameterizedTest
    @CsvSource({
            "-100",
            "-2",
            "-1"
    })
    public void addNTimes_vacia_test_numeros(int num){ //numeros negativos deben dar error

       assertThrows(java.lang.IllegalArgumentException.class, () -> {
           listaVacia.addNTimes('A',num);
       });
       //efectivamente lo dan

    }
    @ParameterizedTest
    @CsvSource({
            "-100",
            "-2",
            "-1"
    })
    public void addNTimes_llena_test_numeros(int num){//lo mismo pero con lista llena

        assertThrows(java.lang.IllegalArgumentException.class, () -> {
            listaVacia.addNTimes('A',num);
        });//funciona bien


    }
    @Test
    public void addNTimes_llena_test_numeros2(){ //al insertar 0 veces la lista se queda igual
        String listaLlena2 = listaLlena.toString();
        listaLlena.addNTimes('B',0);
        assertEquals(listaLlena2,listaLlena.toString());//Da error, como si 0 fuese un número incorrecto

    }

    @Test
    public void addNTimes_llena_test_insercionLetras(){//debe insertarse correctamente
       int x = listaLlena.size();
       listaLlena.addNTimes('A',5);//insertamos
       assertEquals('A', listaLlena.getAtPos(listaLlena.size()));//el ultimo está bien
       assertEquals(x+5,listaLlena.size());//el tamaño está bien
       assertEquals('B',listaLlena.getAtPos(2));//no se ha cambiado cosas que no toca
       assertEquals('A',listaLlena.getAtPos(x+1));//el primero de los 5 nuevos está bien
    }
    //todo bien

    @ParameterizedTest
    @CsvSource({
            "@",
            "[",
            "a"
    })
    public void addNTimes_llena_test_letrasIncorrectas1(Character elem){//deberia saltar error al insertar caracteres incorrectos
       assertThrows(java.lang.IllegalArgumentException.class, () -> {
            listaLlena.addNTimes(elem,5);}); //no lanza error al meter una letra incorrecta

    }
    @ParameterizedTest
    @CsvSource({
            "1",
            "2",
            "5"
    })
    public void addNTimes_llena_test_letrasIncorrectas2(int num){//ademas de saltar error no deben insertarse

       listaLlena.addNTimes('a',num);
        assertNotEquals('a',listaLlena.getAtPos(listaLlena.size()));//sí se llega a insertar el elemento
    }



}
