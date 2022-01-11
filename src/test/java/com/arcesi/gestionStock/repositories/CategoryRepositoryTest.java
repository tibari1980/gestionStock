package com.arcesi.gestionStock.repositories;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityNotFoundException;

import org.assertj.core.api.Assertions;
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
				.designation("IPHONE")
				.codeCategorie(UUID.randomUUID().toString().replace("-", ""))
				.idEntreprise(12)
				.articleBeans(null)
				.createdDate(Instant.now())
				.lastUpdateDate(Instant.now())
				.build();
		categoryRepository.save(bean);
	}
	@Test
	public void getAllCategories() {
		List<CategoryBean> listes=categoryRepository.findAll();
	   listes.forEach(c->{
		   System.out.println(c.toString());
	   });
	}
	
	@Test
	public void findOneByCodeTest() {
		CategoryBean bean=categoryRepository.findCategoryBeanByCodeCategorie("d09aecade7a246b0ba05f48c647370c4");
	    if(bean==null) {
	    	throw new IllegalArgumentException("Category not found");
	    }
	    System.out.println(bean.toString());
	}
	
	@Test
	public void findOneByIdTest() {
		CategoryBean bean=categoryRepository.findById(1L).get();
		if(bean==null) {
	    	throw new IllegalArgumentException("Category not found");
	    }
		System.out.println(bean.toString());
	}
	
	@Test
	public void deleteCategorieByCodeUniqueTest() {
		//prend un code de la base pour tester
		final String code="0b2e87e394b84f6bbabd341814ff4a2a";
		CategoryBean bean=categoryRepository.findCategoryBeanByCodeCategorie(code);
		if(bean==null) {
			throw new EntityNotFoundException("Category not found");
		}
		categoryRepository.delete(bean);
		//Assertions.fail("Category not found ");
		Assertions.notIn(bean);
		
	}
	
	@Test
	public void updateCategoryTest() {
		String code="d09aecade7a246b0ba05f48c647370c4";
		CategoryBean bean=categoryRepository.findCategoryBeanByCodeCategorie(code);
		if(bean==null) {
			throw new EntityNotFoundException("Category not found");
		}
		CategoryBean cat=new CategoryBean();
		cat.setCode(bean.getCode());
		cat.setCodeCategorie(UUID.randomUUID().toString().replace("-", ""));
		cat.setDesignation("VETEMENT");
		cat.setCreatedDate(bean.getCreatedDate());
		cat.setLastUpdateDate(Instant.now());
		
		//persist
		categoryRepository.saveAndFlush(cat);
		//Récuper category by code
		CategoryBean catUpdated=categoryRepository.findCategoryBeanByCodeCategorie(cat.getCodeCategorie());
		System.out.println(catUpdated.toString());
	}
}
