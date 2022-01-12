package com.arcesi.gestionStock.entities;

import java.time.Instant;
import java.util.Collection;

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
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="COMMANDE_FOURNISSEUR",
            uniqueConstraints = {
            		@UniqueConstraint(columnNames = "CODE_COMMANDE_FOUNISSEUR_UNIQUE",name = "CODE_COMMANDE_FOUNISSEUR_UNIQUE_SEQUENCE"),
            		@UniqueConstraint(columnNames = "CODE_COMMANDE_FOURNISSEUR",name="CODE_COMMANDE_FOURNISSEUR_SEQUENCE")
            })
@ToString @Getter @Setter @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CommandeFournisseurBean  extends AbstractEntity{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5051567884656109032L;
	@SequenceGenerator(
			          allocationSize = 1,
			          sequenceName = "sequence_commande_fournisseur",
			          name = "sequence_commande_fournisseur"
			          )
	@Id 
	@GeneratedValue(
			         strategy = GenerationType.SEQUENCE,
			     	generator = "sequence_commande_fournisseur"
			        )
	@Column(name="CODE_COMMANDE_FOURNISSEUR",unique = true,nullable = false)
	private Long code;
	@Column(name="CODE_COMMANDE_FOUNISSEUR_UNIQUE",length = 40,unique = true,nullable = false)
	private String codeCommandeFounisseur;
	@Column(name="DATE_COMMANDE")
	private Instant dateCommande;
	@ManyToOne
	@JoinColumn(name="idFournisseur")
	private FournisseurBean fournisseurBean;
	@OneToMany(mappedBy = "commandeFournisseurBean")
	private Collection<LigneCommandeFournisseurBean> ligneCommandeFournisseurBeans;
	
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;

	@Builder
	public CommandeFournisseurBean(Instant createdDate, Instant lastUpdateDate, Long code,
			String codeCommandeFounisseur, Instant dateCommande, FournisseurBean fournisseurBean,
			Collection<LigneCommandeFournisseurBean> ligneCommandeFournisseurBeans, Integer idEntreprise) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCommandeFounisseur = codeCommandeFounisseur;
		this.dateCommande = dateCommande;
		this.fournisseurBean = fournisseurBean;
		this.ligneCommandeFournisseurBeans = ligneCommandeFournisseurBeans;
		this.idEntreprise = idEntreprise;
	}

	

	
}
