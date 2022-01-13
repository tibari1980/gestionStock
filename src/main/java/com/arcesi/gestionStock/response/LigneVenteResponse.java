package com.arcesi.gestionStock.response;

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
public class LigneVenteResponse extends AbstractEntityResponse {

	 
	private static final long serialVersionUID = 3992274885814304358L;
	private Long code;
 	private String codeLigneVente;
	private VenteResponse venteResponse;
	private BigDecimal quantite;
	@Builder
	public LigneVenteResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeLigneVente,
			VenteResponse venteResponse, BigDecimal quantite) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneVente = codeLigneVente;
		this.venteResponse = venteResponse;
		this.quantite = quantite;
	}
	
	
}
