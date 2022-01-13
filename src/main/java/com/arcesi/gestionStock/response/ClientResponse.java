package com.arcesi.gestionStock.response;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur developpement
 */
@Getter @Setter
public class ClientResponse extends AbstractEntityResponse {

 
	private static final long serialVersionUID = 3993494072428679786L;
	private Long code;
	private String codeClient;
	private String nom;
	private String prenom;
	private String email;
	private AdresseResponse adressResponse;
	private String telephone;	 
	private String photo;
	private LocalDate dateNaissance;
	private Integer age;
	private Collection<CommandeClientResponse> commandeClientResponses;
	
	@Builder
	public ClientResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeClient, String nom,
			String prenom, String email, AdresseResponse adressResponse, String telephone, String photo,
			LocalDate dateNaissance, Integer age, Collection<CommandeClientResponse> commandeClientResponses) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeClient = codeClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adressResponse = adressResponse;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.commandeClientResponses = commandeClientResponses;
	}

   
}
