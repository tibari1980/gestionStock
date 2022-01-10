package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;

import com.arcesi.gestionStock.entities.LigneCommandeClientBean;

import lombok.Builder;
import lombok.Data;
/**
 * 
 * @author zeroual tibair
 * ingénieur developpement
 */
@Builder
@Data
public class LigneCommandeClientDTO {

	 
	 private Long code;
 	private String codeLigneCommandClient;
 	private ArticleDTO articleDTO;
 	private CommandeClientDTO commandeClientDTO;
	private BigDecimal quantite;
 	private BigDecimal prixUnitaire;
 	
 	public static LigneCommandeClientDTO fromEntity(LigneCommandeClientBean bean) {
		if(bean==null) throw new IllegalArgumentException("La ligne de commande client ne peut pas être null");
		return LigneCommandeClientDTO.builder()
				.code(bean.getCode())
				.codeLigneCommandClient(bean.getCodeLigneCommandClient())
				.articleDTO(ArticleDTO.fromEntity(bean.getArticleBean()))
				.commandeClientDTO(CommandeClientDTO.formEntity(bean.getCommandeClientBean()))
				.quantite(bean.getQuantite())
				.prixUnitaire(bean.getPrixUnitaire())
				.build();

 	}
 	
 	public static LigneCommandeClientBean toLigneCommandeClientDTO(LigneCommandeClientDTO dto) {
 		if(null==dto) throw new IllegalArgumentException("La ligne commande client ne peut pas être null");
 	
 		return LigneCommandeClientBean.builder()
 				.code(dto.getCode())
 				.codeLigneCommandClient(dto.getCodeLigneCommandClient())
 				.articleBean(ArticleDTO.toArticleDTO(dto.getArticleDTO()))
 				.commandeClientBean(CommandeClientDTO.toCommandeClientDTO(dto.getCommandeClientDTO()))
 				.quantite(dto.getQuantite())
 				.prixUnitaire(dto.getPrixUnitaire())
 				.build();
 	}
 	
}
