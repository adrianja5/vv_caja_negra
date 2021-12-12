package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThrows;



public class Test_addFirst {
	
	private  SingleLinkedListImpl<Character> lista=new SingleLinkedListImpl<> ('A','B','L','Y','Z');
	private  SingleLinkedListImpl<Character> vacia=new SingleLinkedListImpl<> ();

	
	@ParameterizedTest
	@CsvSource({
			"'A'",	
			"'B'",	
			"'Z'",	
			"'Y'",	
	
	})
	void pruebaLista(Character elem) {
		SingleLinkedListImpl<Character> obtenida1 = lista;
		obtenida1.addFirst(elem);
		assertEquals(obtenida1.getAtPos(1), elem);
	}
	
	@Test	
public void pruebaVacia() {
	//lista vacia
	SingleLinkedListImpl<Character> esperada2= new SingleLinkedListImpl<> ('A');
        SingleLinkedListImpl<Character> obtenida2= vacia;
        obtenida2.addFirst('A');
	assertIterableEquals(obtenida2,esperada2);
	
	//lista vacia parametro invalido
        assertThrows(IllegalArgumentException.class, () -> {
	vacia.addFirst('Y',-1);
	});
		
	}
	
	@ParameterizedTest
	@CsvSource({
		"'4'",
		"'m'",
    })
void pruebaFueraDominio(Character elem) {
	SingleLinkedListImpl<Character> esperada3 = lista;
	assertThrows(IllegalArgumentException.class, () -> esperada3.addFirst(elem));
}
}
