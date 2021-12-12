package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;


public class Test_addLast {
	
	private  SingleLinkedListImpl<Character> lista=new SingleLinkedListImpl<> ('A','B','L','Y','Z');
	private  SingleLinkedListImpl<Character> vacia=new SingleLinkedListImpl<> ();

	
	@ParameterizedTest
	@CsvSource({
			"'A'",	
			"'B'",	
		        "'L'",
			"'Z'",	
			"'Y'",	
	
	})
	void pruebaLista(Character elem) {
		SingleLinkedListImpl<Character> obtenida1 = lista;
		obtenida1.addLast(elem);
		assertEquals(obtenida1.getAtPos(obtenida1.size()), elem);
	}
	
	@Test	
public void pruebaVacia() {
	//lista vacia
	SingleLinkedListImpl<Character> esperada2= new SingleLinkedListImpl<> ('A');
        SingleLinkedListImpl<Character> obtenida2= vacia;
        obtenida2.addLast('A');
	assertEquals(obtenida2,esperada2);
	
	//lista vacia parametro invalido
        assertThrows(IllegalArgumentException.class, () -> {
	vacia.addLast('4');
	});
		
	}
	
	@ParameterizedTest
	@CsvSource({
		"'4'",
		"'m'",
    })
void pruebaFueraDominio(Character elem) {
	SingleLinkedListImpl<Character> esperada3 = lista;
	assertThrows(IllegalArgumentException.class, () -> esperada3.addLast(elem));
}
}
