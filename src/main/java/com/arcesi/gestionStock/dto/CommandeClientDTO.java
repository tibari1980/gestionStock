package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.util.Collection;

import com.arcesi.gestionStock.entities.CommandeClientBean;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeClientDTO {


	private Long code;
	private String codeCommandeClient;
	private Instant dateCommande;
	private ClientDTO clientDTO;
	private Collection<LigneCommandeClientDTO> ligneCommandeClientDTOs;
	
	public static CommandeClientDTO formEntity(CommandeClientBean bean) {
		if(null==bean) throw new IllegalArgumentException("La commande client ne petu pas être null");
		return CommandeClientDTO.builder()
				.code(bean.getCode())
				.codeCommandeClient(bean.getCodeCommandeClient())
				.dateCommande(bean.getDateCommande())
				.clientDTO(ClientDTO.fromEntity(bean.getClientBean()))
				.build();
				
	}
	public static CommandeClientBean toCommandeClientDTO(CommandeClientDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La commande Client ne peut pas être null");
		return CommandeClientBean.builder()
				.code(dto.getCode())
				.codeCommandeClient(dto.getCodeCommandeClient())
				.dateCommande(dto.getDateCommande())
				.clientBean(ClientDTO.toClientDTO(dto.getClientDTO()))
				.build();
	}
}
