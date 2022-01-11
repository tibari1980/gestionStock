package com.arcesi.gestionStock.request;

import java.time.Instant;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author zeroua tibari
 * ingénieur developpement
 */
@Data @Builder
public class VenteRequest {

	private Long code;
 	private String codeVente;
 	private Instant dateVente;
 	private String commentaire;
}
