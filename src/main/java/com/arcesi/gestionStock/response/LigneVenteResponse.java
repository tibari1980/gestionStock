package com.arcesi.gestionStock.response;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 * ingénieur developpement
 */
@Data @Builder
public class LigneVenteResponse {

	private Long code;
 	private String codeLigneVente;
	private VenteResponse venteResponse;
	private BigDecimal quantite;
}
