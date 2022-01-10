package com.arcesi.gestionStock.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrepriseRepository  extends JpaRepository<EntrepriseBean,Long>{

}
