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

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * @author Mr Zeroual Tibari
 *Ingénieur Dev
 */
@Entity
@Table(name="LIGNE_COMMANDE_FOURNISSEUR",
         uniqueConstraints = {
        		 @UniqueConstraint(columnNames = "CODE_LIGNE_COMMANDE_FOURNISSEUR_UNIQUE",name="CODE_LIGNE_COMMANDE_FOURNISSEUR_UNIQUE_SEQUENCE"),
        		 @UniqueConstraint(columnNames = "CODE_LIGNE_COMMANDE_FOURNISSEUR",name="CODE_LIGNE_COMMANDE_FOURNISSEUR_SEQUENCE")
         }    
		)
 
@Setter @Getter   @ToString
@EqualsAndHashCode(callSuper = true)
public class LigneCommandeFournisseurBean extends AbstractEntity {

	 
	private static final long serialVersionUID = -8751340913152422066L;
	@SequenceGenerator(
			allocationSize = 1,
			sequenceName = "sequence_ligne_commande_fournisseur",
			name="sequence_ligne_commande_fournisseur"
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence_ligne_commande_fournisseur"
			)
	@Column(name="CODE_LIGNE_COMMANDE_FOURNISSEUR",nullable = false,unique = true)
	private Long code;
	@Column(name="CODE_LIGNE_COMMANDE_FOURNISSEUR_UNIQUE",length = 30,unique = true,nullable = false)
	private String codeLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private ArticleBean articleBean;
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseurBean commandeFournisseurBean;
	@Column(name="QUANTITE")
	private BigDecimal quantite;
	@Column(name="PRIX_UNITAIRE")
	private BigDecimal prixUnitaire;
	
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;

	@Builder
	public LigneCommandeFournisseurBean(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeLigneCommandeFournisseur, ArticleBean articleBean,
			CommandeFournisseurBean commandeFournisseurBean, BigDecimal quantite, BigDecimal prixUnitaire,
			Integer idEntreprise) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandeFournisseur = codeLigneCommandeFournisseur;
		this.articleBean = articleBean;
		this.commandeFournisseurBean = commandeFournisseurBean;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		this.idEntreprise = idEntreprise;
	}

	
	
}
