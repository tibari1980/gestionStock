package com.arcesi.gestionStock.dto;

import java.time.Instant;

import com.arcesi.gestionStock.entities.VenteBean;
import com.arcesi.gestionStock.request.VenteRequest;
import com.arcesi.gestionStock.response.VenteResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @author zeroual tibari
 * ingénieur developpement
 */
@Setter
@Getter
public class VenteDTO extends AbstractEntityDTO {
	
	 
	private static final long serialVersionUID = 755744288775382193L;
	private Long code;
 	private String codeVente;
 	private Instant dateVente;
 	private String commentaire;

 	@Builder
 	public VenteDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeVente, Instant dateVente,
			String commentaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeVente = codeVente;
		this.dateVente = dateVente;
		this.commentaire = commentaire;
	}

 	/**
 	 * Convert VenteBean to VenteDTO
 	 * @param bean {@ VenteBean}
 	 * @return venteDto {@ VenteDTO}
 	 */
	public static VenteDTO fromEntity(VenteBean bean) {
 		if(null==bean) throw new IllegalArgumentException("La Ventre ne peut pas être null");
 		return VenteDTO.builder()
 				.code(bean.getCode())
 				.codeVente(bean.getCodeVente())
 				.createdDate(bean.getCreatedDate())
 				.lastUpdateDate(bean.getLastUpdateDate())
 				.dateVente(bean.getDateVente())
 				.commentaire(bean.getCommentaire())
 				.build();
 	}
 	/**
 	 * Convert VenteDto to VenteBean
 	 * @param dto {@ VenteDTO}
 	 * @return bean {@ VenteBean}
 	 */
 	public static VenteBean toVenteDTO(VenteDTO dto) {
 		if(null==dto) throw new IllegalArgumentException("La Ventre ne peut pas être null");
 		return VenteBean.builder()
 				.code(dto.getCode())
 				.codeVente(dto.getCodeVente())
 				.createdDate(dto.getCreatedDate())
 				.lastUpdateDate(dto.getLastUpdateDate())
 				.dateVente(dto.getDateVente())
 				.commentaire(dto.getCommentaire())
 				.build();
 	}
 	
 	/**
 	 * Convert VenteRequest to VenteDTO
 	 * @param request {@ VenteRequest}
 	 * @return dto {@ VenteDTO}
 	 */
 	public static VenteDTO requestToDto(VenteRequest request) {
 		if(null==request) throw new IllegalArgumentException("La Ventre ne peut pas être null");
 		return VenteDTO.builder()
 				.code(request.getCode())
 				.codeVente(request.getCodeVente())
 				.createdDate(request.getCreatedDate())
 				.lastUpdateDate(request.getLastUpdateDate())
 				.dateVente(request.getDateVente())
 				.commentaire(request.getCommentaire())
 				.build();
 	}
 	
 	/**
 	 * Convert VenteDto to VenteBean
 	 * @param dto {@ VenteDTO}
 	 * @return response {@ VenteResponse}
 	 */
 	public static VenteResponse dtoToResponse(VenteDTO dto) {
 		if(null==dto) throw new IllegalArgumentException("La Ventre ne peut pas être null");
 		return VenteResponse.builder()
 				.code(dto.getCode())
 				.codeVente(dto.getCodeVente())
 				.createdDate(dto.getCreatedDate())
 				.lastUpdateDate(dto.getLastUpdateDate())
 				.dateVente(dto.getDateVente())
 				.commentaire(dto.getCommentaire())
 				.build();
 	}
 	
}
