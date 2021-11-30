package com.nttdata.eclipse_spring_taller2_JJM.persistence;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Proyecto Spring taller 2.
 *
 * Implementación de la entidad Pedidos.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Repository
public class NttdataOrderDaoImpl implements NttdataOrderDaoI {

	/** Manejador de entidades */
	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void insert(NttdataOrder newOrder) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.save(newOrder);

		// Cierre de sesión.
		session.close();
	}

	@Override
	@Transactional
	public void update(NttdataOrder Order) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.saveOrUpdate(Order);

		// Cierre de sesión.
		session.close();
	}

	@Override
	@Transactional
	public void delete(NttdataOrder Order) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);
		// Mergeo de estados.
		Order = entityManager.merge(Order);
		// Insercción.
		session.delete(Order);

		// Cierre de sesión.
		session.close();
	}

	@Override
	@Transactional
	public NttdataOrder searchById(Integer IDorder) {

		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda por PK.
		NttdataOrder result = session.get(NttdataOrder.class, IDorder);

		// Cierre de sesión.
		session.close();

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<NttdataOrder> searchAll() {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda de todos los registros.
		List<NttdataOrder> list = session.createQuery("FROM NttdataOrder").list();

		// Cierre de sesión.
		session.close();

		return list;
	}

}
