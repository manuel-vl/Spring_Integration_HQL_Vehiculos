package com.hqlvehiculos.hqlvehiculos.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Sinisters")
@Getter
@Setter
public class Sinister {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate fecha;
    private Double perdida;
    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;
}
