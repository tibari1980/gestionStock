package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;

import com.arcesi.gestionStock.entities.LigneCommandeFournisseurBean;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author ZEROUAL TIBARI
 * ingénieur developpement
 */
@Builder
@Data
public class LigneCommandeFournisseurDTO {
	

	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleDTO articleDTO;
	private CommandeFournisseurDTO commandeFournisseurDTO;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	
	public static LigneCommandeFournisseurDTO fromEntity(LigneCommandeFournisseurBean bean) {
		if(bean==null) throw new IllegalArgumentException("La ligne commande fourniseur ne peut pas être null");
        return LigneCommandeFournisseurDTO.builder()
        		.code(bean.getCode())
        		.codeLigneCommandeFournisseur(bean.getCodeLigneCommandeFournisseur())
        		.articleDTO(ArticleDTO.fromEntity(bean.getArticleBean()))
        		.commandeFournisseurDTO(CommandeFournisseurDTO.fromEntity(bean.getCommandeFournisseurBean()))
        		.quantite(bean.getQuantite())
        		.prixUnitaire(bean.getPrixUnitaire())
        		.build();
	}
	
	public static LigneCommandeFournisseurBean toLigneCommandeFournisseurDTO(LigneCommandeFournisseurDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La ligne commande fourniseur ne peut pas être null");
         return LigneCommandeFournisseurBean.builder()
        		 .code(dto.getCode())
        		 .codeLigneCommandeFournisseur(dto.getCodeLigneCommandeFournisseur())
        		 .articleBean(ArticleDTO.toArticleDTO(dto.getArticleDTO()))
        		 .commandeFournisseurBean(CommandeFournisseurDTO.toCommandeFournisseurDTO(dto.getCommandeFournisseurDTO()))
        		 .quantite(dto.getQuantite())
        		 .prixUnitaire(dto.getPrixUnitaire())
        		 .build();
	}
}
