package com.arcesi.gestionStock.request;

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
public class LigneCommandeFournisseurRequest {

	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleRequest articRequest;
	private CommandeFournisseurRequest commandeFournisseurRequest;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
}
