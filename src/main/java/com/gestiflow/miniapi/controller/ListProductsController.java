package com.gestiflow.miniapi.controller;

import com.gestiflow.miniapi.model.Product;
import com.gestiflow.miniapi.repository.FakeDB;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
public class ListProductsController {
	private final FakeDB db;

	public ListProductsController(FakeDB db) {
		this.db = db;
	}

	@GetMapping
	public List<Product> list() {
		return db.findAll();
	}
}
