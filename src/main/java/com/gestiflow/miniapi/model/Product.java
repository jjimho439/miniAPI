package com.gestiflow.miniapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public record Product(
	Long id,
	@NotBlank String nombre,
	String descripcion,
	@NotNull @PositiveOrZero Double precio,
	@NotNull @PositiveOrZero Integer stock
) {
	public Product withId(Long newId) {
		return new Product(newId, nombre, descripcion, precio, stock);
	}
}
