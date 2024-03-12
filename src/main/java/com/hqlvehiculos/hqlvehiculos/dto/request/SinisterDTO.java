package com.hqlvehiculos.hqlvehiculos.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SinisterDTO  {
    private LocalDate fecha;
    private Double perdida;
}
