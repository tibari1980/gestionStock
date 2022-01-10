package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.arcesi.gestionStock.entities.CategoryBean;

public interface CategoryRepository  extends JpaRepository<CategoryBean, Long>{

}
