package com.arcesi.gestionStock.response;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author zeroua tibari
 * ingénieur developpement
 */
@Getter
@Setter
public class RoleResponse extends AbstractEntityResponse {

	 
	private static final long serialVersionUID = 1489457505689943159L;
	private Long code;
 	private String codeRole;
 	private String libelle;
	
 	private List<UtilisateurResponse> utilisateurResponses;

 	@Builder
	public RoleResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeRole, String libelle,
			List<UtilisateurResponse> utilisateurResponses) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeRole = codeRole;
		this.libelle = libelle;
		this.utilisateurResponses = utilisateurResponses;
	}
	 
	
}
