package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;

import com.arcesi.gestionStock.entities.ArticleBean;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ArticleDTO {
	
	
	private Long code;
	private String codeArticle;
	
	private String designation;
	
    private BigDecimal prixUnitaireHt;
	
	private BigDecimal tauxTva;
	
    private BigDecimal prixTTC;
	
    private String photoArticle;
	
	private CategoryDTO categoryDTO;
	
	public static ArticleDTO fromEntity(ArticleBean articleBean) {
		if(null==articleBean) throw new IllegalArgumentException("L'article ne peut pas être null");
		return ArticleDTO.builder()
				.codeArticle(articleBean.getCodeArticle())
				.designation(articleBean.getDesignation())
				.code(articleBean.getCode())
				.prixUnitaireHt(articleBean.getPrixUnitaireHt())
				.prixTTC(articleBean.getPrixTTC())
				.tauxTva(articleBean.getTauxTva())
				.photoArticle(articleBean.getPhotoArticle())
				.categoryDTO(CategoryDTO.fromEntity(articleBean.getCategoryBean()))
				.build();
	}

	public static ArticleBean toArticleDTO(ArticleDTO articleDTO) {
		if(articleDTO==null) throw new IllegalArgumentException("L'article DTO ne peut pas être null");
	   return ArticleBean.builder()
			   .code(articleDTO.getCode())
			   .codeArticle(articleDTO.getCodeArticle())
			   .designation(articleDTO.getDesignation())
			   .prixTTC(articleDTO.getPrixTTC())
			   .prixUnitaireHt(articleDTO.getPrixUnitaireHt())
			   .tauxTva(articleDTO.getTauxTva())
			   .categoryBean(CategoryDTO.toCategoryDTO(articleDTO.getCategoryDTO()))
			   .photoArticle(articleDTO.getPhotoArticle())
			   .build();
	}
}
