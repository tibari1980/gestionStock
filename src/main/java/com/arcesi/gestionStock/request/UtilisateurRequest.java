package com.arcesi.gestionStock.request;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI
 * INGENIEUR DEVELOPPEMENT
 */
@Setter
@Getter
public class UtilisateurRequest  extends AbstractEntityRequest{

	 
	private static final long serialVersionUID = 4601692797156026005L;
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
	private List<RoleRequest> roleRequests;
	@Builder
	public UtilisateurRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeUtilisateur,
			String nom, String prenom, String email, String password, AdresseRequest adresseRequest, String telephone,
			String photo, LocalDate dateNaissance, Integer age, EntrepriseRequest entrepriseRequest,
			List<RoleRequest> roleRequests) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeUtilisateur = codeUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.adresseRequest = adresseRequest;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.entrepriseRequest = entrepriseRequest;
		this.roleRequests = roleRequests;
	}


	
}
