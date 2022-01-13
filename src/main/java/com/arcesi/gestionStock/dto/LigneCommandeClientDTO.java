package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.arcesi.gestionStock.entities.LigneCommandeClientBean;
import com.arcesi.gestionStock.request.LigneCommandeClientRequest;
import com.arcesi.gestionStock.response.LigneCommandeClientResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @author zeroual tibair
 * ingénieur developpement
 */
@Setter
@Getter
public class LigneCommandeClientDTO extends AbstractEntityDTO{

	 
	private static final long serialVersionUID = 7881768749743955240L;
	private Long code;
 	private String codeLigneCommandClient;
 	private ArticleDTO articleDTO;
 	private CommandeClientDTO commandeClientDTO;
	private BigDecimal quantite;
 	private BigDecimal prixUnitaire;
 	
 	
 	@Builder
 	public LigneCommandeClientDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeLigneCommandClient,
			ArticleDTO articleDTO, CommandeClientDTO commandeClientDTO, BigDecimal quantite, BigDecimal prixUnitaire) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandClient = codeLigneCommandClient;
		this.articleDTO = articleDTO;
		this.commandeClientDTO = commandeClientDTO;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
	}

 	/**
 	 * Convert LigneCommandeClientBean to LigneCommandeClientDTO
 	 * @param bean {@ LigneCommandeClientBean}
 	 * @return ligneCommandeClientDTO {@ LigneCommandeClientDTO}
 	 */
	public static LigneCommandeClientDTO fromEntity(LigneCommandeClientBean bean) {
		if(bean==null) throw new IllegalArgumentException("La ligne de commande client ne peut pas être null");
		return LigneCommandeClientDTO.builder()
				.code(bean.getCode())
				.codeLigneCommandClient(bean.getCodeLigneCommandClient())
				.createdDate(bean.getCreatedDate())
				.lastUpdateDate(bean.lastUpdateDate)
				.articleDTO(ArticleDTO.fromEntity(bean.getArticleBean()))
				.commandeClientDTO(CommandeClientDTO.formEntity(bean.getCommandeClientBean()))
				.quantite(bean.getQuantite())
				.prixUnitaire(bean.getPrixUnitaire())
				.build();

 	}
	/**
 	 * Convert LigneCommandeClientDTO to LigneCommandeClientBean
 	 * @param bean {@ LigneCommandeClientDTO}
 	 * @return ligneCommandeClientbean {@ LigneCommandeClientBean}
 	 */
 	public static LigneCommandeClientBean toLigneCommandeClientDTO(LigneCommandeClientDTO dto) {
 		if(null==dto) throw new IllegalArgumentException("La ligne commande client ne peut pas être null");
 	
 		return LigneCommandeClientBean.builder()
 				.code(dto.getCode())
 				.codeLigneCommandClient(dto.getCodeLigneCommandClient())
 				.createdDate(dto.getCreatedDate())
 				.lastUpdateDate(dto.getLastUpdateDate())
 				.articleBean(ArticleDTO.toArticleDTO(dto.getArticleDTO()))
 				.commandeClientBean(CommandeClientDTO.toCommandeClientDTO(dto.getCommandeClientDTO()))
 				.quantite(dto.getQuantite())
 				.prixUnitaire(dto.getPrixUnitaire())
 				.build();
 	}
 	
 	/**
 	 * Convert LigneCommandeClientDTO to LigneCommandeClientResponse
 	 * @param dto {@ LigneCommandeClientDTO}
 	 * @return ligneCommandeClientresponse {@ LigneCommandeClientResponse}
 	 */
 	public static LigneCommandeClientResponse DtoToResponse(LigneCommandeClientDTO dto) {
 		if(null==dto) throw new IllegalArgumentException("La ligne commande client ne peut pas être null");
 	
 		return LigneCommandeClientResponse.builder()
 				.code(dto.getCode())
 				.codeLigneCommandClient(dto.getCodeLigneCommandClient())
 				.createdDate(dto.getCreatedDate())
 				.lastUpdateDate(dto.getLastUpdateDate())
 				.articleResponse(ArticleDTO.ArticleDTOToArticleResponse(dto.getArticleDTO()))
 				.commandeClientResponse(CommandeClientDTO.dtoToResponse(dto.getCommandeClientDTO()))
 				.quantite(dto.getQuantite())
 				.prixUnitaire(dto.getPrixUnitaire())
 				.build();
 	}
 	
 	/**
 	 * Convert LigneCommandeClientRequest to LigneCommandeClientDTO
 	 * @param bean {@ LigneCommandeClientRequest}
 	 * @return ligneCommandeClientDTO {@ LigneCommandeClientDTO}
 	 */
	public static LigneCommandeClientDTO requestTodto(LigneCommandeClientRequest bean) {
		if(bean==null) throw new IllegalArgumentException("La ligne de commande client ne peut pas être null");
		return LigneCommandeClientDTO.builder()
				.code(bean.getCode())
				.codeLigneCommandClient(bean.getCodeLigneCommandClient())
				.createdDate(bean.getCreatedDate())
				.lastUpdateDate(bean.lastUpdateDate)
				.articleDTO(ArticleDTO.ArticleRequetToArticleDTO(bean.getArticleRequest()))
				.commandeClientDTO(CommandeClientDTO.requesteToDto(bean.getCommandeClientRequest()))
				.quantite(bean.getQuantite())
				.prixUnitaire(bean.getPrixUnitaire())
				.build();

 	}
}
