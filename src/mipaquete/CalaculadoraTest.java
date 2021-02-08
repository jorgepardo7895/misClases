package mipaquete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalaculadoraTest {

	@Test
	void test() {
		float op = Calaculadora.suma(4, 4);
		float resul = 8;
		assertEquals(resul, op);
	}
	@Test
	void test2() {
		float op = Calaculadora.resta(4, 4);
		float resul = 0;
		assertEquals(resul, op);
	}
	@Test
	void test3() {
		float op = Calaculadora.multiplicacion(4, 4);
		float resul = 16;
		assertEquals(resul, op);
	}
	@Test
	void test4() {
		float op = Calaculadora.division(4, 4);
		float resul = 1;
		assertEquals(resul, op);
	}

}
