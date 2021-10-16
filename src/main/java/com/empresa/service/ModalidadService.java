package com.empresa.service;

import java.util.List;

import com.empresa.entity.Modalidad;

public interface ModalidadService {

	public Modalidad insertaActualizaModalidad(Modalidad obj);
	public List<Modalidad> listaModalidad();
	
	public List<Modalidad> listaModalidadPorId(int idModalidad);
	
	public List<Modalidad> listaModalidadPorNombre(String nombre);
	
	
}
