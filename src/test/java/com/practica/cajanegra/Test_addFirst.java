package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThrows;



public class Test_addFirst {
	
	private  SingleLinkedListImpl<Character> lista=new SingleLinkedListImpl<> ('A','B','L','Y','Z');
	private  SingleLinkedListImpl<Character> vacia=new SingleLinkedListImpl<> ();

	
@Test	
public void pruebaLista() throws EmptyCollectionException{
	//Limite Inferior
	SingleLinkedListImpl<Character> esperada1= new SingleLinkedListImpl<> ('A','A','B','L','Y','Z');
    SingleLinkedListImpl<Character> obtenida1= lista;
    obtenida1.addFirst('A');
	assertEquals(obtenida1,esperada1);
	//Cerca del Limite Inferior
	SingleLinkedListImpl<Character> esperada2= new SingleLinkedListImpl<> ('B','A','B','L','Y','Z');
    SingleLinkedListImpl<Character> obtenida2= lista;
    obtenida2.addFirst('B');
	assertEquals(obtenida2,esperada2);
	//Limite Superior
	SingleLinkedListImpl<Character> esperada3= new SingleLinkedListImpl<> ('Z','A','B','L','Y','Z');
	SingleLinkedListImpl<Character> obtenida3= lista;
	obtenida3.addFirst('Z');
	assertEquals(obtenida3,esperada3);
	//Cerca del Limite Superior
	SingleLinkedListImpl<Character> esperada4= new SingleLinkedListImpl<> ('Y','A','B','L','Y','Z');
	SingleLinkedListImpl<Character> obtenida4= lista;
	obtenida4.addFirst('Y');
	assertEquals(obtenida4,esperada4);
	}
@Test	
public void pruebaVacia() {
	//lista vacia
	SingleLinkedListImpl<Character> esperada5= new SingleLinkedListImpl<> ('A');
    SingleLinkedListImpl<Character> obtenida5= vacia;
    obtenida5.addFirst('A');
	assertEquals(obtenida5,esperada5);
		
	}
@Test	
public void pruebaFueraDominio() {
	//Fuera del Limite Inferior
	SingleLinkedListImpl<Character> esperada6= new SingleLinkedListImpl<> ('A','B','L','Y','Z');
    SingleLinkedListImpl<Character> obtenida6= lista;
    obtenida6.addFirst('4');
	assertEquals(obtenida6,esperada6);
	//Fuera del Limite Superior
	SingleLinkedListImpl<Character> esperada7= new SingleLinkedListImpl<> ('A','B','L','Y','Z');
	SingleLinkedListImpl<Character> obtenida7= lista;
	obtenida7.addFirst('m');
    assertEquals(obtenida7,esperada7);	
	}
}
