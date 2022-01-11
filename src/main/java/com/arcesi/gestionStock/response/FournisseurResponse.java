package com.arcesi.gestionStock.response;

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
public class FournisseurResponse {

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

}
