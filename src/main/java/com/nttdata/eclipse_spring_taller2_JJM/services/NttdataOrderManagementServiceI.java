package com.nttdata.eclipse_spring_taller2_JJM.services;

import java.util.List;
import java.util.Optional;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataOrder;

public interface NttdataOrderManagementServiceI {

	/**
	 * Inserta un nuevo pedido.
	 * 
	 * @param newOrder
	 */
	public void insertNewOrder(final NttdataOrder newOrder);

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
	public Optional<NttdataOrder> findById(final Integer IDOrder);

	/**
	 * Obtiene todos los pedidos existentes.
	 * 
	 * @return List<NttdataOrder>
	 */
	public List<NttdataOrder> findAll();

}
