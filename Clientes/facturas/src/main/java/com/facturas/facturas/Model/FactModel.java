package com.facturas.facturas.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class FactModel {

@Id
@GeneratedValue
private Integer ID;
private String Nombre;
private String Apellido;
private int Cedula;



    public FactModel() {
    }


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return this.Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return this.Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    
}
