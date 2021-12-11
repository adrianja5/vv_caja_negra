package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import java.util.NoSuchElementException;
import java.lang.IllegalArgumentException;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


public class Test_addAtPos {

	private  SingleLinkedListImpl<Character> lista=new SingleLinkedListImpl<> ('A','B','L','Y','Z');
	private  SingleLinkedListImpl<Character> vacia=new SingleLinkedListImpl<> ();
	
	@Test	
	public void pruebaLista() throws EmptyCollectionException{
		//Limite Inferior
		SingleLinkedListImpl<Character> esperada1= new SingleLinkedListImpl<> ('A','A','B','L','Y','Z');
	    SingleLinkedListImpl<Character> obtenida1= lista;
	    obtenida1.addAtPos('A',1);
		assertEquals(obtenida1,esperada1);
		
		//Cerca del Limite Inferior
		SingleLinkedListImpl<Character> esperada2= new SingleLinkedListImpl<> ('A','B','B','L','Y','Z');
	    SingleLinkedListImpl<Character> obtenida2= lista;
	    obtenida2.addAtPos('B',2);
		assertEquals(obtenida2,esperada2);
		
		//Limite Superior
		SingleLinkedListImpl<Character> esperada3= new SingleLinkedListImpl<> ('A','B','L','Y','Z','Z');
		SingleLinkedListImpl<Character> obtenida3= lista;
		obtenida3.addAtPos('Z',obtenida3.size());
		assertEquals(obtenida3,esperada3);
		
		//Cerca del Limite Superior
		SingleLinkedListImpl<Character> esperada4= new SingleLinkedListImpl<> ('A','B','L','Y','Y','Z');
		SingleLinkedListImpl<Character> obtenida4= lista;
		obtenida4.addAtPos('Y',obtenida4.size()-1);
		assertEquals(obtenida4,esperada4);
				
		//Posicion dentro del Rango
		SingleLinkedListImpl<Character> esperada5= new SingleLinkedListImpl<> ('A','B','L','A','Y','Z');
		SingleLinkedListImpl<Character> obtenida5= lista;
		obtenida5.addAtPos('A',4);
		assertEquals(obtenida5,esperada5);
				
		//Posicion fuera del Rango
		SingleLinkedListImpl<Character> esperada6= new SingleLinkedListImpl<> ('A','B','L','Y','Z','A');
		SingleLinkedListImpl<Character> obtenida6= lista;
		obtenida6.addAtPos('A',40);
		assertEquals(obtenida6,esperada6);
		
		}

	@Test	
	public void pruebaVacia() {
		//lista vacia
		SingleLinkedListImpl<Character> esperada7= new SingleLinkedListImpl<> ('A');
	    SingleLinkedListImpl<Character> obtenida7= vacia;
	    obtenida7.addAtPos('A',4);
		assertEquals(obtenida7,esperada7);
			
		}
	@Test	
	public void pruebaFueraDominio() {
		//Fuera del Limite Inferior
		SingleLinkedListImpl<Character> esperada8= new SingleLinkedListImpl<> ('A','B','L','Y','Z');
	    SingleLinkedListImpl<Character> obtenida8= lista;
	    obtenida8.addAtPos('4',4);
		assertEquals(obtenida8,esperada8);
		
		//Fuera del Limite Superior
		SingleLinkedListImpl<Character> esperada9= new SingleLinkedListImpl<> ('A','B','L','Y','Z');
		SingleLinkedListImpl<Character> obtenida9= lista;
		obtenida9.addAtPos('m',4);
	    assertEquals(obtenida9,esperada9);	
		}	
	@Test	
	public void pruebaPosicionInvalida() {
		//Limite Inferior
		assertThrows(java.lang.IllegalArgumentException.class, () -> {
	    lista.addAtPos('A',-1);;
		});
				
	    //Cerca del Limite Inferior
		assertThrows(java.lang.IllegalArgumentException.class, () -> {
		lista.addAtPos('B',-1);
		});
				
		//Limite Superior
		assertThrows(java.lang.IllegalArgumentException.class, () -> {
		lista.addAtPos('Z',-1);
		});
				
		//Cerca del Limite Superior
		assertThrows(java.lang.IllegalArgumentException.class, () -> {
		lista.addAtPos('Y',-1);
		});
		
		//lista vacia
	    assertThrows(java.lang.IllegalArgumentException.class, () -> {
		vacia.addAtPos('Y',-1);
		});	
	    
	    //Fuera del Limite Inferior
	    assertThrows(java.lang.IllegalArgumentException.class, () -> {
	  	lista.addAtPos('4',-1);
	  	});
	    
	  //Fuera del Limite Superior
	    assertThrows(java.lang.IllegalArgumentException.class, () -> {
	  	lista.addAtPos('m',-1);
	  	});
		}
}
