package com.arcesi.gestionStock.dto;

import java.time.Instant;

import com.arcesi.gestionStock.entities.VenteBean;

import lombok.Builder;
import lombok.Data;
/**
 * 
 * @author zeroual tibari
 * ingénieur developpement
 */
@Builder
@Data
public class VenteDTO {
	
	private Long code;
 	private String codeVente;
 	private Instant dateVente;
 	private String commentaire;

 	public static VenteDTO fromEntity(VenteBean bean) {
 		if(null==bean) throw new IllegalArgumentException("La Ventre ne peut pas être null");
 		return VenteDTO.builder()
 				.code(bean.getCode())
 				.codeVente(bean.getCodeVente())
 				.dateVente(bean.getDateVente())
 				.commentaire(bean.getCommentaire())
 				.build();
 	}
 	
 	public static VenteBean toVenteDTO(VenteDTO dto) {
 		if(null==dto) throw new IllegalArgumentException("La Ventre ne peut pas être null");
 		return VenteBean.builder()
 				.code(dto.getCode())
 				.codeVente(dto.getCodeVente())
 				.dateVente(dto.getDateVente())
 				.commentaire(dto.getCommentaire())
 				.build();
 	}
}
