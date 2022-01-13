package com.arcesi.gestionStock.request;

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
public class EntrepriseRequest extends AbstractEntityRequest{
 
	private static final long serialVersionUID = -245728103888945581L;
	private Long code;
 	private String codeEntreprise;
 	private String raisonSocial;
 	private String siret;
 	private String numeroTVA;
 	private AdresseRequest adresseRequest;
 	private String email;
 	private String telephone;
	private Collection<UtilisateurRequest> utilisateurRequests;
	@Builder
	public EntrepriseRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeEntreprise,
			String raisonSocial, String siret, String numeroTVA, AdresseRequest adresseRequest, String email,
			String telephone, Collection<UtilisateurRequest> utilisateurRequests) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeEntreprise = codeEntreprise;
		this.raisonSocial = raisonSocial;
		this.siret = siret;
		this.numeroTVA = numeroTVA;
		this.adresseRequest = adresseRequest;
		this.email = email;
		this.telephone = telephone;
		this.utilisateurRequests = utilisateurRequests;
	}
 
	
}
