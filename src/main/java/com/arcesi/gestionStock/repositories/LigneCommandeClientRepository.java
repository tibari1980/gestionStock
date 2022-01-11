package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.LigneCommandeClientBean;

@Repository
public interface LigneCommandeClientRepository extends JpaRepository<LigneCommandeClientBean, Long> {

}
