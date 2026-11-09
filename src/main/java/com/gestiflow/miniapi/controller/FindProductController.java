package com.gestiflow.miniapi.controller;

import com.gestiflow.miniapi.repository.FakeDB;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/productos")
public class FindProductController {
	private final FakeDB db;

	public FindProductController(FakeDB db) {
		this.db = db;
	}

	@GetMapping("/{id}")
	public Object find() {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "No implementado");
	}
}
