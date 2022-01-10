package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.VenteBean;

@Repository
public interface VenteRepository extends JpaRepository<VenteBean, Long> {

}
