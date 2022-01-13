package com.arcesi.gestionStock.response;

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
@Setter
@Getter
public class LingeCommandeFournisseurResponse extends AbstractEntityResponse{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6582792965936971747L;
	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleResponse articleResponse;
	private CommandeFournisseurResponse commandeFournisseurResponse;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	@Builder
	public LingeCommandeFournisseurResponse(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeLigneCommandeFournisseur, ArticleResponse articleResponse,
			CommandeFournisseurResponse commandeFournisseurResponse, BigDecimal quantite, BigDecimal prixUnitaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandeFournisseur = codeLigneCommandeFournisseur;
		this.articleResponse = articleResponse;
		this.commandeFournisseurResponse = commandeFournisseurResponse;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}

    
}
