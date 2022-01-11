package com.arcesi.gestionStock.response;

import java.time.LocalDate;
import java.util.Collection;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur developpement
 */
@Data
@Builder
public class ClientResponse {

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
}
