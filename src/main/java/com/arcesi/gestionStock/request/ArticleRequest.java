package com.arcesi.gestionStock.request;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author  ZEROUAL  Tibari
 *	ingénieur develpppement
 */
@Data
@Builder
public class ArticleRequest {

	private Long code;
	private String codeArticle;
	private String designation;
    private BigDecimal prixUnitaireHt;
	private BigDecimal tauxTva;
    private BigDecimal prixTTC;
    private String photoArticle;
	private CategoryRequest categoryRequest;
}
