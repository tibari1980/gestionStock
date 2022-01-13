package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.util.Collection;

import com.arcesi.gestionStock.entities.CommandeClientBean;
import com.arcesi.gestionStock.request.CommandeClientRequest;
import com.arcesi.gestionStock.response.CommandeClientResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @auth   Mr zeroual Tibari
 *	ingénieur developpement
 */
@Getter
@Setter
public class CommandeClientDTO extends AbstractEntityDTO {

 
	private static final long serialVersionUID = 2124777340844462451L;
	
	private Long code;
	private String codeCommandeClient;
	private Instant dateCommande;
	private ClientDTO clientDTO;
	private Collection<LigneCommandeClientDTO> ligneCommandeClientDTOs;
	
	
	@Builder
	public CommandeClientDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeCommandeClient,
			Instant dateCommande, ClientDTO clientDTO, Collection<LigneCommandeClientDTO> ligneCommandeClientDTOs) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCommandeClient = codeCommandeClient;
		this.dateCommande = dateCommande;
		this.clientDTO = clientDTO;
		this.ligneCommandeClientDTOs = ligneCommandeClientDTOs;
	}
	public static CommandeClientDTO formEntity(CommandeClientBean bean) {
		if(null==bean) throw new IllegalArgumentException("La commande client ne petu pas être null");
		return CommandeClientDTO.builder()
				.code(bean.getCode())
				.codeCommandeClient(bean.getCodeCommandeClient())
				.createdDate(bean.getCreatedDate())
				.lastUpdateDate(bean.getLastUpdateDate())
				.dateCommande(bean.getDateCommande())
				.clientDTO(ClientDTO.fromEntity(bean.getClientBean()))
				.build();
				
	}
	public static CommandeClientBean toCommandeClientDTO(CommandeClientDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La commande Client ne peut pas être null");
		return CommandeClientBean.builder()
				.code(dto.getCode())
				.codeCommandeClient(dto.getCodeCommandeClient())
				.createdDate(dto.getCreatedDate())
				.lastUpdateDate(dto.getLastUpdateDate())
				.dateCommande(dto.getDateCommande())
				.clientBean(ClientDTO.toClientDTO(dto.getClientDTO()))
				.build();
	}
	
	public static CommandeClientResponse dtoToResponse(CommandeClientDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La commande Client ne peut pas être null");
		return CommandeClientResponse.builder()
				.code(dto.getCode())
				.codeCommandeClient(dto.getCodeCommandeClient())
				.createdDate(dto.getCreatedDate())
				.lastUpdateDate(dto.getLastUpdateDate())
				.dateCommande(dto.getDateCommande())
				.clientResponse(ClientDTO.toClientResponse(dto.getClientDTO()))
				.build();
	}
	
	public static CommandeClientDTO requesteToDto(CommandeClientRequest request) {
		if(null==request) throw new IllegalArgumentException("La commande client ne petu pas être null");
		return CommandeClientDTO.builder()
				.code(request.getCode())
				.codeCommandeClient(request.getCodeCommandeClient())
				.createdDate(request.getCreatedDate())
				.lastUpdateDate(request.getLastUpdateDate())
				.dateCommande(request.getDateCommande())
				.clientDTO(ClientDTO.clientRequestToClientDto(request.getClientRequest()))
				.build();
				
	}
}
