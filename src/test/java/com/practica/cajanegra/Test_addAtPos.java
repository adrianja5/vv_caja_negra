package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import java.lang.IllegalArgumentException;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


public class Test_addAtPos {

	private  SingleLinkedListImpl<Character> lista=new SingleLinkedListImpl<> ('A','B','L','Y','Z');
	private  SingleLinkedListImpl<Character> vacia=new SingleLinkedListImpl<> ();
	
	@ParameterizedTest
	@CsvSource({
			"'A',	1",
			"'B',	2",
			"'Z',	5",
			"'Y',	4",
			"'A',	3",
			"'A',	40",
	
	})
	void pruebaLista(Character elem, int p) {
		SingleLinkedListImpl<Character> obtenida1 = lista;
		obtenida1.addAtPos(elem, p);
		assertEquals(obtenida1.getAtPos(p), elem);
	}

	@Test	
	public void pruebaVacia() {
		//lista vacia
		SingleLinkedListImpl<Character> esperada2= new SingleLinkedListImpl<> ('A');
	        SingleLinkedListImpl<Character> obtenida2= vacia;
	        obtenida2.addAtPos('A',4);
		assertEquals(obtenida2,esperada2);
		
		//lista vacia parametro invalido
                assertThrows(IllegalArgumentException.class, () -> {
	        vacia.addAtPos('Y',-1);
	    });
			
		}


		@ParameterizedTest
		@CsvSource({
				"'4',	4",
				"'m',	4",
				"'A',	-1",
				"'B',	0",
				"'Z',	-1",
				"'Y',	0",
				"'4',	-1",
				"'m',	0",
		})
		void pruebaFueraDominio(Character elem, int p) {
			SingleLinkedListImpl<Character> esperada = lista;
			assertThrows(IllegalArgumentException.class, () -> esperada.addAtPos(elem, p));
		}	
			
}
