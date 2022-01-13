package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.arcesi.gestionStock.entities.LigneCommandeFournisseurBean;
import com.arcesi.gestionStock.request.LigneCommandeFournisseurRequest;
import com.arcesi.gestionStock.response.LigneCommandeFournisseurReponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author ZEROUAL TIBARI
 * ingénieur developpement
 */
@Setter
@Getter
public class LigneCommandeFournisseurDTO extends AbstractEntityDTO {
	

 
	private static final long serialVersionUID = 1732269553653728300L;
	private Long code;
 	private String codeLigneCommandeFournisseur;
	private ArticleDTO articleDTO;
	private CommandeFournisseurDTO commandeFournisseurDTO;
	private BigDecimal quantite;
	private BigDecimal prixUnitaire;
	
	@Builder
	public LigneCommandeFournisseurDTO(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeLigneCommandeFournisseur, ArticleDTO articleDTO, CommandeFournisseurDTO commandeFournisseurDTO,
			BigDecimal quantite, BigDecimal prixUnitaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandeFournisseur = codeLigneCommandeFournisseur;
		this.articleDTO = articleDTO;
		this.commandeFournisseurDTO = commandeFournisseurDTO;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}

	/**
	 * Convert LigneCommandeFournisseurBean to LigneCommandeFournisseurDto
	 * @param bean {@ LigneCommandeFournisseurBean}
	 * @return ligneCommandeFournisseur {@ LigneCommandeFournisseurDTO}
	 */
	public static LigneCommandeFournisseurDTO fromEntity(LigneCommandeFournisseurBean bean) {
		if(bean==null) throw new IllegalArgumentException("La ligne commande fourniseur ne peut pas être null");
        return LigneCommandeFournisseurDTO.builder()
        		.code(bean.getCode())
        		.codeLigneCommandeFournisseur(bean.getCodeLigneCommandeFournisseur())
        		.createdDate(bean.getCreatedDate())
        		.lastUpdateDate(bean.getLastUpdateDate())
        		.articleDTO(ArticleDTO.fromEntity(bean.getArticleBean()))
        		.commandeFournisseurDTO(CommandeFournisseurDTO.fromEntity(bean.getCommandeFournisseurBean()))
        		.quantite(bean.getQuantite())
        		.prixUnitaire(bean.getPrixUnitaire())
        		.build();
	}
	/**
	 * Convert LigneCommandeFournisseurDTO to LigneCommandeFournisseurBean
	 * @param dto {@ LigneCommandeFournisseurDTO}
	 * @return ligneCommandeFournisseur {@ LigneCommandeFournisseurBean}
	 */
	public static LigneCommandeFournisseurBean toLigneCommandeFournisseurDTO(LigneCommandeFournisseurDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La ligne commande fourniseur ne peut pas être null");
         return LigneCommandeFournisseurBean.builder()
        		 .code(dto.getCode())
        		 .codeLigneCommandeFournisseur(dto.getCodeLigneCommandeFournisseur())
        		 .articleBean(ArticleDTO.toArticleDTO(dto.getArticleDTO()))
        		 .createdDate(dto.getCreatedDate())
        		 .lastUpdateDate(dto.getLastUpdateDate())
        		 .commandeFournisseurBean(CommandeFournisseurDTO.toCommandeFournisseurDTO(dto.getCommandeFournisseurDTO()))
        		 .quantite(dto.getQuantite())
        		 .prixUnitaire(dto.getPrixUnitaire())
        		 .build();
	}
	
	/**
	 * Convert LigneCommandeFournisseurDTO to LigneCommandeFournisseurResponse
	 * @param dto {@ LigneCommandeFournisseurDTO}
	 * @return ligneCommandeFournisseur {@ LigneCommandeFournisseurRes}
	 */
	public static LigneCommandeFournisseurReponse dtoToRespone(LigneCommandeFournisseurDTO dto) {
		if(dto==null) throw new IllegalArgumentException("La ligne commande fourniseur ne peut pas être null");
         return LigneCommandeFournisseurReponse .builder()
        		 .code(dto.getCode())
        		 .codeLigneCommandeFournisseur(dto.getCodeLigneCommandeFournisseur())
        		 .articleResponse(ArticleDTO.ArticleDTOToArticleResponse(dto.getArticleDTO()))
        		 .createdDate(dto.getCreatedDate())
        		 .lastUpdateDate(dto.getLastUpdateDate())
        		 .commandeFournisseurResponse(CommandeFournisseurDTO.DtoToResponse(dto.getCommandeFournisseurDTO()))
        		 .quantite(dto.getQuantite())
        		 .prixUnitaire(dto.getPrixUnitaire())
        		 .build();
	}
	
	/**
	 * Convert LigneCommandeFournisseurRequest to LigneCommandeFournisseurDto
	 * @param dto {@ LigneCommandeFournisseurRequest}
	 * @return ligneCommandeFournisseur {@ LigneCommandeFournisseurDTO}
	 */
	public static LigneCommandeFournisseurDTO requestToDto(LigneCommandeFournisseurRequest dto) {
		if(dto==null) throw new IllegalArgumentException("La ligne commande fourniseur ne peut pas être null");
         return LigneCommandeFournisseurDTO.builder()
        		 .code(dto.getCode())
        		 .codeLigneCommandeFournisseur(dto.getCodeLigneCommandeFournisseur())
        		 .articleDTO(ArticleDTO.ArticleRequetToArticleDTO(dto.getArticRequest()))
        		 .createdDate(dto.getCreatedDate())
        		 .lastUpdateDate(dto.getLastUpdateDate())
        		 .commandeFournisseurDTO(CommandeFournisseurDTO.requestToDTO(dto.getCommandeFournisseurRequest()))
        		 .quantite(dto.getQuantite())
        		 .prixUnitaire(dto.getPrixUnitaire())
        		 .build();
	}
	
}
