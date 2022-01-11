package com.arcesi.gestionStock.response;

import java.time.LocalDate;
import java.util.Collection;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 * INGENIEUR DEVELOPPEMENT
 */
@Data
@Builder
public class UtilisateurResponse {

	private Long code;
 	private String codeUtilisateur;
 	private String nom;
 	private String prenom;
 	private String email;
 	private String password;
	private AdresseResponse adresseResponse;
 	private String telephone;
 	private String photo;
 	private LocalDate dateNaissance;
 	private Integer age;
	private EntrepriseResponse entrepriseResponse;
	private Collection<RoleResponse> roleResponses;
}
