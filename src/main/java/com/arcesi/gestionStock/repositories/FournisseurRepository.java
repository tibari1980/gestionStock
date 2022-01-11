package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.FournisseurBean;

@Repository
public interface FournisseurRepository extends JpaRepository<FournisseurBean, Long> {

}
