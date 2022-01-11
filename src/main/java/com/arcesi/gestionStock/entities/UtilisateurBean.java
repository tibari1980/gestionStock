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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * @author Mr Zeroual Tibari
 *Ingénieur developpement
 */
@Entity
@Table(name="UTILISATEUR",
        uniqueConstraints = {
        		@UniqueConstraint(columnNames = "CODE_UTILISATEUR_UNIQUE",name = "CODE_UTILISATEUR_UNIQUE_SEQUENCE"),
        		@UniqueConstraint(columnNames = "CODE_UTILISATEUR",name = "CODE_UTILISATEUR_SEQUENCE")
        }

		)
 
@Setter @Getter   @ToString
@EqualsAndHashCode(callSuper = true)
public class UtilisateurBean extends AbstractEntity {

	 
	private static final long serialVersionUID = -1393990188302275521L;
	@SequenceGenerator(
			  allocationSize = 1,
			  sequenceName = "sequence_utilisateur",
			  name="sequence_utilisateur"
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence_utilisateur"
			)
	@Column(name="CODE_UTILISATEUR",nullable = false,unique = true)
	private Long code;
	@Column(name="CODE_UTILISATEUR_UNIQUE",unique = true,nullable = false)
	private String codeUtilisateur;
	
	@Column(name="NOM",length = 40,insertable = true,updatable = true)
	private String nom;
	@Column(name="PRENOM",length = 40,insertable = true,updatable = true)
	private String prenom;
	@Column(name="EMAIL",length = 100,nullable = false, unique = true, insertable = true,updatable = true)
	private String email;
	@Column(name="PASSWORD",nullable = false,insertable = true)
	private String password;
	@Embedded
	private AdresseBean adresse;
	@Column(name="TELEPHONE")
	private String telephone;
	@Column(name="PHOTO")
	private String photo;
	@Column(name="DATE_NAISSANCE")
	private LocalDate dateNaissance;
	@Column(name="AGE")
	@Transient
	private Integer age;
	
	@ManyToOne
	@JoinColumn(name="idEntreprise")
	private EntrepriseBean entrepriseBean;
	
	@OneToMany(mappedBy = "utilisateurBean")
	private Collection<RoleBean> roleBeans;
	
	//permet de calculer l'age 
	
	public Integer getAge() {
		return Period.between(this.dateNaissance, LocalDate.now()).getYears();
	}

	@Builder
	public UtilisateurBean(Instant createdDate, Instant lastUpdateDate, Long code, String codeUtilisateur, String nom,
			String prenom, String email, String password, AdresseBean adresse, String telephone, String photo,
			LocalDate dateNaissance, Integer age, EntrepriseBean entrepriseBean, Collection<RoleBean> roleBeans) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeUtilisateur = codeUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.adresse = adresse;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.entrepriseBean = entrepriseBean;
		this.roleBeans = roleBeans;
	}

	
	
}
