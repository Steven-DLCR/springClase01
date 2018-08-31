package com.seven.services.data;

public class TipoArticulo {

    private int id;
    private String nombre;
    private Integer estado;

    public TipoArticulo() {
    }

    public TipoArticulo(int id, String nombre, Integer estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
