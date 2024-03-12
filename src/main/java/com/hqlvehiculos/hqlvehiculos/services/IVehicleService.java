package com.hqlvehiculos.hqlvehiculos.services;

import com.hqlvehiculos.hqlvehiculos.dto.request.VehicleDTO;

import java.util.List;
import java.util.Optional;

public interface IVehicleService {
    List<VehicleDTO> getAll();
    VehicleDTO save(VehicleDTO vehicleDTO);
    Optional<VehicleDTO> getById(Long id);
}
