package com.arcesi.gestionStock.request;

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
public class ClientRequest {

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
}
