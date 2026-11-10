package com.gestiflow.miniapi.repository;

import com.gestiflow.miniapi.model.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class FakeDB {
	private final List<Product> products = new ArrayList<>(List.of(
		new Product(1L, "Auriculares inalámbricos", "Auriculares con cancelación activa de ruido", 79.99, 15),
		new Product(2L, "Alfombrilla gaming XL", "Superficie de tela antideslizante e impermeable", 14.95, 60),
		new Product(3L, "Webcam Full HD 1080p", "Cámara web con micrófono integrado para streaming", 39.90, 20)
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
