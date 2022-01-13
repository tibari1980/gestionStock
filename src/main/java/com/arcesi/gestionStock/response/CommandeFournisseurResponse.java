package com.arcesi.gestionStock.response;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author tibari ingénieur develeppement
 */

@Getter
@Setter
public class CommandeFournisseurResponse extends AbstractEntityResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9146357879872279937L;
	private Long code;
	private String codeCommandeFounisseur;
	private Instant dateCommande;
	private FournisseurResponse fournisseurResponse;
	private Collection<LigneCommandeFournisseurReponse> ligneCommandeFournisseurReponses;
	
	@Builder
	public CommandeFournisseurResponse(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeCommandeFounisseur, Instant dateCommande, FournisseurResponse fournisseurResponse,
			Collection<LigneCommandeFournisseurReponse> ligneCommandeFournisseurReponses) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCommandeFounisseur = codeCommandeFounisseur;
		this.dateCommande = dateCommande;
		this.fournisseurResponse = fournisseurResponse;
		this.ligneCommandeFournisseurReponses = ligneCommandeFournisseurReponses;
	}

   
	
}
