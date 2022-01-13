package com.arcesi.gestionStock.entities;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
 * @author ZEROUAL tibari
 * Ingénieur developpement
 */
@Entity
@Table(name="ROLE",
      uniqueConstraints = {
    		  @UniqueConstraint(columnNames = "CODE_ROLE_UNIQUE",name="CODE_ROLE_UNIQUE_SEQUENCE"),
    		  @UniqueConstraint(columnNames = "CODE_ROLE",name = "CODE_ROLE_SEQUENCE")
      }
		)
 
@Setter @Getter  @ToString @NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoleBean extends AbstractEntity {

	 
	private static final long serialVersionUID = -6459516379493562894L;
	@SequenceGenerator(
			allocationSize = 1,
			sequenceName = "sequence_role",
			name="sequence_role"
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator ="sequence_role"
			)
	@Column(name="CODE_ROLE",nullable = false,unique = true)
	private Long code;
	@Column(name="CODE_ROLE_UNIQUE",length = 40,unique = true,nullable = false)
	private String codeRole;
	@Column(name="LIBELLE_ROLE",length = 40)
	private String libelle;
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.MERGE,mappedBy = "roleBeans")
	private List<UtilisateurBean> utilisateurBeans=new ArrayList<UtilisateurBean>();
	@Builder
	public RoleBean(Instant createdDate, Instant lastUpdateDate, Long code, String codeRole, String libelle,
			List<UtilisateurBean> utilisateurBeans) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeRole = codeRole;
		this.libelle = libelle;
		this.utilisateurBeans = utilisateurBeans;
	}
	
	 
	
	
	
}
