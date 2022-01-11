package com.arcesi.gestionStock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arcesi.gestionStock.entities.CategoryBean;
@Repository
public interface CategoryRepository  extends JpaRepository<CategoryBean, Long>{

	
	CategoryBean findCategoryBeanByCodeCategorie(String codeUnique);
}
