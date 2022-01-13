package com.arcesi.gestionStock.request;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @author M ZEROUAL TIBARI
 * INGENIEUR DEVELOPPEMENT
 */

@Getter @Setter
public class CommandeClientRequest extends AbstractEntityRequest{

	 
	private static final long serialVersionUID = 6818216192971498900L;
	private Long code;
	private String codeCommandeClient;
	private Instant dateCommande;
	private ClientRequest clientRequest;
	private Collection<LigneCommandeClientRequest> ligneCommandeClientRequests;
	
	@Builder
	public CommandeClientRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeCommandeClient,
			Instant dateCommande, ClientRequest clientRequest,
			Collection<LigneCommandeClientRequest> ligneCommandeClientRequests) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCommandeClient = codeCommandeClient;
		this.dateCommande = dateCommande;
		this.clientRequest = clientRequest;
		this.ligneCommandeClientRequests = ligneCommandeClientRequests;
	}

   
}
