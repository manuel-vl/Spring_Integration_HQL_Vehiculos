package com.hqlvehiculos.hqlvehiculos.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicles")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String patente;

    String marca;

    String modelo;

    Integer anioDeFabricacion;

    Integer cantidadDeRuedas;


}
