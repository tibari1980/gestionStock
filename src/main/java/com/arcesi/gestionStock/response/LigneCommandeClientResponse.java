package com.arcesi.gestionStock.response;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI ingénieur développement
 * ingénieur développement
 */
@Getter @Setter
public class LigneCommandeClientResponse extends AbstractEntityResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1689489690577035440L;
	private Long code;
	private String codeLigneCommandClient;
	private ArticleResponse articleResponse;
	private CommandeClientResponse commandeClientResponse;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	
	@Builder
	public LigneCommandeClientResponse(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeLigneCommandClient, ArticleResponse articleResponse,
			CommandeClientResponse commandeClientResponse, BigDecimal quantite, BigDecimal prixUnitaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandClient = codeLigneCommandClient;
		this.articleResponse = articleResponse;
		this.commandeClientResponse = commandeClientResponse;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}
	
	
}
