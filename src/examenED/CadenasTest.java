package examenED;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class CadenasTest {

	Cadenas cc;
	
	@BeforeClass
	public static void inicioBateriaPruebas() {
		System.out.println("COMENZANDO PRUEBAS!!!!!");
	}
	@Before
	public void inicioPrueba() {
		System.out.println("Inicio Test");
		cc= new Cadenas();
	}

	@Test
	public void cadenaMenosPrimeros2Chars() {
		cc = new Cadenas();
		String resultadoReal = cc.quitarAenPrimeras2Posiciones("A");
		equals(resultadoReal);
	}
	

	@Test
	public void primeros2Chars() {
		cc = new Cadenas();
		String resultadoReal = cc.quitarAenPrimeras2Posiciones("B");
		equals(resultadoReal);
	}
	
	
	@Test
	public void sonDosPrimeroLoMismo() {
		cc= new Cadenas();
		boolean resultadoReal = cc.sonPrimerosYultimos2CharsLosMismos("AA");
		assertTrue(resultadoReal);
	}
	
	@Test
	public void sonDosUltimoLoMismo() {
		cc= new Cadenas();
		boolean resultadoReal = cc.sonPrimerosYultimos2CharsLosMismos("B");
		assertFalse(resultadoReal);
	}
	@After
	public void finTest() {
		System.out.println("fin Test");
		cc= null;
	}
	
	@AfterClass
	public static void finBateriaPrueba() {
		System.out.println("FIN DE LAS PRUEBAS!!!");
	}
}
