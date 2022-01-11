package com.arcesi.gestionStock.request;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientRequest {

	private Long code;
	private String codeCommandeClient;
	private Instant dateCommande;
	private ClientRequest clientRequest;
	private Collection<LigneCommandeClientRequest> ligneCommandeClientRequests;
}
