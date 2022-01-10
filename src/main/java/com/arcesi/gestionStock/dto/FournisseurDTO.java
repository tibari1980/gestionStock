package com.arcesi.gestionStock.dto;

import java.time.LocalDate;
import java.util.Collection;

import com.arcesi.gestionStock.entities.FournisseurBean;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class FournisseurDTO {
	
	private Long code;
	private String codeFournisseur;
 	private String nom;
 	private String prenom;
 	private String email;
	 
	private AdresseDTO adresseDTO;
 	private String telephone;
 	private String photo;
 	private LocalDate dateNaissance;
 	 
	private Integer age;
 	private Collection<CommandeFournisseurDTO> commandeFournisseurDTOs;
	
 	public static FournisseurDTO fromEntity(FournisseurBean bean) {
		if(bean==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		return FournisseurDTO.builder()
				.code(bean.getCode())
				.codeFournisseur(bean.getCodeFournisseur())
				.nom(bean.getNom())
				.prenom(bean.getPrenom())
				.email(bean.getEmail())
				.adresseDTO(AdresseDTO.fromEntity(bean.getAdresse()))
				.telephone(bean.getTelephone())
				.photo(bean.getPhoto())
				.dateNaissance(bean.getDateNaissance())
				.age(bean.getAge())
				.build();
	}
 	
 	public static FournisseurBean ToFournisseurDTO(FournisseurDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		
		return FournisseurBean.builder()
				.code(dto.getCode())
				.codeFournisseur(dto.getCodeFournisseur())
				.nom(dto.getNom())
				.prenom(dto.getPrenom())
				.email(dto.getEmail())
				.adresse(AdresseDTO.toAdresseDTO(dto.getAdresseDTO()))
				.telephone(dto.getTelephone())
				.photo(dto.getPhoto())
				.dateNaissance(dto.getDateNaissance())
				.age(dto.getAge())
				.build();
	}

}
