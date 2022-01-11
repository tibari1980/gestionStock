package com.arcesi.gestionStock.request;

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
public class LingeCommandeFournisseurRequest {

	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleRequest articleRequest;
	private CommandeFournisseurRequest commandeFournisseurRequest;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
}
