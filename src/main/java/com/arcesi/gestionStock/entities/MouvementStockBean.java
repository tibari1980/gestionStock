package com.arcesi.gestionStock.entities;

import java.math.BigDecimal;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.arcesi.gestionStock.enums.TypeMouvementStockEnum;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * @author Mr Zeroual Tibari
 * Ingénieur Developpement
 */
@Entity
@Table(name="MOUVEMENT_STOCK",
        uniqueConstraints = {
        		@UniqueConstraint(columnNames = "CODE_MOUVEMENT_STOCK_UNIQUE",name="CODE_MOUVEMENT_STOCK_UNIQUE_SEQUENCE"),
        		@UniqueConstraint(columnNames = "CODE_MOUVEMENT_STOCK",name="CODE_MOUVEMENT_STOCK_SEQUENCE")
        }
		)
@Builder
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString
@EqualsAndHashCode(callSuper = true)
public class MouvementStockBean extends AbstractEntity{
 
	
	private static final long serialVersionUID = 6714629816780542489L;
	@SequenceGenerator(
			allocationSize = 1,
			sequenceName = "sequence_mouvement_stock",
			name="sequence_mouvement_stock"
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence_mouvement_stock"
			)
	@Column(name="CODE_MOUVEMENT_STOCK",nullable = false,unique = true)
	private Long code;
	@Column(name="CODE_MOUVEMENT_STOCK_UNIQUE",length = 30,nullable = false,unique = true)
	private String codeMouvementStock;
	
	@Column(name="DATE_MOUVMENT_STOCK")
	private Instant dateMouvementStock;
	@Column(name="QUANTITE_MVS")
	private BigDecimal quantiteMS;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private ArticleBean articleBean;
	@Column(name="TYPE_MOUVMENT_STOCK")
	private TypeMouvementStockEnum typeMVS;
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;
}
