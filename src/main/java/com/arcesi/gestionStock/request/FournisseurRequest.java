package com.arcesi.gestionStock.request;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author Tibari ZERoual ingénieur developpement
 */
@Setter
@Getter
public class FournisseurRequest extends AbstractEntityRequest{

	 
	private static final long serialVersionUID = 2479457737752653682L;
	private Long code;
	private String codeFournisseur;
	private String nom;
	private String prenom;
	private String email;

	private AdresseRequest adresseRequest;
	private String telephone;
	private String photo;
	private LocalDate dateNaissance;

	private Integer age;
	private Collection<CommandeFournisseurRequest> commandeFournisseurRequests;
	
	@Builder
	public FournisseurRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeFournisseur,
			String nom, String prenom, String email, AdresseRequest adresseRequest, String telephone, String photo,
			LocalDate dateNaissance, Integer age, Collection<CommandeFournisseurRequest> commandeFournisseurRequests) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeFournisseur = codeFournisseur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresseRequest = adresseRequest;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.commandeFournisseurRequests = commandeFournisseurRequests;
	}

   
}
