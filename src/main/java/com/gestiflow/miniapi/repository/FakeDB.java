package com.gestiflow.miniapi.repository;

import com.gestiflow.miniapi.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class FakeDB {
	private final List<Product> products = new ArrayList<>(List.of(
		new Product(1L, "Teclado mecánico", "Teclado con switches rojos", 59.90, 25),
		new Product(2L, "Ratón inalámbrico", "Ratón óptico de 1600 DPI", 19.95, 40),
		new Product(3L, "Monitor 24 pulgadas", "Panel IPS Full HD", 139.00, 8)
	));

	private long nextId = 4;

	public synchronized List<Product> findAll() {
		return List.copyOf(products);
	}

	public synchronized Optional<Product> findById(long id) {
		return products.stream().filter(product -> product.id() == id).findFirst();
	}

	public synchronized Product save(Product product) {
		Product saved = product.withId(nextId++);
		products.add(saved);
		return saved;
	}
}
