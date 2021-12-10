package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_RemoveListConParam{
	private SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<> ('A','D','A','O');
	private SingleLinkedListImpl<Character> listaVacia = new SingleLinkedListImpl<> ();
	private SingleLinkedListImpl<Character> element = new SingleLinkedListImpl<> ('A');
	private SingleLinkedListImpl<Character> listaSecuentaria = new SingleLinkedListImpl<> ('D','O');

@Test
public void Test() throws EmptyCollectionException{

	assertEquals('A',lista.removeLast('A'));
	
   }



@Test
public void listaVacia() {
	assertThrows(com.cajanegra.EmptyCollectionException.class, () -> {
		listaVacia.removeLast();
	    });
	
   }

@Test
public void TestElemento() {
	lista.indexOf('A');
  }
}
