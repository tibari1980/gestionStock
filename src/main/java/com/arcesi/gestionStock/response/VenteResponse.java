package com.arcesi.gestionStock.response;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author zeroua tibari
 * ingénieur developpement
 */
@Data @Builder
public class VenteResponse {

	private Long code;
 	private String codeVente;
 	private Instant dateVente;
 	private String commentaire;
}
