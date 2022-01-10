package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;

import com.arcesi.gestionStock.entities.LigneVenteBean;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBAIR
 * ingénieur developpement
 */
@Builder
@Data
public class LigneVenteDTO {

	private Long code;
 	private String codeLigneVente;
	private VenteDTO venteDTO;
	private BigDecimal quantite;

    public static LigneVenteDTO fromEntity(LigneVenteBean bean) {
    	if(null==bean) throw new IllegalArgumentException("La ligne vente ne peut pas être null");
    	return LigneVenteDTO.builder()
    			.code(bean.getCode())
    			.codeLigneVente(bean.getCodeLigneVente())
    			.venteDTO(VenteDTO.fromEntity(bean.getVenteBean()))
    			.quantite(bean.getQuantite())
    			.build();
    }

    public static LigneVenteBean toLigneVenteDTO(LigneVenteDTO dto) {
    	if(null==dto) throw new IllegalArgumentException("La ligne vente ne peut pas être null");
    	return LigneVenteBean.builder()
    			.code(dto.getCode())
    			.codeLigneVente(dto.getCodeLigneVente())
    			.venteBean(VenteDTO.toVenteDTO(dto.getVenteDTO()))
    			.quantite(dto.getQuantite())
    			.build();
    }
    
}
