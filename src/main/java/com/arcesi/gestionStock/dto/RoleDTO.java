package com.arcesi.gestionStock.dto;

import com.arcesi.gestionStock.entities.RoleBean;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author zeroual tibari
 * ingénieur developpement
 */
@Builder
@Data
public class RoleDTO {

	private Long code;
 	private String codeRole;
 	private String libelle;
	private UtilisateurDTO utilisateurDTO;
	
	public static RoleDTO fromEntity(RoleBean bean) {
		if(null==bean) throw new IllegalArgumentException("Le role ne peut pas être null");
		return RoleDTO.builder()
				.code(bean.getCode())
				.codeRole(bean.getCodeRole())
				.libelle(bean.getLibelle())
				.build();
	}
	
	public static RoleBean toRoleDTO(RoleDTO dto) {
		if(null==dto) throw new IllegalArgumentException("Le role ne peut pas être null");
		return RoleBean.builder()
				.code(dto.getCode())
				.codeRole(dto.getCodeRole())
				.libelle(dto.getLibelle())
				.build();
	}
}
