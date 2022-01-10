package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.CommandeClientBean;

@Repository
public interface CommandeClientRepository extends JpaRepository<CommandeClientBean,Long>{

}
