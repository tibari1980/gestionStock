package com.arcesi.gestionStock.dto;

import java.math.BigDecimal;
import java.time.Instant;

import com.arcesi.gestionStock.entities.MouvementStockBean;
import com.arcesi.gestionStock.enums.TypeMouvementStockEnum;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author zeroual tibari
 * ingénieur develppement
 */
@Builder
@Data
public class MouvementStockDTO {

	private Long code;
 	private String codeMouvementStock;
 	private Instant dateMouvementStock;
 	private BigDecimal quantiteMS;
	private ArticleDTO articleDTO;
	private TypeMouvementStockEnum typeMVS;

   public static MouvementStockDTO fromEntity(MouvementStockBean bean) {
	   if(null==bean) throw new IllegalArgumentException("Le mouvement ne peut pas être null");
	   return MouvementStockDTO.builder()
			   .code(bean.getCode())
			   .codeMouvementStock(bean.getCodeMouvementStock())
			   .dateMouvementStock(bean.getDateMouvementStock())
			   .quantiteMS(bean.getQuantiteMS())
			   .articleDTO(ArticleDTO.fromEntity(bean.getArticleBean()))
			   .typeMVS(bean.getTypeMVS())
			   .build();
   }
   
   public static MouvementStockBean toMouvementStockDTO(MouvementStockDTO dto) {
	   if(null==dto) throw new IllegalArgumentException("Le mouvement ne peut pas être null");
	   return MouvementStockBean.builder()
			   .code(dto.getCode())
			   .codeMouvementStock(dto.getCodeMouvementStock())
			   .dateMouvementStock(dto.getDateMouvementStock())
			   .quantiteMS(dto.getQuantiteMS())
			   .articleBean(ArticleDTO.toArticleDTO(dto.getArticleDTO()))
			   .typeMVS(dto.getTypeMVS())
			   .build();
   }
}
