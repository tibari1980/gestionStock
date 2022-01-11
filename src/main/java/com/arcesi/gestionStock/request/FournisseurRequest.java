package com.arcesi.gestionStock.request;

import java.time.LocalDate;
import java.util.Collection;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author Tibari ZERoual ingénieur developpement
 */
@Data
@Builder
public class FournisseurRequest {

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

}
