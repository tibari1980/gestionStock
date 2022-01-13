package com.arcesi.gestionStock.request;

import java.math.BigDecimal;
import java.time.Instant;

import com.arcesi.gestionStock.enums.TypeMouvementStockEnum;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class MouvementStockRequest extends AbstractEntityRequest {
	private static final long serialVersionUID = -7894448321261008555L;
	private Long code;
 	private String codeMouvementStock;
 	private Instant dateMouvementStock;
 	private BigDecimal quantiteMS;
	private ArticleRequest articleRequest;
	private TypeMouvementStockEnum typeMVS;
	@Builder
	public MouvementStockRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeMouvementStock,
			Instant dateMouvementStock, BigDecimal quantiteMS, ArticleRequest articleRequest, TypeMouvementStockEnum typeMVS) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeMouvementStock = codeMouvementStock;
		this.dateMouvementStock = dateMouvementStock;
		this.quantiteMS = quantiteMS;
		this.articleRequest = articleRequest;
		this.typeMVS = typeMVS;
	}
   
}
