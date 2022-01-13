package com.arcesi.gestionStock.response;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author  ZEROUAL  Tibari
 *	ingénieur develpppement
 */
@Getter @Setter
public class ArticleResponse extends AbstractEntityResponse{

	 
	private static final long serialVersionUID = -7136406551914219522L;
	private Long code;
	private String codeArticle;
	private String designation;
    private BigDecimal prixUnitaireHt;
	private BigDecimal tauxTva;
    private BigDecimal prixTTC;
    private String photoArticle;
	private CategoryResponse categoryResponse;
	
	@Builder
	public ArticleResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeArticle,
			String designation, BigDecimal prixUnitaireHt, BigDecimal tauxTva, BigDecimal prixTTC, String photoArticle,
			CategoryResponse categoryResponse) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHt = prixUnitaireHt;
		this.tauxTva = tauxTva;
		this.prixTTC = prixTTC;
		this.photoArticle = photoArticle;
		this.categoryResponse = categoryResponse;
	}
	
	
}
