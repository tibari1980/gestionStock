package com.arcesi.gestionStock.dto;

import com.arcesi.gestionStock.entities.AdresseBean;
import com.arcesi.gestionStock.request.AdresseRequest;
import com.arcesi.gestionStock.response.AdresseResponse;

import lombok.Builder;
import lombok.Data;
/**
 * 
 * @author ZEROUAL tibari
 * Ingénieur developpement
 */
@Data
@Builder
public class AdresseDTO {

 	private String firstAdresse;
 	private String secondeAdresse;
 	private String ville;
 	private String codePostale;
 	private String pays;
 	private String typeAdresse;
 	
 	public static AdresseDTO fromEntity(AdresseBean adresseBean) {
 		if(adresseBean==null) {
 			throw new IllegalArgumentException("l'adresse ne peut pas être null");
 		}
 		return AdresseDTO.builder()
 				.codePostale(adresseBean.getCodePostale())
 				.ville(adresseBean.getVille())
 				.pays(adresseBean.getPays())
 				.firstAdresse(adresseBean.getFirstAdresse())
 				.secondeAdresse(adresseBean.getSecondeAdresse())
 				.typeAdresse(adresseBean.getTypeAdresse())		
 				.build();
 	}
 	public static AdresseBean toAdresseDTO(AdresseDTO adresseDTO) {
 		if(adresseDTO==null) {
 			throw new IllegalArgumentException("L'adresse ne peut pas être null");
 		}
 		return AdresseBean.builder()
 				.codePostale(adresseDTO.getCodePostale())
 				.ville(adresseDTO.getVille())
 				.pays(adresseDTO.getPays())
 				.firstAdresse(adresseDTO.getFirstAdresse())
 				.secondeAdresse(adresseDTO.getSecondeAdresse())
 				.typeAdresse(adresseDTO.getTypeAdresse())
 				.build();
 	}
 	/**
 	 * Convertive AdresseRequest To AdresseDTO
 	 * @param adresseRequest
 	 * @return
 	 */
 	public static AdresseDTO requestToDTO(AdresseRequest adresseRequest) {
 		if(adresseRequest==null) {
 			throw new IllegalArgumentException("l'adresse ne peut pas être null");
 		}
 		return AdresseDTO.builder()
 				.codePostale(adresseRequest.getCodePostale())
 				.ville(adresseRequest.getVille())
 				.pays(adresseRequest.getPays())
 				.firstAdresse(adresseRequest.getFirstAdresse())
 				.secondeAdresse(adresseRequest.getSecondeAdresse())
 				.typeAdresse(adresseRequest.getTypeAdresse())		
 				.build();
 	}
 	
 	public static AdresseResponse DtoToResponse(AdresseDTO adresseDTO) {
 		if(adresseDTO==null) {
 			throw new IllegalArgumentException("l'adresse ne peut pas être null");
 		}
 		return AdresseResponse.builder()
 				.codePostale(adresseDTO.getCodePostale())
 				.ville(adresseDTO.getVille())
 				.pays(adresseDTO.getPays())
 				.firstAdresse(adresseDTO.getFirstAdresse())
 				.secondeAdresse(adresseDTO.getSecondeAdresse())
 				.typeAdresse(adresseDTO.getTypeAdresse())		
 				.build();
 	}
}
