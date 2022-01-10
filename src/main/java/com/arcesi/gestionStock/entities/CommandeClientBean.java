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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
/**
 * 
 * @author Tibari Zeroual
 * Ingénieur Développement
 */
@Entity
@Table(name="COMMANDE_CLIENT",
          uniqueConstraints = {
        		  @UniqueConstraint(columnNames = "CODE_COMMANDE_CLIENT",name="CODE_COMMANDE_CLIENT_SEQUENCE"),
        		  @UniqueConstraint(columnNames = "CODE_COMMANDE_CLIENT_UNIQUE",name ="CODE_COMMANDE_CLIENT_UNIQUE_SEQUENCE" )
          })
@Builder
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString
@EqualsAndHashCode(callSuper = true)
public class CommandeClientBean extends AbstractEntity{

 
	private static final long serialVersionUID = 1130502977763763475L;
	@SequenceGenerator(allocationSize = 1,sequenceName = "sequence_commandeClient",name = "sequence_commandeClient")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="sequence_commandeClient")
	@Column(name="CODE_COMMANDE_CLIENT",nullable = false,updatable = false,unique = true)
	private Long code;
	@Column(name="CODE_COMMANDE_CLIENT_UNIQUE",length = 30,unique = true,nullable = false)
	private String codeCommandeClient;
	
	private Instant dateCommande;
	@ManyToOne
	@JoinColumn(name="idClient")
	private ClientBean clientBean;
	@OneToMany(mappedBy = "commandeClientBean")
	private Collection<LigneCommandeClientBean> ligneCommandeClientBeans;
	
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;
}
