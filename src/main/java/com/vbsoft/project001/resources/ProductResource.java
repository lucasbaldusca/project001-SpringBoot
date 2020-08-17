	package com.vbsoft.project001.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vbsoft.project001.entities.Product;
import com.vbsoft.project001.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired // realiza a injeção de dependencia automatica
	private ProductService service; // dependencia pra o service

	@GetMapping // Mostra que responde uma requisição do tipo get do http
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);

	}

}