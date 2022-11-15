package com.micro.detalle.service;


import java.util.List;

import com.micro.detalle.entity.DetalleOrdenVenta;


public interface DetalleOrdenVentaService {
	
	List<DetalleOrdenVenta> listarPorNumeroDeOrdenVenta(int numOrdenVenta);


}
