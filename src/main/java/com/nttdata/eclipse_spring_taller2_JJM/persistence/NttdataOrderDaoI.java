package com.nttdata.eclipse_spring_taller2_JJM.persistence;

import java.util.List;

/**
 * Proyecto Spring taller 1.
 *
 * Interfaz de la entidad Edifice.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
public interface NttdataOrderDaoI {
	/**
	 * Inserta un pedido en BBDD.
	 * 
	 * @param newOrder
	 */
	public void insert(NttdataOrder newOrder);

	/**
	 * Actualiza un pedido de BBDD.
	 * 
	 * @param Order
	 */
	public void update(NttdataOrder Order);

	/**
	 * Elimina un pedido en BBDD.
	 * 
	 * @param Order
	 */
	public void delete(NttdataOrder Order);

	/**
	 * Localiza un edificio por ID en BBDD.
	 * 
	 * @param IDorder
	 * @return NttdataOrder
	 */
	public NttdataOrder searchById(final Integer IDorder);

	/**
	 * Búsqueda de todos los edificios en BBDD.
	 * 
	 * @return List<NttdataOrder>
	 */
	public List<NttdataOrder> searchAll();
}
