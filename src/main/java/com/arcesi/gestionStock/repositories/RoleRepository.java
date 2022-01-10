package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.RoleBean;

@Repository
public interface RoleRepository  extends JpaRepository<RoleBean, Long>{

}
