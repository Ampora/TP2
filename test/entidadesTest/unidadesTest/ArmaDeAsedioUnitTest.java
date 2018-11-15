package entidadesTest.unidadesTest;

import static org.junit.Assert.*;

import org.junit.Test;

import entidades.unidades.ArmaDeAsedio;
import entidades.unidades.Unidad;

public class ArmaDeAsedioUnitTest {

	@Test
	public void armaDeAsedioNuevaTiene150DeVida() {
		Unidad armaDeAsedio = new ArmaDeAsedio();
		assertEquals(armaDeAsedio.vida(), 150);
	}

}
