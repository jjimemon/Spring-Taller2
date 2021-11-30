package com.nttdata.eclipse_spring_taller2_JJM.persistence;

import java.util.List;

/**
 * Proyecto Spring taller 2.
 *
 * Interfaz de la entidad Producto.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
public interface NttdataProductDaoI {

	/**
	 * Inserta un producto en BBDD.
	 * 
	 * @param newProduct
	 */
	public void insert(NttdataProduct newProduct);

	/**
	 * Actualiza un producto de BBDD.
	 * 
	 * @param product
	 */
	public void update(NttdataProduct product);

	/**
	 * Elimina un producto en BBDD.
	 * 
	 * @param product
	 */
	public void delete(NttdataProduct product);

	/**
	 * Localiza un producto por ID en BBDD.
	 * 
	 * @param IDproduct
	 * @return NttdataProduct
	 */
	public NttdataProduct searchById(final Integer IDproduct);

	/**
	 * Búsqueda de todos los productos en BBDD.
	 * 
	 * @return List<NttdataProduct>
	 */
	public List<NttdataProduct> searchAll();

}
