package com.arcesi.gestionStock.request;

import java.util.Collection;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 * ingénieur développement
 */
@Data
@Builder
public class EntrepriseRequest {

	private Long code;
 	private String codeEntreprise;
 	private String raisonSocial;
 	private String siret;
 	private String numeroTVA;
 	private AdresseRequest adresseRequest;
 	private String email;
 	private String telephone;
	private Collection<UtilisateurRequest> utilisateurRequests;
}
