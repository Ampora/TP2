package entidades.edificios;

import entidades.unidades.Unidad;
import entidades.unidades.ArmaDeAsedio;

public class Castillo implements Edificio {
    private int puntos_de_vida;

    public Castillo() {
        this.puntos_de_vida = 1000;
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
    public Unidad reclutar_unidad(ArmaDeAsedio unidad) {
        ArmaDeAsedio unidad_nueva = new ArmaDeAsedio();
        return unidad_nueva;
    }*/
}
