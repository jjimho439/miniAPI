package com.gestiflow.miniapi.controller;

import com.gestiflow.miniapi.model.Product;
import com.gestiflow.miniapi.repository.FakeDB;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/productos")
public class StockTotalController {
	private final FakeDB db;

	public StockTotalController(FakeDB db) {
		this.db = db;
	}

	// Devuelve la suma del stock de todos los productos.
	@GetMapping("/stock-total")
	public Map<String, Integer> stockTotal() {
		int total = db.findAll().stream().mapToInt(Product::stock).sum();
		// hola
		return Map.of("stockTotal", total);
	}
}
