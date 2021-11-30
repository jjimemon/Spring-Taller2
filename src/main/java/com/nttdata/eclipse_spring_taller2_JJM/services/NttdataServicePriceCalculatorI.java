package com.nttdata.eclipse_spring_taller2_JJM.services;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProduct;

public interface NttdataServicePriceCalculatorI {

	/*
	 * Método que calcula el precio del producto
	 */
	public NttdataProduct calculatePrice(NttdataProduct product);
}
