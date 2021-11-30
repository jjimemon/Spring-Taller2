package com.nttdata.eclipse_spring_taller2_JJM.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Proyecto Spring taller 2.
 *
 * Clase de la entidad Pedido.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Entity
@Table(name = "ORDERS")
public class NttdataOrder implements Serializable {

	/**
	 * Version
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * ID del pedido [PK].
	 */
	private Integer idOrder;

	/*
	 * Identificador del pedido [Unique].
	 */
	private String orderIdentifier;

	/*
	 * Destinatario del pedido.
	 */
	private String addressee;

	/*
	 * Dirección del envio
	 */
	private String address;

	/*
	 * Ceuta, Melilla o Canaria.
	 */
	private Boolean identifier;

	/*
	 * Lista de productos del pedido
	 */
	private List<NttdataProduct> productList;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Integer idOrder) {
		this.idOrder = idOrder;
	}

	@Column(name = "ORDER_IDENTIFIER", nullable = false)
	public String getOrderIdentifier() {
		return orderIdentifier;
	}

	public void setOrderIdentifier(String orderIdentifier) {
		this.orderIdentifier = orderIdentifier;
	}

	@Column(name = "ADDRESSEE", nullable = false)
	public String getAddressee() {
		return addressee;
	}

	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}

	@Column(name = "ADDRESESS", nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "IDENTIFIER", nullable = false)
	public Boolean getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Boolean identifier) {
		this.identifier = identifier;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "order")
	public List<NttdataProduct> getProductList() {
		return productList;
	}

	public void setProductList(List<NttdataProduct> productList) {
		this.productList = productList;
	}

	@Override
	public String toString() {
		return "NttdataOrder [idOrder=" + idOrder + ", orderIdentifier=" + orderIdentifier + ", addressee=" + addressee
				+ ", address=" + address + ", indicador=" + identifier + "]";
	}

}
