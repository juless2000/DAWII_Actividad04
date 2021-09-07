package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entity.Medicamento;

public interface MedicamentoService {
	
	public Medicamento insertaActualizaMedicamento(Medicamento obj);
	
	public List<Medicamento> listaMedicamento();
	
	public abstract Optional<Medicamento> buscaPorId(int idMedicamento);
	
	//BUSCAR POR STOCK
	public abstract List<Medicamento> buscarPorStock(int stock);
	
	//BUSCAR POR NOMBRE
	public abstract List<Medicamento> buscarPorNombre(String nombre);
}
