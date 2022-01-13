package com.arcesi.gestionStock.response;

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
public class VenteResponse  extends AbstractEntityResponse{

	 
	private static final long serialVersionUID = -3838055455361041805L;
	private Long code;
 	private String codeVente;
 	private Instant dateVente;
 	private String commentaire;
	@Builder
 	public VenteResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeVente, Instant dateVente,
			String commentaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeVente = codeVente;
		this.dateVente = dateVente;
		this.commentaire = commentaire;
	}
 	
}
