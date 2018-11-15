package entidades.edificios;

import entidades.unidades.Espadachin;
import entidades.unidades.Arquero;
import entidades.unidades.Unidad;

public class Cuartel implements Edificio {
    private int puntos_de_vida;

    public Cuartel() {
        this.puntos_de_vida = 250;
    }

    @Override
    public int vida() {
        return puntos_de_vida;
    }

    @Override
    public Unidad reclutar_unidad(Unidad unidad) {
        Unidad nueva_unidad = unidad.crear_unidad();
        /*aca estaria el posicionamiento en el terreno de la unidad*/
        return nueva_unidad;
    }
    /*
    public Unidad reclutar_unidad(Espadachin unidad) {
        Espadachin unidad_nueva = new Espadachin();
        return unidad_nueva;
    }

    public Unidad reclutar_unidad(Arquero unidad) {
        Arquero unidad_nueva = new Arquero();
        return unidad_nueva;
    }*/
}
