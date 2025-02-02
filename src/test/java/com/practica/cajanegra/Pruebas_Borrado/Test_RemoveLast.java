
package com.practica.cajanegra.Pruebas_Borrado;

import com.cajanegra.SingleLinkedListImpl;
import static org.junit.Assert.assertThrows;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class Test_RemoveLast {
		private SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<> ('A','D','O');
		private SingleLinkedListImpl<Character> listaVacia = new SingleLinkedListImpl<> ();
		
@Test
	public void Test_RemoveLista() throws EmptyCollectionException {
		
		assertEquals('O', lista.removeLast());
			
	    }

	@Test
	public void listaVacia() {
		assertThrows(com.cajanegra.EmptyCollectionException.class, () -> {
			listaVacia.removeLast();
		    });

	    }
	}
		


