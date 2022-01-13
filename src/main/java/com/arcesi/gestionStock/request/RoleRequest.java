package com.arcesi.gestionStock.request;

import java.time.Instant;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author zeroua tibari ingénieur developpement
 */
@Setter
@Getter
public class RoleRequest extends AbstractEntityRequest {

	private static final long serialVersionUID = -174230915498635167L;
	private Long code;
	private String codeRole;
	private String libelle;

	private List<UtilisateurRequest> utilisateurRequests;

	@Builder
	public RoleRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeRole, String libelle,
			List<UtilisateurRequest> utilisateurRequests) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeRole = codeRole;
		this.libelle = libelle;
		this.utilisateurRequests = utilisateurRequests;
	}

}
