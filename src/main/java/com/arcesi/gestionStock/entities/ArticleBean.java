package com.arcesi.gestionStock.entities;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * 
 * @author Tibari Zeroual Ingénieur Dev
 */

@Entity
@Table(name = "ARTICLE", uniqueConstraints = { @UniqueConstraint(name = "article_code", columnNames = "CODE_ARTICLE"),
		@UniqueConstraint(name = "article_code_unique", columnNames = "CODE_ARTICLE_UNIQUE") })
@ToString
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class ArticleBean extends AbstractEntity {

	private static final long serialVersionUID = -8254348325808131943L;
	@SequenceGenerator(allocationSize = 1, sequenceName = "article_sequence", name = "article_sequence")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_sequence")
	@Column(name = "CODE_ARTICLE", nullable = false, unique = true)
	private Long code;
	@Column(name = "CODE_ARTICLE_UNIQUE", length = 20, unique = true)
	private String codeArticle;
	@Column(name = "DESIGNATION", length = 30, insertable = true, updatable = true)
	private String designation;
	@Column(name = "PRIX_UNITAIRE_HT")
	private BigDecimal prixUnitaireHt;
	@Column(name = "TAUX_TVA")
	private BigDecimal tauxTva;
	@Column(name = "PRIX_TTC")
	private BigDecimal prixTTC;
	@Column(name = "PHOTO_ARTICLE")
	private String photoArticle;
	@ManyToOne
	@JoinColumn(name = "idCategorie")
	private CategoryBean categoryBean;

	@Column(name = "identifiant_entreprise")
	private Integer idEntreprise;

	@OneToMany(mappedBy = "articleBean")
	private List<LigneCommandeClientBean> ligneCommandeClientBeans;
	@OneToMany(mappedBy = "articleBean")
	private List<MouvementStockBean> mouvementStockBeans;

	@Builder
	public ArticleBean(Instant createdDate, Instant lastUpdateDate, Long code, String codeArticle, String designation,
			BigDecimal prixUnitaireHt, BigDecimal tauxTva, BigDecimal prixTTC, String photoArticle,
			CategoryBean categoryBean, Integer idEntreprise, List<LigneCommandeClientBean> ligneCommandeClientBeans,
			List<MouvementStockBean> mouvementStockBeans) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeArticle = codeArticle;
		this.designation = designation;
		this.prixUnitaireHt = prixUnitaireHt;
		this.tauxTva = tauxTva;
		this.prixTTC = prixTTC;
		this.photoArticle = photoArticle;
		this.categoryBean = categoryBean;
		this.idEntreprise = idEntreprise;
		this.ligneCommandeClientBeans = ligneCommandeClientBeans;
		this.mouvementStockBeans = mouvementStockBeans;
	}

}
