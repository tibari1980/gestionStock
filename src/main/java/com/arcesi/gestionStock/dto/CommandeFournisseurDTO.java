package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.util.Collection;

import com.arcesi.gestionStock.entities.CommandeFournisseurBean;
import com.arcesi.gestionStock.request.CommandeFournisseurRequest;
import com.arcesi.gestionStock.response.CommandeFournisseurResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommandeFournisseurDTO  extends AbstractEntityDTO{

	 
	private static final long serialVersionUID = 2991540679379632351L;
	private Long code;
	private String codeCommandeFounisseur;
	private Instant dateCommande;
	private FournisseurDTO fournisseurDTO; 
	private Collection<LigneCommandeFournisseurDTO> ligneCommandeFournisseurDTOs;

	@Builder
	public CommandeFournisseurDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeCommandeFounisseur,
			Instant dateCommande, FournisseurDTO fournisseurDTO,
			Collection<LigneCommandeFournisseurDTO> ligneCommandeFournisseurDTOs) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCommandeFounisseur = codeCommandeFounisseur;
		this.dateCommande = dateCommande;
		this.fournisseurDTO = fournisseurDTO;
		this.ligneCommandeFournisseurDTOs = ligneCommandeFournisseurDTOs;
	}

	/**
	 * Convert CommandeFournisseurBean to CommandeFournisseurDTO
	 * @param bean {@ CommandeFournisseurBean}
	 * @return dto {@ CommandeFournisseurDTO}
	 */
	public static CommandeFournisseurDTO fromEntity(CommandeFournisseurBean bean) {
		if(bean==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		return CommandeFournisseurDTO.builder()
				.code(bean.getCode())
				.codeCommandeFounisseur(bean.getCodeCommandeFounisseur())
				.createdDate(bean.getCreatedDate())
				.lastUpdateDate(bean.lastUpdateDate)
				.dateCommande(bean.getDateCommande())
				.fournisseurDTO(FournisseurDTO.fromEntity(bean.getFournisseurBean()))
				.build();
	}
	
	/**
	 * Convert CommandeFournssieurDTO to CommandFournssieurBean
	 * @param dto {@ CommandeFournisseurDTO}
	 * @return bean {@ CommandeFournisseurBean}
	 */
	public static CommandeFournisseurBean toCommandeFournisseurDTO(CommandeFournisseurDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		return CommandeFournisseurBean.builder()
				.code(dto.getCode())
				.codeCommandeFounisseur(dto.getCodeCommandeFounisseur())
				.dateCommande(dto.getDateCommande())
				.fournisseurBean(FournisseurDTO.ToFournisseurDTO(dto.getFournisseurDTO()))
				.build();
	}
	
	/**
	 * Convert CommandeFournisseurDTO to CommandeFournisseurResponse
	 * @param dto {@ CommandeFournisseurBean}
	 * @return response {@ CommandeFournisseurResponse}
	 */
	public static CommandeFournisseurResponse DtoToResponse(CommandeFournisseurDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		return CommandeFournisseurResponse.builder()
				.code(dto.getCode())
				.codeCommandeFounisseur(dto.getCodeCommandeFounisseur())
				.createdDate(dto.getCreatedDate())
				.lastUpdateDate(dto.getLastUpdateDate())
				.dateCommande(dto.getDateCommande())
				.fournisseurResponse(FournisseurDTO.DtoToResponse(dto.getFournisseurDTO()))
				.build();
	}
	/**
	 * Convert CommandeFournisseurRequest To CommandeFournisseurDTO
	 * @param request {@ CommandeFournisseurRequest}
	 * @return commandeFournssieurDto {@ CommandeFournisseurDTO}
	 */
	public static CommandeFournisseurDTO requestToDTO(CommandeFournisseurRequest request) {
		if(request==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		return CommandeFournisseurDTO.builder()
				.code(request.getCode())
				.codeCommandeFounisseur(request.getCodeCommandeFounisseur())
				.createdDate(request.getCreatedDate())
				.lastUpdateDate(request.lastUpdateDate)
				.dateCommande(request.getDateCommande())
				.fournisseurDTO(FournisseurDTO.requesteToDto(request.getFournisseurRequest()))
				.build();
	}
}
