package com.nttdata.eclipse_spring_taller2_JJM.services;

import java.util.List;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataOrder;

public interface NttdataOrderManagementServiceI {

	/**
	 * Inserta un nuevo pedido.
	 * 
	 * @param newOrder
	 */
	public void insertNewOrder(final NttdataOrder newOrder);

	/**
	 * Actualiza un pedido.
	 * 
	 * @param updatedOrder
	 */
	public void updatedOrder(final NttdataOrder updatedOrder);

	/**
	 * Elimina un pedido existente.
	 * 
	 * @param deletedOrder
	 */
	public void deletedOrder(final NttdataOrder deletedOrder);

	/**
	 * Obtiene un pedido mediante su ID.
	 * 
	 * @param IDOrder
	 */
	public NttdataOrder searchById(final Integer IDOrder);

	/**
	 * Obtiene todos los pedidos existentes.
	 * 
	 * @return List<NttdataOrder>
	 */
	public List<NttdataOrder> searchAll();

}
