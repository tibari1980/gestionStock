package com.arcesi.gestionStock.repositories;

import java.util.List;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.arcesi.gestionStock.entities.CategoryBean;

@SpringBootTest
public class CategoryRepositoryTest {

	@Autowired
	private CategoryRepository categoryRepository;
	/**
	 * constraint designation unique=true
	 * codeCategorie=unique true;
	 */
	@Test
	public void saveCategory() {
		CategoryBean bean=CategoryBean.builder()
				.designation("voitrue")
				.codeCategorie(UUID.randomUUID().toString().replace("-", ""))
				.idEntreprise(12)
				.articleBeans(null)
				.build();
		categoryRepository.save(bean);
	}
	@Test
	public void getAllCategories() {
		List<CategoryBean> listes=categoryRepository.findAll();
	   listes.forEach(c->{
		   System.out.println(c.getDesignation());
	   });
	}
	
}
