package com.facturas.facturas.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FactModel {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
private Integer ID;

@Column(name = "nombre")
private String Nombre;

@Column(name = "apellido")
private String Apellido;

@Column(name = "cedula")
private int Cedula;

}
