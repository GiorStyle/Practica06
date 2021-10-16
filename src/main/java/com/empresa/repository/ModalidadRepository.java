package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Modalidad;

public interface ModalidadRepository extends JpaRepository<Modalidad, Integer>  {
	
	//Querys por nombre de Metodo
	
	
	public abstract List<Modalidad> findById(int idModalidad);
	
	public abstract List<Modalidad> findByNombreContaining(String nombre);

	
}
