package com.arcesi.gestionStock.entities;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * Ingénieur developpement
 */
 
@Entity
@Table(name="VENTE",
        uniqueConstraints = {
        		@UniqueConstraint(columnNames = "CODE_VENTE_UNIQUE",name="CODE_VENTE_UNIQUE_SEQUENCE"),
        		@UniqueConstraint(columnNames = "CODE_VENTE",name="CODE_VENTE_SEQUENCE")
        }  
		)
@Setter @Getter  @ToString
@EqualsAndHashCode(callSuper = true)
public class VenteBean extends AbstractEntity{

	 
	private static final long serialVersionUID = 1663988274306739511L;
	@SequenceGenerator(
			allocationSize =1,
			sequenceName = "sequence_vente",
			name="sequence_vente"
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence_vente"
			)
	@Column(name="CODE_VENTE",nullable = false,unique = true)
	private Long code;
	@Column(name="CODE_VENTE_UNIQUE",length = 30,unique = true,nullable = false)
	private String codeVente;
	@Column(name="DATE_VENTE")
	private Instant dateVente;
	@Column(name="COMMENTAIRE")
	private String commentaire;
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;
	
	@Builder
	public VenteBean(Instant createdDate, Instant lastUpdateDate, Long code, String codeVente, Instant dateVente,
			String commentaire, Integer idEntreprise) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeVente = codeVente;
		this.dateVente = dateVente;
		this.commentaire = commentaire;
		this.idEntreprise = idEntreprise;
	}
	
	
	
	
}
