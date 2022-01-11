package com.arcesi.gestionStock.response;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeClientResponse {

	private Long code;
	private String codeCommandeClient;
	private Instant dateCommande;
	private ClientResponse clientResponse;
	private Collection<LigneCommandeClientResponse> ligneCommandeClientResponses;
}
