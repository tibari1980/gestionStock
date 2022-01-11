package com.arcesi.gestionStock.response;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI ingénieur développement
 */
@Data
@Builder
public class LigneCommandeClientResponse {

	private Long code;
	private String codeLigneCommandClient;
	private ArticleResponse articleResponse;
	private CommandeClientResponse commandeClientResponse;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
}
