package com.nttdata.eclipse_spring_taller2_JJM.persistence;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Proyecto Spring taller 2.
 *
 * Clase de la entidad Producto.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Entity
@Table(name = "PRODUCT")
public class NttdataProduct implements Serializable {

	/**
	 * Version
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * Id del producto (PK).
	 */

	private Integer idProduct;

	/*
	 * Identificador (Unique)
	 */
	private String productIdentifier;

	/*
	 * Nombre del producto
	 */

	private String productName;

	/*
	 * Precio PVP del producto
	 */
	private Double productPvpPrice;

	/*
	 * Precio sin PVP del producto
	 */
	private Double price;

	/*
	 * Pedido al que pertenece
	 */
	private NttdataOrder order;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Integer idProduct) {
		this.idProduct = idProduct;
	}

	@Column(name = "PRODUCT_IDENTIFIER", nullable = false, unique = true)
	public String getProductIdentifier() {
		return productIdentifier;
	}

	public void setProductIdentifier(String productIdentifier) {
		this.productIdentifier = productIdentifier;
	}

	@Column(name = "NAME", nullable = false)
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PVP_PRICE", nullable = false)
	public Double getProductPvpPrice() {
		return productPvpPrice;
	}

	public void setProductPvpPrice(Double productPvpPrice) {
		this.productPvpPrice = productPvpPrice;
	}

	@Column(name = "PRICE", nullable = false)
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	public NttdataOrder getOrder() {
		return order;
	}

	public void setOrder(NttdataOrder order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "NttdataProduct [idProduct=" + idProduct + ", productIdentifier=" + productIdentifier + ", productName="
				+ productName + ", productPvpPrice=" + productPvpPrice + ", price=" + price + ", order=" + order + "]";
	}

}
