package com.hqlvehiculos.hqlvehiculos.services;

import com.hqlvehiculos.hqlvehiculos.dto.request.VehicleDTO;
import com.hqlvehiculos.hqlvehiculos.excepciones.NotFoundException;
import com.hqlvehiculos.hqlvehiculos.model.Vehicle;
import com.hqlvehiculos.hqlvehiculos.repositories.ISinisterRepository;
import com.hqlvehiculos.hqlvehiculos.repositories.IVehicleRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService implements IVehicleService{
    @Autowired
    IVehicleRepository vehicleRepository;


    private ModelMapper mapper=new ModelMapper();

    @Override
    public List<VehicleDTO> getAll() {
        return vehicleRepository.findAll().stream().map(vehicle -> mapper.map(vehicle, VehicleDTO.class)).toList();
    }

    @Override
    public VehicleDTO save(VehicleDTO vehicleDTO) {
        Vehicle vehicle=mapper.map(vehicleDTO, Vehicle.class);

        vehicle.getSinisters().forEach(sinister -> sinister.setVehicle(vehicle));

        vehicleRepository.save(vehicle);

        return vehicleDTO;
    }

    @Override
    public Optional<VehicleDTO> getById(Long id) {
        Optional<Vehicle> vehicleFound = vehicleRepository.findById(id);
        if(vehicleFound.isEmpty()){
            throw new NotFoundException("Vehicle don't exists");
        }else {
            return Optional.of(mapper.map(vehicleFound,VehicleDTO.class));
        }
    }
}
