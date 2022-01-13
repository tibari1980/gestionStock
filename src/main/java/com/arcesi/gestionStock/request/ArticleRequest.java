package com.arcesi.gestionStock.request;

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
public class ArticleRequest  extends AbstractEntityRequest{

	 
	private static final long serialVersionUID = -3838646832743716818L;
	private Long code;
	private String codeArticle;
	private String designation;
    private BigDecimal prixUnitaireHt;
	private BigDecimal tauxTva;
    private BigDecimal prixTTC;
    private String photoArticle;
	private CategoryRequest categoryRequest;
	
	@Builder
	public ArticleRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeArticle,
			String designation, BigDecimal prixUnitaireHt, BigDecimal tauxTva, BigDecimal prixTTC, String photoArticle,
			CategoryRequest categoryRequest) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHt = prixUnitaireHt;
		this.tauxTva = tauxTva;
		this.prixTTC = prixTTC;
		this.photoArticle = photoArticle;
		this.categoryRequest = categoryRequest;
	}


	
}
