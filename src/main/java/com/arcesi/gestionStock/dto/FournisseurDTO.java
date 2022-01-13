package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;

import com.arcesi.gestionStock.entities.FournisseurBean;
import com.arcesi.gestionStock.request.FournisseurRequest;
import com.arcesi.gestionStock.response.FournisseurResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @author Mr zeroual tibari
 * ingénieur développement
 */
@Setter
@Getter
public class FournisseurDTO extends AbstractEntityDTO {
	
	
	private static final long serialVersionUID = 4059749437368859125L;
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
	
 	
 	@Builder
 	public FournisseurDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeFournisseur, String nom,
			String prenom, String email, AdresseDTO adresseDTO, String telephone, String photo, LocalDate dateNaissance,
			Integer age, Collection<CommandeFournisseurDTO> commandeFournisseurDTOs) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeFournisseur = codeFournisseur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresseDTO = adresseDTO;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.commandeFournisseurDTOs = commandeFournisseurDTOs;
	}

 	/**
 	 * Convert the FournisseurBean to FournisseurDTO
 	 * @param bean
 	 * @return
 	 */
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
 	
	/**
	 * convert FounrisseurDTO TO fournisseurBean
	 * @param dto
	 * @return
	 */
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

 	/**
 	 * Convert FournisseurRequest to FournisseurDTO
 	 * @param bean
 	 * @return
 	 */
 	public static FournisseurDTO requesteToDto(FournisseurRequest bean) {
		if(bean==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		return FournisseurDTO.builder()
				.code(bean.getCode())
				.codeFournisseur(bean.getCodeFournisseur())
				.createdDate(bean.getCreatedDate())
				.lastUpdateDate(bean.getLastUpdateDate())
				.nom(bean.getNom())
				.prenom(bean.getPrenom())
				.email(bean.getEmail())
				.adresseDTO(AdresseDTO.requestToDTO(bean.getAdresseRequest()))
				.telephone(bean.getTelephone())
				.photo(bean.getPhoto())
				.dateNaissance(bean.getDateNaissance())
				.age(bean.getAge())
				.build();
	}
 	
 	/**
 	 * Convert  FournisseurDTO to FournisseurResponse
 	 * @param dto
 	 * @return
 	 */
 	public static FournisseurResponse DtoToResponse(FournisseurDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La commande fourniseur ne peut pas être null");
		
		return FournisseurResponse.builder()
				.code(dto.getCode())
				.codeFournisseur(dto.getCodeFournisseur())
				.nom(dto.getNom())
				.prenom(dto.getPrenom())
				.email(dto.getEmail())
				.adresseResponse(AdresseDTO.DtoToResponse(dto.getAdresseDTO()))
				.telephone(dto.getTelephone())
				.photo(dto.getPhoto())
				.dateNaissance(dto.getDateNaissance())
				.age(dto.getAge())
				.build();
	}
}
