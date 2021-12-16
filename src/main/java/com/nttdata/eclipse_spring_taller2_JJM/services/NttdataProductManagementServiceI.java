package com.nttdata.eclipse_spring_taller2_JJM.services;

import java.util.List;
import java.util.Optional;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProduct;

public interface NttdataProductManagementServiceI {
	/**
	 * Inserta un nuevo producto.
	 * 
	 * @param newProduct
	 */
	public void insertNewProduct(final NttdataProduct newProduct);

	/**
	 * Elimina un producto existente.
	 * 
	 * @param Product
	 */
	public void deletedProduct(final NttdataProduct Product);

	/**
	 * Obtiene un producto mediante su ID.
	 * 
	 * @param IDProduct
	 */
	public Optional<NttdataProduct> findById(final Integer IDProduct);

	/**
	 * Obtiene todos los productos existentes.
	 * 
	 * @return List<NttdataProduct>
	 */
	public List<NttdataProduct> findAll();
}
