package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.arcesi.gestionStock.entities.UtilisateurBean;
import com.arcesi.gestionStock.request.UtilisateurRequest;
import com.arcesi.gestionStock.response.UtilisateurResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author tibari ZEROUAL
 * ingénieur develeppement
 */
@Setter
@Getter
public class UtilisateurDTO extends AbstractEntityDTO {

	 
	private static final long serialVersionUID = -2906043269541242836L;
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
	private List<RoleDTO> roleDTOs;
	
	@Builder
	public UtilisateurDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeUtilisateur, String nom,
			String prenom, String email, String password, AdresseDTO adresseDTO, String telephone, String photo,
			LocalDate dateNaissance, Integer age, EntrepriseDTO entrepriseDTO, List<RoleDTO> roleDTOs) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeUtilisateur = codeUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.adresseDTO = adresseDTO;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.entrepriseDTO = entrepriseDTO;
		this.roleDTOs = roleDTOs;
	}

	/**
	 * Convert UtilisateurBean to UtilisateurDTO
	 * @param bean {@ UtilisateurBean}
	 * @return dto {@ UtilisateurDTO}
	 */
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
	
	/**
	 * Convert UtilisateurDto to UtilisateurBean
	 * @param dto {@ UtilisateurDTO}
	 * @return bean {@ UtilisateurBean}
	 */
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
				.roleBeans(
						dto.getRoleDTOs()!=null ? 
						dto.getRoleDTOs().stream()
						.map(RoleDTO::toRoleDTO)
						.collect(Collectors.toList()):null)
				        .build();
	}

	/**
	 * Convert UtilisateurDto to UtilisateurResponse
	 * @param dto {@ UtilisateurDTO}
	 * @return bean {@ UtilisateurResponse}
	 */
	public static UtilisateurResponse DtoToResponse(UtilisateurDTO dto) {
		if(null==dto) throw new IllegalArgumentException("L'utilisateur ne peut pas être null");
		return UtilisateurResponse.builder()
				.code(dto.getCode())
				.codeUtilisateur(dto.getCodeUtilisateur())
				.createdDate(dto.getCreatedDate())
				.lastUpdateDate(dto.getLastUpdateDate())
				.nom(dto.getNom())
				.prenom(dto.getPrenom())
				.email(dto.getEmail())
				.password(dto.getPassword())
				.adresseResponse(AdresseDTO.DtoToResponse(dto.getAdresseDTO()))
				.telephone(dto.getTelephone())
				.photo(dto.getPhoto())
				.dateNaissance(dto.getDateNaissance())
				.age(dto.getAge())
				.entrepriseResponse(EntrepriseDTO.DtoToResponse(dto.getEntrepriseDTO()))
				.roleResponses(
						dto.getRoleDTOs()!=null ? 
						dto.getRoleDTOs().stream()
						.map(RoleDTO::DtoToResponse)
						.collect(Collectors.toList()):null)
				        .build();
				
	}
	
	/**
	 * Convert UtilisateurRequest to UtilisateurDTO
	 * @param dto {@ UtilisateurRequest}
	 * @return bean {@ UtilisateurDTO}
	 */
	public static UtilisateurDTO requestToDTO(UtilisateurRequest dto) {
		if(null==dto) throw new IllegalArgumentException("L'utilisateur ne peut pas être null");
		return UtilisateurDTO.builder()
				.code(dto.getCode())
				.codeUtilisateur(dto.getCodeUtilisateur())
				.createdDate(dto.getCreatedDate())
				.lastUpdateDate(dto.getLastUpdateDate())
				.nom(dto.getNom())
				.prenom(dto.getPrenom())
				.email(dto.getEmail())
				.password(dto.getPassword())
				.adresseDTO(AdresseDTO.requestToDTO(dto.getAdresseRequest()))
				.telephone(dto.getTelephone())
				.photo(dto.getPhoto())
				.dateNaissance(dto.getDateNaissance())
				.age(dto.getAge())
				.entrepriseDTO(EntrepriseDTO.requestToDto(dto.getEntrepriseRequest()))
				.roleDTOs(
						dto.getRoleRequests()!=null ? 
						dto.getRoleRequests().stream()
						.map(RoleDTO::requestToDto)
						.collect(Collectors.toList()):null)
				        .build();
				
	}
}

