package entidades.edificios;


import entidades.unidades.Unidad;

public interface Edificio implements Entidad {
    Unidad reclutar_unidad(Unidad unidad);
}
