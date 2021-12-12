package com.practica.cajanegra.Pruebas_Consulta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class sizeTest {

	@Test
	public void tamanoCeroTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>();
		int cont = 0;
		for (Character c : lista) { cont++; }
		assertEquals(cont, lista.size());
	}

	@Test
	public void tamanoUnoTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>('A');
		int cont = 0;
		for (Character c : lista) { cont++; }
		assertEquals(cont, lista.size());
	}

	@Test
	public void tamanoDosTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>('A', 'A');
		int cont = 0;
		for (Character c : lista) { cont++; }
		assertEquals(cont, lista.size());
	}

	@Test
	public void tamanoSieteTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y');
		int cont = 0;
		for (Character c : lista) { cont++; }
		assertEquals(cont, lista.size());
	}

	@Test
	public void tamanoNTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z', 'A',
				'B', 'L', 'M', 'N', 'X', 'Y', 'Z', 'A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z', 'A', 'B', 'L', 'M', 'N', 'X',
				'Y', 'Z', 'A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');
		int cont = 0;
		for (Character c : lista) { cont++; }
		assertEquals(cont, lista.size());
	}

}
