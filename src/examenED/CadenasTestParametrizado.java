package examenED;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class CadenasTestParametrizado {

	private String cadenaIncicial, cadenaSolicitado;
	private int resultadoEsperado;
	
	public CadenasTestParametrizado(String cadenaIncicial, String cadenaSolicitado, int resultadoEsperado) {
		super();
		this.cadenaIncicial = cadenaIncicial;
		this.cadenaSolicitado = cadenaSolicitado;
		this.resultadoEsperado = resultadoEsperado;
	}
	

	@Parameters
	public static Collection<Object[]> datos(){
		return Arrays.asList(new Object[][] {
			{"A", "B", 2}
		});
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones() {
		Cadenas cc = new  Cadenas();
		String resultadoReal = cc.quitarAenPrimeras2Posiciones("A");
		
		equals(resultadoReal);
	}
	
	
}
