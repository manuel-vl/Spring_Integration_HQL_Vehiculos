package com.hqlvehiculos.hqlvehiculos.services;

import com.hqlvehiculos.hqlvehiculos.dto.request.SinisterDTO;

import java.util.List;

public interface ISinisterService {
    List<SinisterDTO> getAll();
    SinisterDTO save(SinisterDTO sinisterDTO);
    SinisterDTO getById(Long id);
}
