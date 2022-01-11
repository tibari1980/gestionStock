package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.EntrepriseBean;

@Repository
public interface EntrepriseRepository  extends JpaRepository<EntrepriseBean,Long>{

}
