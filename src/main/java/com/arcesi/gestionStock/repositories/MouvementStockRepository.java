package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.MouvementStockBean;

@Repository
public interface MouvementStockRepository extends JpaRepository<MouvementStockBean, Long> {

}
