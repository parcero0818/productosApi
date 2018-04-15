package co.com.tienda.productos.api.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.tienda.productos.api.model.ProductosModel;
import co.com.tienda.productos.api.repository.ProductosRepository;

@RestController
@RequestMapping("/tienda")
public class ProductosRest {
	@Autowired
	ProductosRepository productosRepository;

	public ProductosRest() {
		super();
	}

	@GetMapping(value = "/productos")
	public List<ProductosModel> getProductos() {
		return productosRepository.findAll();
	}

	@PostMapping(value = "/addProduct")
	public ProductosModel addProduct(@RequestBody ProductosModel producto) {
		return productosRepository.save(producto);
	}
	
}
