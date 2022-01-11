package com.arcesi.gestionStock.request;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author zeroua tibari
 * ingénieur developpement
 */
@Data
@Builder
public class RoleRequest {

	private Long code;
 	private String codeRole;
 	private String libelle;
	private UtilisateurRequest utilisateurRequest;
}
