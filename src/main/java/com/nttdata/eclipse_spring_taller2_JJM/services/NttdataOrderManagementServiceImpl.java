package com.nttdata.eclipse_spring_taller2_JJM.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataOrder;
import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataOrderRepositoryI;

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
	private NttdataOrderRepositoryI daoOrder;

	@Override
	@Transactional
	public void insertNewOrder(NttdataOrder newOrder) {
		// Verificación de nulidad e inexistencia.
		if (newOrder != null && newOrder.getIdOrder() == null) {

			// Insercción del nuevo cliente.
			daoOrder.save(newOrder);
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
	public Optional<NttdataOrder> findById(Integer IDOrder) {
		// Resultado.
		Optional<NttdataOrder> edifice = null;

		// Verificación de nulidad.
		if (IDOrder != null) {

			// Obtención del edificio por ID.
			edifice = daoOrder.findById(IDOrder);
		}

		return edifice;
	}

	@Override
	@Transactional
	public List<NttdataOrder> findAll() {
		// Resultado.
		List<NttdataOrder> edificeList = new ArrayList<NttdataOrder>();

		// Obtención del edificio.
		edificeList = daoOrder.findAll();

		return edificeList;
	}

}
