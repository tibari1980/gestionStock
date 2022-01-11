package com.arcesi.gestionStock.request;

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
public class UtilisateurRequest {

	private Long code;
 	private String codeUtilisateur;
 	private String nom;
 	private String prenom;
 	private String email;
 	private String password;
	private AdresseRequest adresseRequest;
 	private String telephone;
 	private String photo;
 	private LocalDate dateNaissance;
 	private Integer age;
	private EntrepriseRequest entrepriseRequest;
	private Collection<RoleRequest> roleRequests;
}
