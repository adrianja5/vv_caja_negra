package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;

import com.cajanegra.EmptyCollectionException;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.NoSuchElementException;

public class Test_RemoveLastConParam{
	private SingleLinkedListImpl<Character> lista = new SingleLinkedListImpl<> ('A','B','Z','C','Y','C','F');
	private SingleLinkedListImpl<Character> listaVacia = new SingleLinkedListImpl<> ();
	

@Test
public void TestV1() throws EmptyCollectionException{

	assertEquals('A',lista.removeLast('A'));
	assertIterableEquals(new SingleLinkedListImpl<> ('B','Z','C','Y','C','F'), lista );
	
   }
@Test
public void TestV2() throws EmptyCollectionException{

	assertEquals('B',lista.removeLast('B'));
	assertIterableEquals(new SingleLinkedListImpl<> ('A','Z','C','Y','C','F'), lista );
	
   }
@Test
public void TestV3() throws EmptyCollectionException{

	assertEquals('C',lista.removeLast('C'));
	System.out.println(lista.removeLast('C'));
	assertIterableEquals(new SingleLinkedListImpl<> ('A','B','Z','C','Y','F'), lista );
	

	
   }
@Test
public void TestV4() throws EmptyCollectionException{

	assertEquals('Y',lista.removeLast('Y'));
	assertIterableEquals(new SingleLinkedListImpl<> ('A','B','Z','C','C','F'), lista );
   }

@Test
public void TestV5() throws EmptyCollectionException{

	assertEquals('Z',lista.removeLast('Z'));
	assertIterableEquals(new SingleLinkedListImpl<> ('A','B','C','Y','C','F'), lista );
	
   }
@Test
public void TestInV1(){
	
	assertThrows(NoSuchElementException.class, ()->{lista.removeLast('@');});
	
   }

@Test
public void TestInV2(){

	assertThrows(NoSuchElementException.class, ()->{lista.removeLast('[');});
	
   }

@Test
public void TestInV3(){

	assertThrows(NoSuchElementException.class, ()->{lista.removeLast('D');});
	
   }


@Test
public void ElemtNull(){

	assertThrows(NullPointerException.class,() ->{lista.removeLast(null);});
	
   }

@Test
public void ListaVacia() {
	assertThrows(com.cajanegra.EmptyCollectionException.class, () -> {
		listaVacia.removeLast();
	    });	
   }

}
