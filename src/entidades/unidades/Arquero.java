package entidades.unidades;

public class Arquero implements Unidad{
	private int vida;

	public Arquero() {
		/*hay que cambiarlo a private*/
		this.vida = 75;
	}

	public int vida() {
		return vida;
	}

	public  Unidad crear_unidad() {
		Arquero arquero_nuevo = new Arquero();
		/*coste en oro, poblacion etc*/
		return arquero_nuevo;
	}
}
