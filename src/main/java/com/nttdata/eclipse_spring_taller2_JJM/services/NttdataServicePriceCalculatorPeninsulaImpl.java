package com.nttdata.eclipse_spring_taller2_JJM.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProduct;

@Component
@Qualifier("Peninsula")
public class NttdataServicePriceCalculatorPeninsulaImpl implements NttdataServicePriceCalculatorI {

	@Override
	public NttdataProduct calculatePrice(NttdataProduct product) {
		NttdataProduct productFinished = product;

		Double priceCalculated = productFinished.getPrice() + productFinished.getPrice() * 0.21;
		productFinished.setProductPvpPrice(priceCalculated);

		return productFinished;
	}
}
