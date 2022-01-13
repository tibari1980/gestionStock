package com.arcesi.gestionStock.dto;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Collection;

import com.arcesi.gestionStock.entities.ClientBean;
import com.arcesi.gestionStock.request.ClientRequest;
import com.arcesi.gestionStock.response.ClientResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @author Mr zeroual tibari
 * ingénieur developpement
 */
@Setter
@Getter
public class ClientDTO extends AbstractEntityDTO{

	 
	private static final long serialVersionUID = -2959890218276800442L;
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
	
	@Builder
	public ClientDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeClient, String nom,
			String prenom, String email, AdresseDTO adresse, String telephone, String photo, LocalDate dateNaissance,
			Integer age, Collection<CommandeClientDTO> commandeClientDTOs) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeClient = codeClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.commandeClientDTOs = commandeClientDTOs;
	}
	
	
	public static ClientDTO fromEntity(ClientBean clientBean) {
		if(null==clientBean) throw new IllegalArgumentException("Le client ne peut pas être null");
	return ClientDTO.builder()
			.code(clientBean.getCode())
			.codeClient(clientBean.getCodeClient())
			.createdDate(clientBean.getCreatedDate())
			.lastUpdateDate(clientBean.getLastUpdateDate())
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
				.createdDate(clientDTO.getCreatedDate())
				.lastUpdateDate(clientDTO.getLastUpdateDate())
				.nom(clientDTO.getNom())
				.prenom(clientDTO.getPrenom())
				.dateNaissance(clientDTO.getDateNaissance())
				.photo(clientDTO.getPhoto())
				.telephone(clientDTO.getTelephone())
				.email(clientDTO.getEmail())
				.adresse(AdresseDTO.toAdresseDTO(clientDTO.getAdresse()))
				.build();
	}


	public static ClientResponse toClientResponse(ClientDTO clientDTO) {
		if(null==clientDTO) throw new IllegalArgumentException("Le client ne peut pas être null");
		return ClientResponse.builder()
				.code(clientDTO.getCode())
				.codeClient(clientDTO.getCodeClient())
				.createdDate(clientDTO.getCreatedDate())
				.lastUpdateDate(clientDTO.getLastUpdateDate())
				.nom(clientDTO.getNom())
				.prenom(clientDTO.getPrenom())
				.dateNaissance(clientDTO.getDateNaissance())
				.photo(clientDTO.getPhoto())
				.telephone(clientDTO.getTelephone())
				.email(clientDTO.getEmail())
				.adressResponse(AdresseDTO.DtoToResponse(clientDTO.getAdresse()))
				.build();
	}
	
	public static ClientDTO clientRequestToClientDto(ClientRequest clientRequest) {
		if(null==clientRequest) throw new IllegalArgumentException("Le client ne peut pas être null");
		return ClientDTO.builder()
				.code(clientRequest.getCode())
				.codeClient(clientRequest.getCodeClient())
				.createdDate(clientRequest.getCreatedDate())
				.lastUpdateDate(clientRequest.getLastUpdateDate())
				.nom(clientRequest.getNom())
				.prenom(clientRequest.getPrenom())
				.dateNaissance(clientRequest.getDateNaissance())
				.photo(clientRequest.getPhoto())
				.telephone(clientRequest.getTelephone())
				.email(clientRequest.getEmail())
				.adresse(AdresseDTO.requestToDTO(clientRequest.getAdresseRequest()))
				.build();
	}

}
