package com.arcesi.gestionStock.response;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI
 * ingénieur développement
 */
@Setter
@Getter
public class EntrepriseResponse extends AbstractEntityResponse {
 
	 
	private static final long serialVersionUID = 1642559358929885107L;
	private Long code;
 	private String codeEntreprise;
 	private String raisonSocial;
 	private String siret;
 	private String numeroTVA;
 	private AdresseResponse adressResponse;
 	private String email;
 	private String telephone;
	private Collection<UtilisateurResponse> utilisateurResponses;
	@Builder
	public EntrepriseResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeEntreprise,
			String raisonSocial, String siret, String numeroTVA, AdresseResponse adressResponse, String email,
			String telephone, Collection<UtilisateurResponse> utilisateurResponses) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeEntreprise = codeEntreprise;
		this.raisonSocial = raisonSocial;
		this.siret = siret;
		this.numeroTVA = numeroTVA;
		this.adressResponse = adressResponse;
		this.email = email;
		this.telephone = telephone;
		this.utilisateurResponses = utilisateurResponses;
	}
	
	
}
