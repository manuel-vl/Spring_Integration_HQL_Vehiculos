package com.hqlvehiculos.hqlvehiculos.repositories;

import com.hqlvehiculos.hqlvehiculos.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, Long> {
    /*
    Listar las patentes de todos los vehículos registrados. // Muestra solo las patentes --> Get all
     */
    @Query("SELECT v.patente FROM Vehicle v")
    List<Vehicle> getAllPatentes();
    /*
    Listar la patente y la marca de todos los vehículos ordenados por año de fabricación.
     */
    List<Vehicle> getVehiclesByOrOrderByAnioFabricacion();


    /*
       Listar la patente de todos los vehículos que tengan más de cuatro ruedas y hayan sido fabricados en el corriente año.
    */

    List<Vehicle>

    /*
       Listar la matrícula, marca y modelo de todos los vehículos que hayan tenido un siniestro con pérdida mayor de 10000 pesos.
    */
    

    /*
       Listar la matrícula, marca y modelo de todos los vehículos que hayan tenido un siniestro con pérdida mayor de 10000 pesos y mostrar a cuánto ascendió la pérdida total de todos ellos.
    */


}
