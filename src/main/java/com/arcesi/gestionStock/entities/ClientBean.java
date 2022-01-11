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
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * @author Mr Zeroual Tibari
 *Ingénieur developpement
 */
@Entity
@Table(name="CLIENT",
             uniqueConstraints = {
            		 @UniqueConstraint(columnNames = "CODE_CLIENT",name="CODE_CLIENT_SEQUENCE"),
            		 @UniqueConstraint(columnNames = "EMAIL",name="EMAIL_CLIENT_SEQUENCE"),
            		 @UniqueConstraint(columnNames = "CODE_CLIENT_UNIQUE",name="CODE_CLIENT_UNIQUE_SEQUENCE")
             })

@Getter @Setter @ToString
@EqualsAndHashCode(callSuper = true)

public class ClientBean extends AbstractEntity {
	
	 
	private static final long serialVersionUID = 8707206654773852362L;

	@SequenceGenerator(
			             allocationSize = 1,
			             sequenceName = "client_sequence",
			             name="client_sequence"
			             )
	@Id
	@GeneratedValue(
			          strategy = GenerationType.SEQUENCE,
	                  generator = "client_sequence"
	                )
	@Column(name="CODE_CLIENT",nullable = false,unique = true)
	private Long code;
	@Column(name="CODE_CLIENT_UNIQUE",length = 30,unique = true,nullable = false)
	private String codeClient;
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
	@Transient
	private Integer age;
	@OneToMany(mappedBy = "clientBean")
	private Collection<CommandeClientBean> clientBeans;
	
	public Integer getAge() {
		return Period.between(dateNaissance, LocalDate.now()).getYears();
	}

	@Builder
	public ClientBean(Instant createdDate, Instant lastUpdateDate, Long code, String codeClient, String nom,
			String prenom, String email, AdresseBean adresse, String telephone, String photo, LocalDate dateNaissance,
			Integer age, Collection<CommandeClientBean> clientBeans) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeClient = codeClient;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
		this.photo = photo;
		this.dateNaissance = dateNaissance;
		this.age = age;
		this.clientBeans = clientBeans;
	}

	 
	
	
}
