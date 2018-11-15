package entidades.unidades;

public class Aldeano implements Unidad {
	private int puntos_de_vida;

	public Aldeano() {
		/*hay que cambiarlo a private*/
		this.puntos_de_vida = 50;
	}

	@Override
	public int vida() {
		return puntos_de_vida;
	}

	public  Unidad crear_unidad() {
		Aldeano aldeano_nuevo = new Aldeano();
		/*coste en oro, poblacion etc*/
		return aldeano_nuevo;
	}
}
