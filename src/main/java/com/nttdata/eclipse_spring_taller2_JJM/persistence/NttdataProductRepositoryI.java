package com.nttdata.eclipse_spring_taller2_JJM.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Proyecto Spring taller 2.
 *
 * Interfaz de la entidad Producto.
 * 
 * @author Javier Jiménez Montesinos.
 *
 */
@Repository
public interface NttdataProductRepositoryI extends JpaRepository<NttdataProduct, Integer> {

}
