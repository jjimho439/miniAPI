package com.gestiflow.miniapi.controller;

import com.gestiflow.miniapi.repository.FakeDB;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/productos")
public class CreateProductController {
	private final FakeDB db;

	public CreateProductController(FakeDB db) {
		this.db = db;
	}

	@PostMapping
	public Object create() {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED, "No implementado");
	}
}
