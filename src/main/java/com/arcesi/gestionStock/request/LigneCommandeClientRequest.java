package com.arcesi.gestionStock.request;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI ingénieur développement
 */
@Data
@Builder
public class LigneCommandeClientRequest {

	private Long code;
	private String codeLigneCommandClient;
	private ArticleRequest articleRequest;
	private CommandeClientRequest commandeClientRequest;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
}
