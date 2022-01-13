package com.arcesi.gestionStock.response;

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
@Getter
@Setter
public class UtilisateurResponse  extends AbstractEntityResponse{

	 
	private static final long serialVersionUID = 430060284383069546L;
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
	private List<RoleResponse> roleResponses;
	@Builder
	public UtilisateurResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeUtilisateur,
			String nom, String prenom, String email, String password, AdresseResponse adresseResponse, String telephone,
			String photo, LocalDate dateNaissance, Integer age, EntrepriseResponse entrepriseResponse,
			List<RoleResponse> roleResponses) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeUtilisateur = codeUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.adresseResponse = adresseResponse;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.entrepriseResponse = entrepriseResponse;
		this.roleResponses = roleResponses;
	}

  
}
