package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arcesi.gestionStock.entities.LigneCommandeFournisseurBean;

public interface LigneCommandeFournisseurRepository extends JpaRepository<LigneCommandeFournisseurBean, Long> {

}
