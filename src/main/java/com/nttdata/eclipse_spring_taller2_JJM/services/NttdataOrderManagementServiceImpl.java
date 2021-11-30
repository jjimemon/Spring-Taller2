package com.nttdata.eclipse_spring_taller2_JJM.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataOrder;
import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataOrderDaoI;

/**
 * Proyecto Spring taller 2.
 *
 * Servicio de implementación de pedido.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */

@Service
public class NttdataOrderManagementServiceImpl implements NttdataOrderManagementServiceI {

	@Autowired
	private NttdataOrderDaoI daoOrder;

	@Override
	@Transactional
	public void insertNewOrder(NttdataOrder newOrder) {
		// Verificación de nulidad e inexistencia.
		if (newOrder != null && newOrder.getIdOrder() == null) {

			// Insercción del nuevo cliente.
			daoOrder.insert(newOrder);
		}

	}

	@Override
	@Transactional
	public void updatedOrder(NttdataOrder updatedOrder) {
		// Verificación de nulidad y existencia.
		if (updatedOrder != null && updatedOrder.getIdOrder() != null) {

			// Actualización del pedido.
			daoOrder.update(updatedOrder);
		}

	}

	@Override
	@Transactional
	public void deletedOrder(NttdataOrder deletedOrder) {
		// Verificación de nulidad y existencia.
		if (deletedOrder != null && deletedOrder.getIdOrder() != null) {

			// Actualización del pedido.
			daoOrder.delete(deletedOrder);
		}

	}

	@Override
	@Transactional
	public NttdataOrder searchById(Integer IDOrder) {
		// Resultado.
		NttdataOrder edifice = null;

		// Verificación de nulidad.
		if (IDOrder != null) {

			// Obtención del edificio por ID.
			edifice = daoOrder.searchById(IDOrder);
		}

		return edifice;
	}

	@Override
	@Transactional
	public List<NttdataOrder> searchAll() {
		// Resultado.
		List<NttdataOrder> edificeList = new ArrayList<NttdataOrder>();

		// Obtención del edificio.
		edificeList = daoOrder.searchAll();

		return edificeList;
	}

}
