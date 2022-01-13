package com.arcesi.gestionStock.request;

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
@Setter
@Getter
public class ClientRequest extends AbstractEntityRequest {
 
	private static final long serialVersionUID = -4498923516038977249L;
	private Long code;
	private String codeClient;
	private String nom;
	private String prenom;
	private String email;
	private AdresseRequest adresseRequest;
	private String telephone;	 
	private String photo;
	 
	private LocalDate dateNaissance;
	 
	 
	private Integer age;
	 
	private Collection<CommandeClientRequest> commandeClientRequests;

	@Builder
	public ClientRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeClient, String nom,
			String prenom, String email, AdresseRequest adresseRequest, String telephone, String photo,
			LocalDate dateNaissance, Integer age, Collection<CommandeClientRequest> commandeClientRequests) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeClient = codeClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresseRequest = adresseRequest;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.commandeClientRequests = commandeClientRequests;
	}
	
}
