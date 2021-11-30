package com.nttdata.eclipse_spring_taller2_JJM.services;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProduct;
import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProductDaoI;

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
	private NttdataProductDaoI daoProduct;

	@Override
	@Transactional
	public void insertNewProduct(NttdataProduct newProduct) {

		// Verificación de nulidad e inexistencia.
		if (newProduct != null && newProduct.getIdProduct() == null) {

			// Insercción del nuevo producto.
			daoProduct.insert(newProduct);
		}

	}

	@Override
	@Transactional
	public void updatedProduct(NttdataProduct Product) {
		// Verificación de nulidad e inexistencia.
		if (Product != null && Product.getIdProduct() != null) {

			// Actulización del producto.
			daoProduct.update(Product);
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
	public NttdataProduct searchById(Integer IDProduct) {
		// Resultado.
		NttdataProduct product = null;

		// Verificación de nulidad.
		if (IDProduct != null) {

			// Obtención del producto por ID.
			product = daoProduct.searchById(IDProduct);
		}

		return product;
	}

	@Override
	@Transactional
	public List<NttdataProduct> searchAll() {
		// Resultado.
		List<NttdataProduct> productList = new ArrayList<NttdataProduct>();

		// Obtención del edificio.
		productList = daoProduct.searchAll();

		return productList;
	}

}
