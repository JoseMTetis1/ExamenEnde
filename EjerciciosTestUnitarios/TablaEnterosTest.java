package EjerciciosTestUnitarios;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TablaEnterosTest {

	@BeforeEach
	void CositasQueHacerAntes () {
		Integer[] numeros = new Integer [3];
		numeros[0]= 2;
		numeros[1]=4;
		numeros[2]=6;
		TablaEnteros test = new TablaEnteros(numeros);
		
	}
	
	
	
	
	@Test
	void testSumaTabla() {
		Integer[] numeros = new Integer [3];
		numeros[0]= 2;
		numeros[1]=4;
		numeros[2]=6;
		TablaEnteros test = new TablaEnteros(numeros);
		
		int  esperado = 12;
		assertEquals(esperado, test.sumaTabla());
	}
	@Test
	void testMayorTabla() {
		Integer[] numeros = new Integer [3];
		numeros[0]= 2;
		numeros[1]=4;
		numeros[2]=6;
		TablaEnteros test = new TablaEnteros(numeros);
		
		int  esperado = 6;
		assertEquals(esperado, test.mayorTabla());
	}
	@Test
	void testPosicionTabla() {
		Integer[] numeros = new Integer [3];
		numeros[0]= 2;
		numeros[1]=4;
		numeros[2]=6;
		TablaEnteros test = new TablaEnteros(numeros);
		
		int  esperado = 2;
		assertEquals(esperado, test.posicionTabla(5));
	}
	
	
}
