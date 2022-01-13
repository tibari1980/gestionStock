package com.arcesi.gestionStock.request;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur déveleppement
 */
@Getter
@Setter
public class LingeCommandeFournisseurRequest extends AbstractEntityRequest {

	 
	private static final long serialVersionUID = -8927528679332978263L;
	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleRequest articleRequest;
	private CommandeFournisseurRequest commandeFournisseurRequest;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	
	@Builder
	public LingeCommandeFournisseurRequest(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeLigneCommandeFournisseur, ArticleRequest articleRequest,
			CommandeFournisseurRequest commandeFournisseurRequest, BigDecimal quantite, BigDecimal prixUnitaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandeFournisseur = codeLigneCommandeFournisseur;
		this.articleRequest = articleRequest;
		this.commandeFournisseurRequest = commandeFournisseurRequest;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}

    
}
