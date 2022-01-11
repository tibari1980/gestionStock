package com.arcesi.gestionStock.request;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 * ingénieur developpement
 */
@Data @Builder
public class LigneVenteRequest {

	private Long code;
 	private String codeLigneVente;
	private VenteRequest venteRequest;
	private BigDecimal quantite;
}
