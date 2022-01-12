package com.arcesi.gestionStock.entities;

import java.time.Instant;
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
import javax.persistence.UniqueConstraint;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * @author tibari ZEROUAL
 * Ingénieur développement 
 */
@Entity
@Table(name="ENTREPRISE",
         uniqueConstraints = {
        		 @UniqueConstraint(columnNames = "CODE_ENTREPRISE_UNIQUE" ,name="CODE_ENTREPRISE_SEQUENCE"),
        		 @UniqueConstraint(columnNames = "CODE_ENTREPRISE",name="CODE_ENTREPRISE_SEQUENCE")
         }   
		)
@Setter @Getter  @ToString @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EntrepriseBean extends AbstractEntity {

	 
	private static final long serialVersionUID = 168273467426619035L;
	@SequenceGenerator(
			allocationSize = 1,
			sequenceName = "sequence_entreprise",
			name="sequence_entreprise"
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence_entreprise"
			)
	@Column(name="CODE_ENTREPRISE",unique = true,nullable = false)
	private Long code;
	@Column(name="CODE_ENTREPRISE_UNIQUE",length = 40,unique = true,nullable = false)
	private String codeEntreprise;
	@Column(name="RAISON_SOCIALE")
	private String raisonSocial;
	@Column(name="SIRET")
	private String siret;
	@Column(name="NUMERO_TVA")
	private String numeroTVA;
	@Embedded
	private AdresseBean adresseBean;
	@Column(name="EMAIL",unique = true)
	private String email;
	@Column(name="TELEPHONE")
	private String telephone;
	@OneToMany(mappedBy = "entrepriseBean")
	private Collection<UtilisateurBean> utilisateurBeans;
	
	@Builder
	public EntrepriseBean(Instant createdDate, Instant lastUpdateDate, Long code, String codeEntreprise,
			String raisonSocial, String siret, String numeroTVA, AdresseBean adresseBean, String email,
			String telephone, Collection<UtilisateurBean> utilisateurBeans) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeEntreprise = codeEntreprise;
		this.raisonSocial = raisonSocial;
		this.siret = siret;
		this.numeroTVA = numeroTVA;
		this.adresseBean = adresseBean;
		this.email = email;
		this.telephone = telephone;
		this.utilisateurBeans = utilisateurBeans;
	}
	
	
}
