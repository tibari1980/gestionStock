package com.arcesi.gestionStock.response;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur developpement 
 */
@Data
@Builder
public class LigneCommandeFournisseurReponse {

	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleResponse articleResponse;
	private CommandeFournisseurResponse commandeFournisseurResponse;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
}
