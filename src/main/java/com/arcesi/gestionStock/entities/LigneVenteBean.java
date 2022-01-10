package com.arcesi.gestionStock.entities;

import java.math.BigDecimal;

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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="LIGNE_VENTE",
		uniqueConstraints = {
				@UniqueConstraint(columnNames = "CODE_LIGNE_VENTE_UNIQUE",name="CODE_LIGNE_VENTE_UNIQUE_SEQUENCE"),
				@UniqueConstraint(columnNames = "CODE_LIGNE_VENTE",name = "CODE_LIGNE_VENTE_SEQUENCE")
		}
		)
@Builder
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString
@EqualsAndHashCode(callSuper = true)
public class LigneVenteBean extends AbstractEntity {

	 
	private static final long serialVersionUID = 4163626375175094791L;
	@SequenceGenerator(
			 allocationSize = 1,
			 sequenceName = "sequence_ligne_vente",
			 name="sequence_ligne_vente"
			)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "sequence_ligne_vente"
			)
	@Column(name="CODE_LIGNE_VENTE",nullable = false,unique = true)
	private Long code;
	@Column(name="CODE_LIGNE_VENTE_UNIQUE",length = 30,nullable = false,unique = true)
	private String codeLigneVente;
	
	@ManyToOne
	@JoinColumn(name="idVente")
	private VenteBean venteBean;
	@Column(name="QUANTITE")
	private BigDecimal quantite;
	
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;
}
