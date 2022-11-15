package com.micro.detalle.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.detalle.entity.DetalleOrdenVenta;
import com.micro.detalle.repository.IDetalleOrdenVentaRepository;


@Service
public class DetalleOrdenVentaServicempl implements DetalleOrdenVentaService{
	@Autowired
	IDetalleOrdenVentaRepository repoDetalleOrdenVenta;
	
	@Override
	public List<DetalleOrdenVenta> listarPorNumeroDeOrdenVenta(int numOrdenVenta) {
		return repoDetalleOrdenVenta.findAllByNumOrdenVenta(numOrdenVenta);
	}

}
