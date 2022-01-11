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
 * @author Zeroual tibari
 *  Ingénieur Dev
 */
@Entity
@Table(name="LIGNE_COMMAND_CLIENT",
        uniqueConstraints = {
        		@UniqueConstraint(columnNames = "CODE_LIGNE_COMMANDE_CLIENT_UNIQUE",name="CODE_LIGNE_COMMANDE_CLIENT_UNIQUE_SEQUENCE"),
        		@UniqueConstraint(columnNames = "CODE_LIGNE_COMMANDE_CLIENT",name="CODE_LIGNE_COMMANDE_CLIENT_SEQUENCE")
        }     
		)
@Setter @Getter  @ToString
@EqualsAndHashCode(callSuper = true)
public class LigneCommandeClientBean  extends AbstractEntity{

	
	private static final long serialVersionUID = 1238022276676325440L;
	@SequenceGenerator(
			allocationSize = 1,
			sequenceName = "sequence_ligne_commande_client",
			name="sequence_ligne_commande_client"
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence_ligne_commande_client"
			)
	@Column(name="CODE_LIGNE_COMMANDE_CLIENT",unique = true,nullable = false)
	private Long code;
	@Column(name="CODE_LIGNE_COMMANDE_CLIENT_UNIQUE",length = 30,nullable = false,unique = true)
	private String codeLigneCommandClient;
	@ManyToOne
	@JoinColumn(name="idArticle")
	private ArticleBean articleBean;
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private CommandeClientBean commandeClientBean;
	
	@Column(name="QUANTITE")
	private BigDecimal quantite;
	@Column(name="PRIX_UNITAIRE")
	private BigDecimal prixUnitaire;
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;
	
	@Builder
	public LigneCommandeClientBean(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeLigneCommandClient, ArticleBean articleBean, CommandeClientBean commandeClientBean,
			BigDecimal quantite, BigDecimal prixUnitaire, Integer idEntreprise) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeLigneCommandClient = codeLigneCommandClient;
		this.articleBean = articleBean;
		this.commandeClientBean = commandeClientBean;
		this.quantite = quantite;
		this.prixUnitaire = prixUnitaire;
		this.idEntreprise = idEntreprise;
	}
	
	
	
	
}
