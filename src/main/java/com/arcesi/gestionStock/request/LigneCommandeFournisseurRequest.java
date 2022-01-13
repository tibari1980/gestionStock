package com.arcesi.gestionStock.request;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur developpement 
 */
@Setter
@Getter
public class LigneCommandeFournisseurRequest extends AbstractEntityRequest{
 
	private static final long serialVersionUID = 7703955549286771258L;
	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleRequest articRequest;
	private CommandeFournisseurRequest commandeFournisseurRequest;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	@Builder
	public LigneCommandeFournisseurRequest(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeLigneCommandeFournisseur, ArticleRequest articRequest,
			CommandeFournisseurRequest commandeFournisseurRequest, BigDecimal quantite, BigDecimal prixUnitaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandeFournisseur = codeLigneCommandeFournisseur;
		this.articRequest = articRequest;
		this.commandeFournisseurRequest = commandeFournisseurRequest;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}
	
	
}
