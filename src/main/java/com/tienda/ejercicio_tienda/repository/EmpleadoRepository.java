package com.tienda.ejercicio_tienda.repository;

import com.tienda.ejercicio_tienda.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<Empleado,Integer> {
}
