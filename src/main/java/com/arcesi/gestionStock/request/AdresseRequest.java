package com.arcesi.gestionStock.request;

import lombok.Data;
/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur développement
 */
@Data
public class AdresseRequest {

	
	private String firstAdresse;
 	private String secondeAdresse;
 	private String ville;
 	private String codePostale;
 	private String pays;
 	private String typeAdresse;
}
