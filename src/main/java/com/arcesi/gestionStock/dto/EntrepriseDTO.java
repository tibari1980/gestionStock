package com.arcesi.gestionStock.dto;

import java.util.Collection;

import com.arcesi.gestionStock.entities.EntrepriseBean;

import lombok.Builder;
import lombok.Data;
/**
 * 
 * @author zeroual tibari
 * ingénieur developpement
 */
@Builder
@Data
public class EntrepriseDTO {
	private Long code;
 	private String codeEntreprise;
 	private String raisonSocial;
 	private String siret;
 	private String numeroTVA;
 	private AdresseDTO adresseDTO;
 	private String email;
 	private String telephone;
	private Collection<UtilisateurDTO> utilisateurDTOs;
	
	public static EntrepriseDTO fromEntity(EntrepriseBean bean) {
		if(bean==null) throw new IllegalArgumentException("L'entreprise ne peut pas être null");
        return EntrepriseDTO.builder()
        		.code(bean.getCode())
        		.codeEntreprise(bean.getCodeEntreprise())
        		.raisonSocial(bean.getRaisonSocial())
        		.siret(bean.getSiret())
        		.numeroTVA(bean.getNumeroTVA())
        		.adresseDTO(AdresseDTO.fromEntity(bean.getAdresseBean()))
        		.email(bean.getEmail())
        		.telephone(bean.getTelephone())
        		.build();
	}

	public static EntrepriseBean toEntrepriseDTO(EntrepriseDTO dto) {
		if(dto==null) throw new IllegalArgumentException("L'entreprise ne peut pas être null");
        return EntrepriseBean.builder()
        		.code(dto.getCode())
        		.codeEntreprise(dto.getCodeEntreprise())
        		.raisonSocial(dto.getRaisonSocial())
        		.siret(dto.getSiret())
        		.numeroTVA(dto.getNumeroTVA())
        		.adresseBean(AdresseDTO.toAdresseDTO(dto.getAdresseDTO()))
        		.email(dto.getEmail())
        		.telephone(dto.getEmail())
        		.build();
	}
	

}
