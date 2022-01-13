package com.arcesi.gestionStock.request;

import java.time.Instant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author zeroua tibari
 * ingénieur developpement
 */
@Setter @Getter
public class VenteRequest extends AbstractEntityRequest {

	 
	private static final long serialVersionUID = 1304003315348296838L;
	private Long code;
 	private String codeVente;
 	private Instant dateVente;
 	private String commentaire;
	@Builder
 	public VenteRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeVente, Instant dateVente,
			String commentaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeVente = codeVente;
		this.dateVente = dateVente;
		this.commentaire = commentaire;
	}

 	
}
