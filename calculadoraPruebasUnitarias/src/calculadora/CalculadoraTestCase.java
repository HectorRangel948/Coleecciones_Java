package calculadora;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class CalculadoraTestCase {

	@Test
	void testSumar() {
		int resultado = Calculadora.suma(2, 3);
		
		//Para esta prueba, espero que la suma me dé 5 (3+2)
		assertEquals(5, resultado); //lo que espero y lo que tengo
}
	
	@Test
	void testMultiplicar() {
		int resultado = Calculadora.multiplicar(2, 3);
		
		//Para esta prueba, espero que la suma me dé 6 (2*3)
		assertEquals(6, resultado);//lo que espero y lo que tengo

	}
	
//	@Test(expected = ArithmeticException.class)
//	void testDividir() {
//		float resultado = Calculadora.dividir(6.0f, 2.0f);
//		assertEquals(resultado, resultado);
//	}
}
