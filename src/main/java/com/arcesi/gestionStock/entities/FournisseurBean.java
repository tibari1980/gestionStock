package com.arcesi.gestionStock.entities;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="FOURNISSEUR",
         uniqueConstraints = {
        		 @UniqueConstraint(columnNames = "CODE_FOURNISSEUR",name = "CODE_FOURNISSEUR_SEQUENCE"),
        		 @UniqueConstraint(columnNames = "CODE_FOURNISSEUR_UNIQUE",name = "CODE_FOURNISSEUR_UNIQUE_SEQUENCE")
         }
		)
 
@Setter @Getter  @ToString @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class FournisseurBean  extends AbstractEntity{

	 
	private static final long serialVersionUID = 4322643353539770366L;
	@SequenceGenerator(
			allocationSize = 1,
			sequenceName = "sequence_fournisseur",
			name = "sequence_fournisseur"
			)
	@Id 
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence_fournisseur"
			)
	@Column(name="CODE_FOURNISSEUR",nullable = false,unique = true)
	private Long code;
	@Column(name="CODE_FOURNISSEUR_UNIQUE",length = 40,nullable = false,unique = true)
	private String codeFournisseur;
	@Column(name="NOM",length = 40,insertable = true,updatable = true)
	private String nom;
	@Column(name="PRENOM",length = 40,insertable = true,updatable = true)
	private String prenom;
	@Column(name="EMAIL",length = 100,nullable = false, unique = true, insertable = true,updatable = true)
	private String email;
	@Embedded
	private AdresseBean adresse;
	@Column(name="TELEPHONE")
	private String telephone;
	@Column(name="PHOTO")
	private String photo;
	@Column(name="DATE_NAISSANCE")
	private LocalDate dateNaissance;
	@Column(name="AGE")
	private Integer age;
	@OneToMany(mappedBy = "fournisseurBean")
	private Collection<CommandeFournisseurBean> commandeFournisseurBeans;
	
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;
	
	
	public Integer getAge() {
		return Period.between(dateNaissance, LocalDate.now()).getYears();
	}


	@Builder
	public FournisseurBean(Instant createdDate, Instant lastUpdateDate, Long code, String codeFournisseur, String nom,
			String prenom, String email, AdresseBean adresse, String telephone, String photo, LocalDate dateNaissance,
			Integer age, Collection<CommandeFournisseurBean> commandeFournisseurBeans, Integer idEntreprise) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeFournisseur = codeFournisseur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.commandeFournisseurBeans = commandeFournisseurBeans;
		this.idEntreprise = idEntreprise;
	}


	
	
}
