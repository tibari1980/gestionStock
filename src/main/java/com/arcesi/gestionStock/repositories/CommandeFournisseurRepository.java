package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.CommandeFournisseurBean;

@Repository
public interface CommandeFournisseurRepository extends JpaRepository<CommandeFournisseurBean, Long> {

}
