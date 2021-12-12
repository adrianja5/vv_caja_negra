package com.practica.cajanegra.Pruebas_Consulta;

import static org.junit.jupiter.api.Assertions.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import com.cajanegra.SingleLinkedListImpl;

class indexOfTest {
	
	private static SingleLinkedListImpl<Character> lista;
	
	@BeforeAll
	static void inicializarLista() {
		lista = new SingleLinkedListImpl<>('A', 'B', 'M', 'D', 'T', 'D', 'Y', 'Z');
	}

	@ParameterizedTest(name="[{index}] -> elem=''{0}'', salidaEsperada={1}")
	@CsvSource({
		"'A', 1",
		"'B', 2",
		"'D', 4",
		"'Y', 7",
		"'Z', 8",
	})
	void indexOfValidoTest(Character elem, int salidaEsperada) {
		assertEquals(salidaEsperada, lista.indexOf(elem));
	}
	
	@ParameterizedTest(name="[{index}] -> elem=''{0}''")
	@CsvSource({
		"'X'",
		"'@'",
		"'['",
	})
	void indexOfInvalidoTest(Character elem) {
		assertThrows(NoSuchElementException.class, () -> {
			lista.indexOf(elem);
		});
	}

}
