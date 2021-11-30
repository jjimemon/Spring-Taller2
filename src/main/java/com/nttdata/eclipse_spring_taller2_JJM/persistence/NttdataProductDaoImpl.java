package com.nttdata.eclipse_spring_taller2_JJM.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Proyecto Spring taller 2.
 *
 * Servicio de implementación de producto.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */

@Service
public class NttdataProductDaoImpl implements NttdataProductDaoI {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public void insert(NttdataProduct newProduct) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.save(newProduct);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public void update(NttdataProduct product) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Insercción.
		session.saveOrUpdate(product);

		// Cierre de sesión.
		session.close();

	}

	@Override
	@Transactional
	public void delete(NttdataProduct product) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);
		// Mergeo de estados.
		product = entityManager.merge(product);
		// Insercción.
		session.delete(product);

		// Cierre de sesión.
		session.close();
	}

	@Override
	@Transactional
	public NttdataProduct searchById(Integer IDproduct) {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda por PK.
		NttdataProduct result = session.get(NttdataProduct.class, IDproduct);

		// Cierre de sesión.
		session.close();

		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<NttdataProduct> searchAll() {
		// Obtención de sesión.
		Session session = entityManager.unwrap(Session.class);

		// Búsqueda de todos los registros.
		List<NttdataProduct> list = session.createQuery("FROM NttdataProduct").list();

		// Cierre de sesión.
		session.close();

		return list;
	}

}

