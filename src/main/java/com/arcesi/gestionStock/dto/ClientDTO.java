package com.arcesi.gestionStock.dto;

import java.time.LocalDate;
import java.util.Collection;

import com.arcesi.gestionStock.entities.ClientBean;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDTO {

	private Long code;
	private String codeClient;
	private String nom;
	private String prenom;
	private String email;
	private AdresseDTO adresse;
	private String telephone;	 
	private String photo;
	 
	private LocalDate dateNaissance;
	 
	 
	private Integer age;
	 
	private Collection<CommandeClientDTO> commandeClientDTOs;
	
	public static ClientDTO fromEntity(ClientBean clientBean) {
		if(null==clientBean) throw new IllegalArgumentException("Le client ne peut pas être null");
	return ClientDTO.builder()
			.code(clientBean.getCode())
			.codeClient(clientBean.getCodeClient())
			.nom(clientBean.getNom())
			.prenom(clientBean.getPrenom())
			.dateNaissance(clientBean.getDateNaissance())
			.photo(clientBean.getPhoto())
			.telephone(clientBean.getTelephone())
			.email(clientBean.getEmail())
			.adresse(AdresseDTO.fromEntity(clientBean.getAdresse()))
			.build();

	}
	
	public static ClientBean toClientDTO(ClientDTO clientDTO) {
		if(null==clientDTO) throw new IllegalArgumentException("Le client ne peut pas être null");
		return ClientBean.builder()
				.code(clientDTO.getCode())
				.codeClient(clientDTO.getCodeClient())
				.nom(clientDTO.getNom())
				.prenom(clientDTO.getPrenom())
				.dateNaissance(clientDTO.getDateNaissance())
				.photo(clientDTO.getPhoto())
				.telephone(clientDTO.getTelephone())
				.email(clientDTO.getEmail())
				.adresse(AdresseDTO.toAdresseDTO(clientDTO.getAdresse()))
				.build();
	}
}
