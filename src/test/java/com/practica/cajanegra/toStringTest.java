package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cajanegra.SingleLinkedListImpl;

public class toStringTest {

	@Test
	public void stringVaciaTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>();
		String string = "[]";
		assertEquals(string, lista.toString());
	}

	@Test
	public void stringUnoTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>('A');
		String string = "[A]";
		assertEquals(string, lista.toString());
	}

	@Test
	public void stringDosTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>('A', 'A');
		String string = "[A, A]";
		assertEquals(string, lista.toString());
	}

	@Test
	public void stringNTest() {
		SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<>('A', 'B', 'L', 'M', 'N', 'X', 'Y', 'Z');
		String string = "[A, B, L, M, N, X, Y, Z]";
		assertEquals(string, lista.toString());// expected,actual
	}
}
