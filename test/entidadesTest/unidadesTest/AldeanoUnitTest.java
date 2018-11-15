package entidadesTest.unidadesTest;

import org.junit.Test;

import entidades.unidades.Aldeano;
import entidades.unidades.Unidad;

import static org.junit.Assert.assertEquals;

public class AldeanoUnitTest {

	@Test
	public void aldeanoNuevoTiene50DeVida() {
		Unidad aldeano = new Aldeano();
		assertEquals(aldeano.vida(), 50);
	}

}
