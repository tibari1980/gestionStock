package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.util.Collection;

import com.arcesi.gestionStock.entities.CommandeFournisseurBean;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CommandeFournisseurDTO {

	 
	private Long code;
	private String codeCommandeFounisseur;
	private Instant dateCommande;
	private FournisseurDTO fournisseurDTO; 
	private Collection<LigneCommandeFournisseurDTO> ligneCommandeFournisseurDTOs;


	public static CommandeFournisseurDTO fromEntity(CommandeFournisseurBean bean) {
		if(bean==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		return CommandeFournisseurDTO.builder()
				.code(bean.getCode())
				.codeCommandeFounisseur(bean.getCodeCommandeFounisseur())
				.dateCommande(bean.getDateCommande())
				.fournisseurDTO(FournisseurDTO.fromEntity(bean.getFournisseurBean()))
				.build();
	}
	
	public static CommandeFournisseurBean toCommandeFournisseurDTO(CommandeFournisseurDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		return CommandeFournisseurBean.builder()
				.code(dto.getCode())
				.codeCommandeFounisseur(dto.getCodeCommandeFounisseur())
				.dateCommande(dto.getDateCommande())
				.fournisseurBean(FournisseurDTO.ToFournisseurDTO(dto.getFournisseurDTO()))
				.build();
	}
}
