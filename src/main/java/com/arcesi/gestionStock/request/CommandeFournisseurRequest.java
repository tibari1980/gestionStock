package com.arcesi.gestionStock.request;

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
public class CommandeFournisseurRequest {

	private Long code;
	private String codeCommandeFounisseur;
	private Instant dateCommande;
	private FournisseurRequest fournisseurRequest;
	private Collection<LigneCommandeFournisseurRequest> ligneCommandeFournisseurRequests;
}
