package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.arcesi.gestionStock.entities.ArticleBean;
import com.arcesi.gestionStock.request.ArticleRequest;
import com.arcesi.gestionStock.response.ArticleResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ArticleDTO  extends AbstractEntityDTO{
	
	
	private static final long serialVersionUID = -3078991746551827739L;
	private Long code;
	private String codeArticle;
	private String designation;
    private BigDecimal prixUnitaireHt;
	private BigDecimal tauxTva;
    private BigDecimal prixTTC;
    private String photoArticle;
	private CategoryDTO categoryDTO;
	
	
	@Builder
	public ArticleDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeArticle, String designation,
			BigDecimal prixUnitaireHt, BigDecimal tauxTva, BigDecimal prixTTC, String photoArticle,
			CategoryDTO categoryDTO) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHt = prixUnitaireHt;
		this.tauxTva = tauxTva;
		this.prixTTC = prixTTC;
		this.photoArticle = photoArticle;
		this.categoryDTO = categoryDTO;
	}
	
	
	
	public static ArticleDTO fromEntity(ArticleBean articleBean) {
		if(null==articleBean) throw new IllegalArgumentException("L'article ne peut pas être null");
		return ArticleDTO.builder()
				.codeArticle(articleBean.getCodeArticle())
				.createdDate(articleBean.getCreatedDate())
				.lastUpdateDate(articleBean.getLastUpdateDate())
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
			   .createdDate(articleDTO.getCreatedDate())
			   .lastUpdateDate(articleDTO.getLastUpdateDate())
			   .designation(articleDTO.getDesignation())
			   .prixTTC(articleDTO.getPrixTTC())
			   .prixUnitaireHt(articleDTO.getPrixUnitaireHt())
			   .tauxTva(articleDTO.getTauxTva())
			   .categoryBean(CategoryDTO.toCategoryDTO(articleDTO.getCategoryDTO()))
			   .photoArticle(articleDTO.getPhotoArticle())
			   .build();
	}
	
	public static ArticleDTO ArticleRequetToArticleDTO(ArticleRequest articleRequest) {
		if(null==articleRequest) throw new IllegalArgumentException("L'article ne peut pas être null");
		return ArticleDTO.builder()
				.codeArticle(articleRequest.getCodeArticle())
				.createdDate(articleRequest.getCreatedDate())
				.lastUpdateDate(articleRequest.getLastUpdateDate())
				.designation(articleRequest.getDesignation())
				.code(articleRequest.getCode())
				.prixUnitaireHt(articleRequest.getPrixUnitaireHt())
				.prixTTC(articleRequest.getPrixTTC())
				.tauxTva(articleRequest.getTauxTva())
				.photoArticle(articleRequest.getPhotoArticle())
				.categoryDTO(CategoryDTO.fromCategoryRequest(articleRequest.getCategoryRequest()))
				.build();
	}
	
	public static ArticleResponse ArticleDTOToArticleResponse(ArticleDTO articleDTO) {
		if(null==articleDTO) throw new IllegalArgumentException("L'article ne peut pas être null");
		return ArticleResponse.builder()
				.codeArticle(articleDTO.getCodeArticle())
				.createdDate(articleDTO.getCreatedDate())
				.lastUpdateDate(articleDTO.getLastUpdateDate())
				.designation(articleDTO.getDesignation())
				.code(articleDTO.getCode())
				.prixUnitaireHt(articleDTO.getPrixUnitaireHt())
				.prixTTC(articleDTO.getPrixTTC())
				.tauxTva(articleDTO.getTauxTva())
				.photoArticle(articleDTO.getPhotoArticle())
				.categoryResponse(CategoryDTO.toCategoryResponse(articleDTO.getCategoryDTO()))
				.build();
	}
	

	
}
