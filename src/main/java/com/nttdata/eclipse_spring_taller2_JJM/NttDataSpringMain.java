package com.nttdata.eclipse_spring_taller2_JJM;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataOrder;
import com.nttdata.eclipse_spring_taller2_JJM.persistence.NttdataProduct;
import com.nttdata.eclipse_spring_taller2_JJM.services.NttdataOrderManagementServiceI;
import com.nttdata.eclipse_spring_taller2_JJM.services.NttdataProductManagementServiceI;
import com.nttdata.eclipse_spring_taller2_JJM.services.NttdataServicePriceCalculatorI;

/**
 * Proyecto Spring taller 2.
 *
 * Clase Lanzadora.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@SpringBootApplication
public class NttDataSpringMain implements CommandLineRunner {

	// Creación de servicios
	@Autowired
	private NttdataOrderManagementServiceI orderService;

	@Autowired
	private NttdataProductManagementServiceI productService;

	@Autowired
	@Qualifier("Peninsula")
	private NttdataServicePriceCalculatorI priceServicePEN;

	@Autowired
	@Qualifier("CMC")
	private NttdataServicePriceCalculatorI priceServiceCMC;

	/*
	 * Clase Main de la app
	 */
	public static void main(String[] args) {
		SpringApplication.run(NttDataSpringMain.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Creacion de un nuevo pedido.
		NttdataOrder order1 = new NttdataOrder();
		order1.setIdentifier(true);
		order1.setAddress("Alvarito el grande n22");
		order1.setAddressee("ALVARO RIVAS");
		order1.setOrderIdentifier("IDEN100");

		NttdataOrder order2 = new NttdataOrder();
		order2.setIdentifier(false);
		order2.setAddress("Alvarito el pequeño 22");
		order2.setAddressee("ALVARITO LOLO");
		order2.setOrderIdentifier("IDEN233");

		// Creacion de un nuevo producto.
		NttdataProduct product1 = new NttdataProduct();
		product1.setPrice(120.00);
		product1.setProductIdentifier("PRO:100");
		product1.setProductName("Zanahorias");
		product1.setProductPvpPrice(120.00);
		product1.setOrder(order1);

		NttdataProduct product2 = new NttdataProduct();
		product2.setPrice(100.00);
		product2.setProductIdentifier("230");
		product2.setProductName("Sandias");
		product2.setProductPvpPrice(100.00);
		product2.setOrder(order2);

		List<NttdataProduct> productList = new ArrayList<NttdataProduct>();
		productList.add(product1);
		productList.add(product2);

		for (NttdataProduct product : productList) {
			if (product.getOrder().getIdentifier() == true) {
				System.out.println(priceServicePEN.calculatePrice(product).getProductPvpPrice());
			} else {
				System.out.println(priceServiceCMC.calculatePrice(product).getProductPvpPrice());
			}
		}

		// Llamada a los servicios.
		orderService.insertNewOrder(order1);
		orderService.insertNewOrder(order2);
		productService.insertNewProduct(product1);
		productService.insertNewProduct(product2);

	}

}
