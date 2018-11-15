package entidadesTest.unidadesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.unidades.Espadachin;
import entidades.unidades.Unidad;

public class EspadachinUnitTest {

	@Test
	public void EspadachinNuevoTiene100DeVida() {
		Unidad espadachin = new Espadachin();
		assertEquals(espadachin.vida(), 100);
	}

}