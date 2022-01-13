package com.arcesi.gestionStock.request;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI ingénieur développement
 */
@Setter
@Getter
public class LigneCommandeClientRequest extends AbstractEntityRequest {

	 
	private static final long serialVersionUID = 3366459277851360072L;
	private Long code;
	private String codeLigneCommandClient;
	private ArticleRequest articleRequest;
	private CommandeClientRequest commandeClientRequest;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	@Builder
	public LigneCommandeClientRequest(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeLigneCommandClient, ArticleRequest articleRequest, CommandeClientRequest commandeClientRequest,
			BigDecimal quantite, BigDecimal prixUnitaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandClient = codeLigneCommandClient;
		this.articleRequest = articleRequest;
		this.commandeClientRequest = commandeClientRequest;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}
	
	
}
