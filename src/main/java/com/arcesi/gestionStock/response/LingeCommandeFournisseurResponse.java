package com.arcesi.gestionStock.response;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur déveleppement
 */
@Data
@Builder
public class LingeCommandeFournisseurResponse {

	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleResponse articleResponse;
	private CommandeFournisseurResponse commandeFournisseurResponse;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
}
