package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.arcesi.gestionStock.entities.LigneVenteBean;
import com.arcesi.gestionStock.request.LigneVenteRequest;
import com.arcesi.gestionStock.response.LigneVenteResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBAIR
 * ingénieur developpement
 */
@Setter
@Getter
public class LigneVenteDTO extends AbstractEntityDTO {

	 
	private static final long serialVersionUID = 6271508641416043088L;
	private Long code;
 	private String codeLigneVente;
	private VenteDTO venteDTO;
	private BigDecimal quantite;

	
	@Builder
    public LigneVenteDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeLigneVente,
			VenteDTO venteDTO, BigDecimal quantite) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneVente = codeLigneVente;
		this.venteDTO = venteDTO;
		this.quantite = quantite;
	}

	/**
	 * Convert LigneVenteBean to LingeVenteDTO
	 * @param bean {@ LigneCommandeFournisseurBean}
	 * @return ligneVenteDto {@ LigneCommandeFournisseurDTO}
	 */
	public static LigneVenteDTO fromEntity(LigneVenteBean bean) {
    	if(null==bean) throw new IllegalArgumentException("La ligne vente ne peut pas être null");
    	return LigneVenteDTO.builder()
    			.code(bean.getCode())
    			.codeLigneVente(bean.getCodeLigneVente())
    			.createdDate(bean.getCreatedDate())
    			.lastUpdateDate(bean.getLastUpdateDate())
    			.venteDTO(VenteDTO.fromEntity(bean.getVenteBean()))
    			.quantite(bean.getQuantite())
    			.build();
    }

	/**
	 * Convert LigneVenteBean to LingeVenteDTO
	 * @param dto {@ LigneVenteDTO}
	 * @return ligneVenteBean {@ LigneVenteBean}
	 */
    public static LigneVenteBean toLigneVenteDTO(LigneVenteDTO dto) {
    	if(null==dto) throw new IllegalArgumentException("La ligne vente ne peut pas être null");
    	return LigneVenteBean.builder()
    			.code(dto.getCode())
    			.codeLigneVente(dto.getCodeLigneVente())
    			.createdDate(dto.getCreatedDate())
    			.lastUpdateDate(dto.getLastUpdateDate())
    			.venteBean(VenteDTO.toVenteDTO(dto.getVenteDTO()))
    			.quantite(dto.getQuantite())
    			.build();
    }
    
    /**
	 * Convert LigneVenteDTO to LingeVenteResponse
	 * @param dto {@ LigneVenteDTO}
	 * @return ligneVenteResponse {@ LigneVenteResponse}
	 */
    public static LigneVenteResponse DtoToResponse(LigneVenteDTO dto) {
    	if(null==dto) throw new IllegalArgumentException("La ligne vente ne peut pas être null");
    	return LigneVenteResponse.builder()
    			.code(dto.getCode())
    			.codeLigneVente(dto.getCodeLigneVente())
    			.createdDate(dto.getCreatedDate())
    			.lastUpdateDate(dto.getLastUpdateDate())
    			.venteResponse(VenteDTO.dtoToResponse(dto.getVenteDTO()))
    			.quantite(dto.getQuantite())
    			.build();
    }
    
    /**
	 * Convert LigneVenteRequest to LingeVenteDTO
	 * @param dto {@ LigneVenteRequest}
	 * @return ligneVenteBean {@ LigneVenteDTO}
	 */
    public static LigneVenteDTO requestToDto(LigneVenteRequest dto) {
    	if(null==dto) throw new IllegalArgumentException("La ligne vente ne peut pas être null");
    	return LigneVenteDTO.builder()
    			.code(dto.getCode())
    			.codeLigneVente(dto.getCodeLigneVente())
    			.createdDate(dto.getCreatedDate())
    			.lastUpdateDate(dto.getLastUpdateDate())
    			.venteDTO(VenteDTO.requestToDto(dto.getVenteRequest()))
    			.quantite(dto.getQuantite())
    			.build();
    }
    
}
