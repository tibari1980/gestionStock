package com.arcesi.gestionStock.response;

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
public class FournisseurResponse extends AbstractEntityResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1000253350935576350L;
	private Long code;
	private String codeFournisseur;
	private String nom;
	private String prenom;
	private String email;

	private AdresseResponse adresseResponse;
	private String telephone;
	private String photo;
	private LocalDate dateNaissance;

	private Integer age;
	private Collection<CommandeFournisseurResponse> commandeFournisseurResponses;
	
	@Builder
	public FournisseurResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeFournisseur,
			String nom, String prenom, String email, AdresseResponse adresseResponse, String telephone, String photo,
			LocalDate dateNaissance, Integer age,
			Collection<CommandeFournisseurResponse> commandeFournisseurResponses) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeFournisseur = codeFournisseur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresseResponse = adresseResponse;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.commandeFournisseurResponses = commandeFournisseurResponses;
	}
	
	

}
