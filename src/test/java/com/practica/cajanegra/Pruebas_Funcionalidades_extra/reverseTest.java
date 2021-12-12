package com.practica.cajanegra.Pruebas_Funcionalidades_extra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class reverseTest {

	@Test
	public void reverseListaVaciaTest() {
		SingleLinkedListImpl<Character> normal = new SingleLinkedListImpl<>();
		SingleLinkedListImpl<Character> reverseada = new SingleLinkedListImpl<>();
		assertEquals(normal.reverse().toString(), reverseada.toString());
	}

	@Test
	public void reverseUnElementosTest() {
		SingleLinkedListImpl<Character> normal = new SingleLinkedListImpl<>('A');
		SingleLinkedListImpl<Character> reverseada = new SingleLinkedListImpl<>('A');
		assertEquals(normal.reverse().toString(), reverseada.toString());
	}

	@Test
	public void reverseDosElementosTest() {
		SingleLinkedListImpl<Character> normal = new SingleLinkedListImpl<>('A', 'Z');
		SingleLinkedListImpl<Character> reverseada = new SingleLinkedListImpl<>('Z', 'A');
		assertEquals(normal.reverse().toString(), reverseada.toString());
	}

	@Test
	public void reverseNElementosTest() {
		SingleLinkedListImpl<Character> normal = new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');
		SingleLinkedListImpl<Character> reverseada = new SingleLinkedListImpl<>('Z', 'Y', 'X', 'N', 'M', 'L', 'B', 'A');
		assertEquals(normal.reverse().toString(), reverseada.toString());
	}
}
