package com.arcesi.gestionStock.dto;

import java.util.Collection;

import com.arcesi.gestionStock.entities.CategoryBean;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDTO {

	private Long code;
	private String codeCategorie;
	private String designation;
	@JsonIgnore
	private Collection<ArticleDTO> articleDTOs;

	public static CategoryDTO fromEntity(CategoryBean categoryBean) {
		if (categoryBean == null) {
			throw new IllegalArgumentException("La categorie ne peut pas être null");
		}
		return CategoryDTO.builder()
				.code(categoryBean.getCode())
				.codeCategorie(categoryBean.getCodeCategorie())
				.designation(categoryBean.getDesignation())
				.build();

	}
	
	public static CategoryBean toCategoryDTO(CategoryDTO categoryDTO) {
		if(categoryDTO==null) {
			throw new IllegalArgumentException("La category ne peut pas être null");
		}
		return CategoryBean.builder()
				.code(categoryDTO.getCode())
				.designation(categoryDTO.getDesignation())
				.codeCategorie(categoryDTO.getCodeCategorie())
				.build();
	}
}
