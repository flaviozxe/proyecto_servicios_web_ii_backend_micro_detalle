package com.micro.detalle.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.detalle.entity.DetalleOrdenVenta;


@Repository
public interface IDetalleOrdenVentaRepository extends JpaRepository<DetalleOrdenVenta, Integer>{
	
	List<DetalleOrdenVenta> findAllByNumOrdenVenta(int numOrdenVenta);
	
	
}
