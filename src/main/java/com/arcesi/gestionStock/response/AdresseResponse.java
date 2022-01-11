package com.arcesi.gestionStock.response;

import com.arcesi.gestionStock.enums.TypeAdresseEnum;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 * ingénieur développement
 */
@Data
@Builder
public class AdresseResponse {

	private String firstAdresse;
 	private String secondeAdresse;
 	private String ville;
 	private String codePostale;
 	private String pays;
 	private TypeAdresseEnum typeAdresse;
}
