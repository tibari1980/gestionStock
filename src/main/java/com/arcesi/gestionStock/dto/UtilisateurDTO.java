package com.arcesi.gestionStock.dto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.stream.Collectors;

import com.arcesi.gestionStock.entities.UtilisateurBean;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author tibari ZEROUAL
 * ingénieur develeppement
 */
@Builder
@Data
public class UtilisateurDTO {

	private Long code;
 	private String codeUtilisateur;
 	private String nom;
 	private String prenom;
 	private String email;
 	private String password;
	private AdresseDTO adresseDTO;
 	private String telephone;
 	private String photo;
 	private LocalDate dateNaissance;
 	private Integer age;
	private EntrepriseDTO entrepriseDTO;
	private Collection<RoleDTO> roleDTOs;
	
	public static UtilisateurDTO fromEntity(UtilisateurBean bean) {
		if(null==bean) throw new IllegalArgumentException("L'utilisateur ne peut pas être null");
		return UtilisateurDTO.builder()
				.code(bean.getCode())
				.codeUtilisateur(bean.getCodeUtilisateur())
				.nom(bean.getNom())
				.prenom(bean.getPrenom())
				.email(bean.getEmail())
				.password(bean.getPassword())
				.adresseDTO(AdresseDTO.fromEntity(bean.getAdresse()))
				.telephone(bean.getTelephone())
				.photo(bean.getPhoto())
				.dateNaissance(bean.getDateNaissance())
				.age(bean.getAge())
				.entrepriseDTO(EntrepriseDTO.fromEntity(bean.getEntrepriseBean()))
				.roleDTOs(
						bean.getRoleBeans()!=null ? 
						bean.getRoleBeans().stream()
						.map(RoleDTO::fromEntity)
						.collect(Collectors.toList()):null)
				        .build();
	}
	
	public static UtilisateurBean toUtilisateurDTO(UtilisateurDTO dto) {
		if(null==dto) throw new IllegalArgumentException("L'utilisateur ne peut pas être null");
		return UtilisateurBean.builder()
				.code(dto.getCode())
				.codeUtilisateur(dto.getCodeUtilisateur())
				.nom(dto.getNom())
				.prenom(dto.getPrenom())
				.email(dto.getEmail())
				.password(dto.getPassword())
				.adresse(AdresseDTO.toAdresseDTO(dto.getAdresseDTO()))
				.telephone(dto.getTelephone())
				.photo(dto.getPhoto())
				.dateNaissance(dto.getDateNaissance())
				.age(dto.getAge())
				.entrepriseBean(EntrepriseDTO.toEntrepriseDTO(dto.getEntrepriseDTO()))
				.roleBeans(null)
				 .build();
	}
}
