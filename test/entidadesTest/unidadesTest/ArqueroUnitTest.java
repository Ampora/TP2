package entidadesTest.unidadesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.unidades.Arquero;
import entidades.unidades.Unidad;

public class ArqueroUnitTest {

	@Test
	public void arqueroNuevoTiene75DeVida() {
		Unidad arquero = new Arquero();
		assertEquals(arquero.vida(), 75);
	}

}
