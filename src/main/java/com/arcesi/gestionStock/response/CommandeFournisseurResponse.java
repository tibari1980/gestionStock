package com.arcesi.gestionStock.response;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author tibari ingénieur develeppement
 */
@Data
@Builder
public class CommandeFournisseurResponse {

	private Long code;
	private String codeCommandeFounisseur;
	private Instant dateCommande;
	private FournisseurResponse fournisseurResponse;
	private Collection<LigneCommandeFournisseurReponse> ligneCommandeFournisseurReponses;
}
