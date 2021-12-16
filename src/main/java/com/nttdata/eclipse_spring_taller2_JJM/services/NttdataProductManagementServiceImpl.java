package com.nttdata.eclipse_spring_taller2_JJM.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProduct;
import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProductRepositoryI;

/**
 * Proyecto Spring taller 2.
 *
 * Servicio de implementación de producto.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */

@Service
public class NttdataProductManagementServiceImpl implements NttdataProductManagementServiceI {

	@Autowired
	private NttdataProductRepositoryI daoProduct;

	@Override
	@Transactional
	public void insertNewProduct(NttdataProduct newProduct) {

		// Verificación de nulidad e inexistencia.
		if (newProduct != null && newProduct.getIdProduct() == null) {

			// Insercción del nuevo producto.
			daoProduct.save(newProduct);
		}

	}

	@Override
	@Transactional
	public void deletedProduct(NttdataProduct Product) {
		// Verificación de nulidad y existencia.
		if (Product != null && Product.getIdProduct() != null) {

			// Actualización del producto.
			daoProduct.delete(Product);
		}
	}

	@Override
	@Transactional
	public Optional<NttdataProduct> findById(Integer IDProduct) {
		// Resultado.
		Optional<NttdataProduct> product = null;

		// Verificación de nulidad.
		if (IDProduct != null) {

			// Obtención del producto por ID.
			product = daoProduct.findById(IDProduct);
		}

		return product;
	}

	@Override
	@Transactional
	public List<NttdataProduct> findAll() {
		// Resultado.
		List<NttdataProduct> productList = new ArrayList<NttdataProduct>();

		// Obtención del edificio.
		productList = daoProduct.findAll();

		return productList;
	}

}
