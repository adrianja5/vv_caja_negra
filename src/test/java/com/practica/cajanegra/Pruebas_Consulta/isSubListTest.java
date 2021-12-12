package com.practica.cajanegra.Pruebas_Consulta;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.cajanegra.SingleLinkedListImpl;

class isSubListTest {

	@ParameterizedTest(name = "[{index}] -> lista={0}, part={1}, salidaEsperada={2}")
	@MethodSource("generateData")
	void test(SingleLinkedListImpl<Character> lista, SingleLinkedListImpl<Character> part, int salidaEsperada) {
		assertEquals(salidaEsperada, lista.isSubList(part));
	}

	static Stream<Arguments> generateData() {
		SingleLinkedListImpl<Character> listaVacia = new SingleLinkedListImpl<>();
		SingleLinkedListImpl<Character> listaLlena = new SingleLinkedListImpl<>('A', 'J', 'E', 'V', 'T', 'W', 'L');

		return Stream.of(Arguments.of(listaVacia, new SingleLinkedListImpl<>(), 0),
				Arguments.of(listaVacia, new SingleLinkedListImpl<>('A'), -1),

				Arguments.of(listaLlena, new SingleLinkedListImpl<>(), 0),

				Arguments.of(listaLlena, new SingleLinkedListImpl<>('A'), 1),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('J'), 2),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('V'), 4),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('W'), 6),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('L'), 7),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('X'), -1),

				Arguments.of(listaLlena, new SingleLinkedListImpl<>('A', 'J'), 1),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('J', 'E'), 2),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('V', 'T'), 4),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('W', 'L'), 6),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('A', 'X'), -1),

				Arguments.of(listaLlena, new SingleLinkedListImpl<>('A', 'J', 'E', 'V', 'T', 'W'), 1),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('J', 'E', 'V', 'T', 'W', 'L'), 2),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('A', 'J', 'E', 'V', 'T', 'X'), -1),

				Arguments.of(listaLlena, new SingleLinkedListImpl<>('A', 'J', 'E', 'V', 'T', 'W', 'L'), 1),
				Arguments.of(listaLlena, new SingleLinkedListImpl<>('A', 'J', 'E', 'V', 'T', 'W', 'X'), -1),

				Arguments.of(listaLlena, new SingleLinkedListImpl<>('A', 'J', 'E', 'V', 'T', 'W', 'L', 'X'), -1));
	}

}
