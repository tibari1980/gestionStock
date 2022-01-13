package com.arcesi.gestionStock.request;

import java.math.BigDecimal;
import java.time.Instant;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI
 * ingénieur developpement
 */
@Getter @Setter
public class LigneVenteRequest extends AbstractEntityRequest {
 
	private static final long serialVersionUID = 3861053263187437073L;
	private Long code;
 	private String codeLigneVente;
	private VenteRequest venteRequest;
	private BigDecimal quantite;
	
	@Builder
	public LigneVenteRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeLigneVente,
			VenteRequest venteRequest, BigDecimal quantite) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneVente = codeLigneVente;
		this.venteRequest = venteRequest;
		this.quantite = quantite;
	}
	
	
}
