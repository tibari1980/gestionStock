package com.arcesi.gestionStock.response;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author zeroua tibari
 * ingénieur developpement
 */
@Data
@Builder
public class RoleResponse {

	private Long code;
 	private String codeRole;
 	private String libelle;
	private UtilisateurResponse utilisateurResponse;
}
