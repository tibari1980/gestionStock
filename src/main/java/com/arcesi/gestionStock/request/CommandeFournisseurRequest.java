package com.arcesi.gestionStock.request;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author tibari ingénieur develeppement
 */
@Setter
@Getter
public class CommandeFournisseurRequest  extends AbstractEntityRequest{

	 
	private static final long serialVersionUID = -521801176823998502L;
	private Long code;
	private String codeCommandeFounisseur;
	private Instant dateCommande;
	private FournisseurRequest fournisseurRequest;
	private Collection<LigneCommandeFournisseurRequest> ligneCommandeFournisseurRequests;
	
	@Builder
	public CommandeFournisseurRequest(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeCommandeFounisseur, Instant dateCommande, FournisseurRequest fournisseurRequest,
			Collection<LigneCommandeFournisseurRequest> ligneCommandeFournisseurRequests) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCommandeFounisseur = codeCommandeFounisseur;
		this.dateCommande = dateCommande;
		this.fournisseurRequest = fournisseurRequest;
		this.ligneCommandeFournisseurRequests = ligneCommandeFournisseurRequests;
	}

    
}
