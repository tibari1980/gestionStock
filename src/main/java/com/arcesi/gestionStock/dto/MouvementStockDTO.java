package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.arcesi.gestionStock.entities.MouvementStockBean;
import com.arcesi.gestionStock.enums.TypeMouvementStockEnum;
import com.arcesi.gestionStock.request.MouvementStockRequest;
import com.arcesi.gestionStock.response.MouvementStockResponse;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author zeroual tibari
 * ingénieur develppement
 */
@Setter
@Getter
public class MouvementStockDTO extends AbstractEntityDTO {

	 
	private static final long serialVersionUID = -7894448321261008555L;
	private Long code;
 	private String codeMouvementStock;
 	private Instant dateMouvementStock;
 	private BigDecimal quantiteMS;
	private ArticleDTO articleDTO;
	private TypeMouvementStockEnum typeMVS;

	@Builder
	public MouvementStockDTO(Instant createdDate, Instant lastUpdateDate, Long code, String codeMouvementStock,
			Instant dateMouvementStock, BigDecimal quantiteMS, ArticleDTO articleDTO, TypeMouvementStockEnum typeMVS) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeMouvementStock = codeMouvementStock;
		this.dateMouvementStock = dateMouvementStock;
		this.quantiteMS = quantiteMS;
		this.articleDTO = articleDTO;
		this.typeMVS = typeMVS;
	}
  
	/**
	 * Convert MouvementStockBean to MouvementStockDTO
	 * @param bean {@ MouvementStockBean}
	 * @return mouvementStock {@ MouvementStockDTO}
	 */
	public static MouvementStockDTO fromEntity(MouvementStockBean bean) {
	   if(null==bean) throw new IllegalArgumentException("Le mouvement ne peut pas être null");
	   return MouvementStockDTO.builder()
			   .code(bean.getCode())
			   .codeMouvementStock(bean.getCodeMouvementStock())
			   .createdDate(bean.getCreatedDate())
			   .lastUpdateDate(bean.getLastUpdateDate())
			   .dateMouvementStock(bean.getDateMouvementStock())
			   .quantiteMS(bean.getQuantiteMS())
			   .articleDTO(ArticleDTO.fromEntity(bean.getArticleBean()))
			   .typeMVS(bean.getTypeMVS())
			   .build();
   }
   /**
    * Convert {@link MouvementStockDTO} to {@link MouvementStockBean}
    * @param dto {@ MouvementStockDTO}
    * @return bean {@ MouvementStockBean}
    */
   public static MouvementStockBean toMouvementStockDTO(MouvementStockDTO dto) {
	   if(null==dto) throw new IllegalArgumentException("Le mouvement ne peut pas être null");
	   return MouvementStockBean.builder()
			   .code(dto.getCode())
			   .codeMouvementStock(dto.getCodeMouvementStock())
			   .createdDate(dto.getCreatedDate())
			   .lastUpdateDate(dto.getLastUpdateDate())
			   .dateMouvementStock(dto.getDateMouvementStock())
			   .quantiteMS(dto.getQuantiteMS())
			   .articleBean(ArticleDTO.toArticleDTO(dto.getArticleDTO()))
			   .typeMVS(dto.getTypeMVS())
			   .build();
   }

   /**
    * Convert {@link MouvementStockDTO} to {@link MouvementStockBean}
    * @param dto {@ MouvementStockDTO}
    * @return bean {@ MouvementStockResponse}
    */
   public static MouvementStockResponse DtoToResponse(MouvementStockDTO dto) {
	   if(null==dto) throw new IllegalArgumentException("Le mouvement ne peut pas être null");
	   return MouvementStockResponse.builder()
			   .code(dto.getCode())
			   .codeMouvementStock(dto.getCodeMouvementStock())
			   .createdDate(dto.getCreatedDate())
			   .lastUpdateDate(dto.getLastUpdateDate())
			   .dateMouvementStock(dto.getDateMouvementStock())
			   .quantiteMS(dto.getQuantiteMS())
			   .articleResponse(ArticleDTO.ArticleDTOToArticleResponse(dto.getArticleDTO()))
			   .typeMVS(dto.getTypeMVS())
			   .build();
   }
   
   /**
    * Convert {@link MouvementStockDTO} to {@link MouvementStockBean}
    * @param dto {@ MouvementStockRequest}
    * @return bean {@ MouvementStockDTO}
    */
   public static MouvementStockDTO requestToDto(MouvementStockRequest dto) {
	   if(null==dto) throw new IllegalArgumentException("Le mouvement ne peut pas être null");
	   return MouvementStockDTO.builder()
			   .code(dto.getCode())
			   .codeMouvementStock(dto.getCodeMouvementStock())
			   .createdDate(dto.getCreatedDate())
			   .lastUpdateDate(dto.getLastUpdateDate())
			   .dateMouvementStock(dto.getDateMouvementStock())
			   .quantiteMS(dto.getQuantiteMS())
			   .articleDTO(ArticleDTO.ArticleRequetToArticleDTO(dto.getArticleRequest()))
			   .typeMVS(dto.getTypeMVS())
			   .build();
   }

}
