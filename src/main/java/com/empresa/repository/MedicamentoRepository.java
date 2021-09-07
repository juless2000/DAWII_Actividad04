package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Medicamento;

public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>{
	
	//BUSCAR POR STOCK
	public abstract List<Medicamento> findByStock(int stock);
	
	//BUSCAR POR NOMBRE
	public abstract List<Medicamento> findByNombre(String nombre);
}
