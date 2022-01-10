package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.ClientBean;
@Repository
public interface ClientRepository extends JpaRepository<ClientBean, Long> {

}
