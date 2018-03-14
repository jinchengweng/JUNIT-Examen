package examenED;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class CadenasTestParametrizadoVF {

		private String cadenaIncicial, cadenaSolicitado;
		private int resultadoEsperado;
		
		public static Collection<Object[]> datos(){
			return Arrays.asList(new Object[][] {
				{"A", "AS", -2},
				{"A", "", 1}
				
			});
		}

		@Test
		public void testVFCadenas() {
			Cadenas cc = new  Cadenas();
			boolean resultadoReal = cc.sonPrimerosYultimos2CharsLosMismos("AA");
			assertEquals(resultadoEsperado, resultadoReal);
		}
}
