package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.util.List;

import com.arcesi.gestionStock.entities.RoleBean;
import com.arcesi.gestionStock.request.RoleRequest;
import com.arcesi.gestionStock.response.RoleResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author zeroual tibari
 * ingénieur developpement
 */
@Setter
@Getter
public class RoleDTO  extends AbstractEntityDTO{

	 
	private static final long serialVersionUID = -5155313428423034627L;
	private Long code;
 	private String codeRole;
 	private String libelle;
	
 	private List<UtilisateurDTO> utilisateurDTO;
	
 	@Builder
 	public RoleDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeRole, String libelle,
			List<UtilisateurDTO> utilisateurDTO) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeRole = codeRole;
		this.libelle = libelle;
		this.utilisateurDTO = utilisateurDTO;
	}
 	/**
 	 * Convert RoleBean To RoleDTO
 	 * @param bean {@ RoleBean}
 	 * @return roleDto {@ RoleDTO}
 	 */
	public static RoleDTO fromEntity(RoleBean bean) {
		if(null==bean) throw new IllegalArgumentException("Le role ne peut pas être null");
		return RoleDTO.builder()
				.code(bean.getCode())
				.codeRole(bean.getCodeRole())
				.createdDate(bean.getCreatedDate())
				.lastUpdateDate(bean.getLastUpdateDate())
				.libelle(bean.getLibelle())
				.build();
	}
	
	/**
	 * Convert RoleDto to RoleBean
	 * @param dto {@ RoleDTO}
	 * @return bean {@ RoleBean}
	 */
	public static RoleBean toRoleDTO(RoleDTO dto) {
		if(null==dto) throw new IllegalArgumentException("Le role ne peut pas être null");
		return RoleBean.builder()
				.code(dto.getCode())
				.codeRole(dto.getCodeRole())
				.createdDate(dto.getCreatedDate())
				.lastUpdateDate(dto.getLastUpdateDate())
				.libelle(dto.getLibelle())
				.build();
	}


	/**
	 * Convert RoleDto to RoleResponse
	 * @param dto {@ RoleDTO}
	 * @return bean {@ RoleResponse}
	 */
	public static RoleResponse DtoToResponse(RoleDTO dto) {
		if(null==dto) throw new IllegalArgumentException("Le role ne peut pas être null");
		return RoleResponse.builder()
				.code(dto.getCode())
				.codeRole(dto.getCodeRole())
				.createdDate(dto.getCreatedDate())
				.lastUpdateDate(dto.getLastUpdateDate())
				.libelle(dto.getLibelle())
				.build();
	}
	
	
	/**
	 * Convert RoleDto to RoleResponse
	 * @param dto {@ RoleRequest}
	 * @return bean {@ RoleDTO}
	 */
	public static RoleDTO requestToDto(RoleRequest dto) {
		if(null==dto) throw new IllegalArgumentException("Le role ne peut pas être null");
		return RoleDTO.builder()
				.code(dto.getCode())
				.codeRole(dto.getCodeRole())
				.createdDate(dto.getCreatedDate())
				.lastUpdateDate(dto.getLastUpdateDate())
				.libelle(dto.getLibelle())
				.build();
	}

	
}
