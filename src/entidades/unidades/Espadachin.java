package entidades.unidades;

public class Espadachin implements Unidad{
	private int vida;

	public Espadachin() {
		/*hay que cambiarlo a private*/
		this.vida = 100;
	}

	public int vida() {
		return vida;
	}

	public  Unidad crear_unidad() {
		Espadachin espadachin_nuevo = new Espadachin();
		/*coste en oro, poblacion etc*/
		return espadachin_nuevo;
	}
}
