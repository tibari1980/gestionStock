package com.arcesi.gestionStock.response;

import java.math.BigDecimal;
import java.time.Instant;

import com.arcesi.gestionStock.enums.TypeMouvementStockEnum;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter	
public class MouvementStockResponse extends AbstractEntityResponse {

	private static final long serialVersionUID = -7894448321261008555L;
	private Long code;
 	private String codeMouvementStock;
 	private Instant dateMouvementStock;
 	private BigDecimal quantiteMS;
	private ArticleResponse articleResponse;
	private TypeMouvementStockEnum typeMVS;
	@Builder
	public MouvementStockResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeMouvementStock,
			Instant dateMouvementStock, BigDecimal quantiteMS, ArticleResponse articleResponse, TypeMouvementStockEnum typeMVS) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeMouvementStock = codeMouvementStock;
		this.dateMouvementStock = dateMouvementStock;
		this.quantiteMS = quantiteMS;
		this.articleResponse = articleResponse;
		this.typeMVS = typeMVS;
	}
	
}
