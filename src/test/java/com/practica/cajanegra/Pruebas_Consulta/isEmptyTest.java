package com.practica.cajanegra.Pruebas_Consulta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

class isEmptyTest {
	
	private static SingleLinkedListImpl<Character> listaLlena;
	private static SingleLinkedListImpl<Character> listaVacia;
	
	@BeforeAll
	static void inicializarLista() {
		listaLlena = new SingleLinkedListImpl<>('A', 'B', 'C', 'D');
		listaVacia = new SingleLinkedListImpl<>();
	}

	@Test
	void isEmptyLlenoTest() {
		assertEquals(false, listaLlena.isEmpty());
	}
	
	@Test
	void isEmptyVacioTest() {
		assertEquals(true, listaVacia.isEmpty());
	}

}
