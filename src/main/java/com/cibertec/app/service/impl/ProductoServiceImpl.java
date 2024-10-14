package com.cibertec.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.app.entity.Producto;
import com.cibertec.app.repository.ProductoRepository;
import com.cibertec.app.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	ProductoRepository productoRepository;
	
	@Override
	public Producto saveProducto(Producto userEntity) {
		return productoRepository.save(userEntity);
	}
	
	@Override
	public List<Producto> getAllProducto() {
		return productoRepository.findAll();
	}
	
	@Override
	public Producto updateProducto(Producto userEntity) {
		return productoRepository.save(userEntity);
	}
	
	@Override
	public void deleteProductoById(Integer idProd) {
		productoRepository.deleteById(idProd);
	}
	
	@Override
	public Producto findProductoById(Integer idProd) {
		return productoRepository.findById(idProd).get();
	}

}