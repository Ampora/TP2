package entidades.unidades;

public class ArmaDeAsedio implements Unidad{
	private int vida;

	public ArmaDeAsedio() {
		/*hay que cambiarlo a private*/
		this.vida = 150;
	}

	public int vida() {
		return vida;
	}

	public  Unidad crear_unidad() {
		ArmaDeAsedio arma_de_asedio_nueva = new ArmaDeAsedio();
		/*coste en oro, poblacion etc*/
		return arma_de_asedio_nueva;
	}
}
