package com.bosch.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * Created by 53298857Z on 17/10/2016.
 */
@Entity
public class Equipos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String localidad;
    private LocalDate creacion;


    public Equipos() {

    }

    public Equipos(String nombre, String localidad, LocalDate creacion) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.creacion = creacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    @Override
    public String toString() {
        return "Equipos{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", localidad='" + localidad + '\'' +
                ", creacion=" + creacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Equipos equipos = (Equipos) o;

        if (id != null ? !id.equals(equipos.id) : equipos.id != null) return false;
        if (nombre != null ? !nombre.equals(equipos.nombre) : equipos.nombre != null) return false;
        if (localidad != null ? !localidad.equals(equipos.localidad) : equipos.localidad != null) return false;
        return creacion != null ? creacion.equals(equipos.creacion) : equipos.creacion == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (localidad != null ? localidad.hashCode() : 0);
        result = 31 * result + (creacion != null ? creacion.hashCode() : 0);
        return result;
    }
}
