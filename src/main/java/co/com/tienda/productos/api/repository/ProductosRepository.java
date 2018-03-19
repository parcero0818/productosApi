package co.com.tienda.productos.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.com.tienda.productos.api.model.ProductosModel;

public interface ProductosRepository extends MongoRepository<ProductosModel, String>{

}
