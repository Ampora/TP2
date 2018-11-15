package entidades.edificios;

import entidades.unidades.Aldeano;
import entidades.unidades.Unidad;

public class Plaza implements Edificio {
    private int puntos_de_vida;

    public Plaza() {
        this.puntos_de_vida = 450;
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
    public Unidad reclutar_unidad(Aldeano unidad) {
        Aldeano unidad_nueva = new Aldeano();
        return unidad_nueva;
    }*/
}
