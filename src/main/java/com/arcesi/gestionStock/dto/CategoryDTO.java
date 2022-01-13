package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.util.Collection;

import com.arcesi.gestionStock.entities.CategoryBean;
import com.arcesi.gestionStock.request.CategoryRequest;
import com.arcesi.gestionStock.response.CategoryResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CategoryDTO extends AbstractEntityDTO {
 
	private static final long serialVersionUID = -4152009364709215742L;
	private Long code;
	private String codeCategorie;
	private String designation;
	private Collection<ArticleDTO> articleDTOs;
	
	@Builder
	public CategoryDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeCategorie, String designation,
			Collection<ArticleDTO> articleDTOs) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCategorie = codeCategorie;
		this.designation = designation;
		this.articleDTOs = articleDTOs;
	}
	
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

	public static CategoryDTO fromCategoryRequest(CategoryRequest categoryRequest) {
		if (categoryRequest == null) {
			throw new IllegalArgumentException("La categorie ne peut pas être null");
		}
		return CategoryDTO.builder()
				.code(categoryRequest.getCode())
				.codeCategorie(categoryRequest.getCodeCategorie())
				.designation(categoryRequest.getDesignation())
				.build();

	}
	
	public static CategoryResponse toCategoryResponse(CategoryDTO categoryDTO) {
		if (categoryDTO == null) {
			throw new IllegalArgumentException("La categorie ne peut pas être null");
		}
		return CategoryResponse.builder()
				.code(categoryDTO.getCode())
				.codeCategorie(categoryDTO.getCodeCategorie())
				.designation(categoryDTO.getDesignation())
				.build();

	}
	
}
