package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.util.Collection;

import com.arcesi.gestionStock.entities.EntrepriseBean;
import com.arcesi.gestionStock.request.EntrepriseRequest;
import com.arcesi.gestionStock.response.EntrepriseResponse;

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
public class EntrepriseDTO extends AbstractEntityDTO {
	
	private static final long serialVersionUID = 3914232957747069380L;
	private Long code;
 	private String codeEntreprise;
 	private String raisonSocial;
 	private String siret;
 	private String numeroTVA;
 	private AdresseDTO adresseDTO;
 	private String email;
 	private String telephone;
	private Collection<UtilisateurDTO> utilisateurDTOs;
	@Builder
	public EntrepriseDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeEntreprise,
			String raisonSocial, String siret, String numeroTVA, AdresseDTO adresseDTO, String email, String telephone,
			Collection<UtilisateurDTO> utilisateurDTOs) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeEntreprise = codeEntreprise;
		this.raisonSocial = raisonSocial;
		this.siret = siret;
		this.numeroTVA = numeroTVA;
		this.adresseDTO = adresseDTO;
		this.email = email;
		this.telephone = telephone;
		this.utilisateurDTOs = utilisateurDTOs;
	}
	/**
	 * Convert EntrepriseBean to EntrepriseDTO
	 * @param bean {@ EntrepriseBean}
	 * @return fournisseurDTO {@ EntrepriseDTO}
	 */
	
	public static EntrepriseDTO fromEntity(EntrepriseBean bean) {
		if(bean==null) throw new IllegalArgumentException("L'entreprise ne peut pas être null");
        return EntrepriseDTO.builder()
        		.code(bean.getCode())
        		.codeEntreprise(bean.getCodeEntreprise())
        		.createdDate(bean.getCreatedDate())
        		.lastUpdateDate(bean.getLastUpdateDate())
        		.raisonSocial(bean.getRaisonSocial())
        		.siret(bean.getSiret())
        		.numeroTVA(bean.getNumeroTVA())
        		.adresseDTO(AdresseDTO.fromEntity(bean.getAdresseBean()))
        		.email(bean.getEmail())
        		.telephone(bean.getTelephone())
        		.build();
	}

	/**
	 * Convert EntrepriseDto to EntrepriseBean
	 * @param dto {@ EntrepriseDTO}
	 * @return bean {@ EntrepriseBean}
	 */
	public static EntrepriseBean toEntrepriseDTO(EntrepriseDTO dto) {
		if(dto==null) throw new IllegalArgumentException("L'entreprise ne peut pas être null");
        return EntrepriseBean.builder()
        		.code(dto.getCode())
        		.codeEntreprise(dto.getCodeEntreprise())
        		.createdDate(dto.getCreatedDate())
        		.lastUpdateDate(dto.getLastUpdateDate())
        		.raisonSocial(dto.getRaisonSocial())
        		.siret(dto.getSiret())
        		.numeroTVA(dto.getNumeroTVA())
        		.adresseBean(AdresseDTO.toAdresseDTO(dto.getAdresseDTO()))
        		.email(dto.getEmail())
        		.telephone(dto.getEmail())
        		.build();
	}

	/**
	 * Convert EntrepriseRequest to EntrepriseDTO
	 * @param request {@ EntrepriseRequest}
	 * @return entrepriseDto {@ EntrepriseDTO}
	 */
	public static EntrepriseDTO requestToDto(EntrepriseRequest request) {
		if(request==null) throw new IllegalArgumentException("L'entreprise ne peut pas être null");
        return EntrepriseDTO.builder()
        		.code(request.getCode())
        		.codeEntreprise(request.getCodeEntreprise())
        		.raisonSocial(request.getRaisonSocial())
        		.siret(request.getSiret())
        		.numeroTVA(request.getNumeroTVA())
        		.adresseDTO(AdresseDTO.requestToDTO(request.getAdresseRequest()))
        		.email(request.getEmail())
        		.telephone(request.getTelephone())
        		.build();
	}

	/**
	 * Convert EntrepriseDto to EntrepriseResponse
	 * @param dto {@ EntrepriseDTO}
	 * @return bean {@ EntrepriseResponse}
	 */
	public static EntrepriseResponse DtoToResponse(EntrepriseDTO dto) {
		if(dto==null) throw new IllegalArgumentException("L'entreprise ne peut pas être null");
        return EntrepriseResponse.builder()
        		.code(dto.getCode())
        		.codeEntreprise(dto.getCodeEntreprise())
        		.createdDate(dto.getCreatedDate())
        		.lastUpdateDate(dto.getLastUpdateDate())
        		.raisonSocial(dto.getRaisonSocial())
        		.siret(dto.getSiret())
        		.numeroTVA(dto.getNumeroTVA())
        		.adressResponse(AdresseDTO.DtoToResponse(dto.getAdresseDTO()))
        		.email(dto.getEmail())
        		.telephone(dto.getEmail())
        		.build();
	}

}
