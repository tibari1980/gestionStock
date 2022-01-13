package com.arcesi.gestionStock.response;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @author ZEROUAL TIBAI
 * INGENIEUR DEVELOPPEMENT
 */
@Getter
@Setter
public class CommandeClientResponse  extends AbstractEntityResponse{
 
	private static final long serialVersionUID = -3903335809336853542L;
	
	private Long code;
	private String codeCommandeClient;
	private Instant dateCommande;
	private ClientResponse clientResponse;
	private Collection<LigneCommandeClientResponse> ligneCommandeClientResponses;
	
	@Builder
	public CommandeClientResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeCommandeClient,
			Instant dateCommande, ClientResponse clientResponse,
			Collection<LigneCommandeClientResponse> ligneCommandeClientResponses) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCommandeClient = codeCommandeClient;
		this.dateCommande = dateCommande;
		this.clientResponse = clientResponse;
		this.ligneCommandeClientResponses = ligneCommandeClientResponses;
	}

    
}
