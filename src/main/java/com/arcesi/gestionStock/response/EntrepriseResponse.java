package com.arcesi.gestionStock.response;

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
public class EntrepriseResponse {

	private Long code;
 	private String codeEntreprise;
 	private String raisonSocial;
 	private String siret;
 	private String numeroTVA;
 	private AdresseResponse adressResponse;
 	private String email;
 	private String telephone;
	private Collection<UtilisateurResponse> utilisateurResponses;
}
