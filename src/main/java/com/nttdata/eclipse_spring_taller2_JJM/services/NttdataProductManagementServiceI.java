package com.nttdata.eclipse_spring_taller2_JJM.services;

import java.util.List;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProduct;

public interface NttdataProductManagementServiceI {
	/**
	 * Inserta un nuevo producto.
	 * 
	 * @param newProduct
	 */
	public void insertNewProduct(final NttdataProduct newProduct);

	/**
	 * Actualiza un producto.
	 * 
	 * @param Product
	 */
	public void updatedProduct(final NttdataProduct Product);

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
	public NttdataProduct searchById(final Integer IDProduct);

	/**
	 * Obtiene todos los productos existentes.
	 * 
	 * @return List<NttdataProduct>
	 */
	public List<NttdataProduct> searchAll();
}
