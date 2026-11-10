package com.gestiflow.miniapi.controller;

import com.gestiflow.miniapi.model.Product;
import com.gestiflow.miniapi.repository.FakeDB;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
public class CreateProductController {
	private final FakeDB db;

	public CreateProductController(FakeDB db) {
		this.db = db;
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Product create(@Valid @RequestBody Product product) {
		return db.save(product);
	}
}
