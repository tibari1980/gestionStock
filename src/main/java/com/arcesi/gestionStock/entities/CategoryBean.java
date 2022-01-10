package com.arcesi.gestionStock.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * Ingénieur Dev
 */
@Builder
@Entity
@Table(name="CATEGORIE",
          uniqueConstraints = {
        		  @UniqueConstraint(columnNames ="CODE_CATEGORIE" ,name="CODE_CATEGORIE_SEQU"),
        		  @UniqueConstraint(columnNames = "CODE_UNIQUE_CATEGORIE",name = "CODE_UNIQUE_CATEGORIE_SEQU")
          })
@Setter @Getter @NoArgsConstructor @AllArgsConstructor @ToString
@EqualsAndHashCode(callSuper = true)
public class CategoryBean extends AbstractEntity  {

	 
	private static final long serialVersionUID = 5749431101269951781L;
	@SequenceGenerator(allocationSize = 1,
			           sequenceName = "categorie_sequence",
			           name="categorie_sequence"
			           )
	@Id
	@GeneratedValue(
			         generator = "categorie_sequence",
	                 strategy = GenerationType.SEQUENCE
	                 )
	@Column(name="CODE_CATEGORIE")
	private Long code;
	
	@Column(name="CODE_UNIQUE_CATEGORIE",unique = true,nullable = false,insertable = true,length = 40)
	private String codeCategorie;
	
	@Column(name="DESIGNATION",length = 40,nullable = false,unique = true)
	private String designation;
	
	@OneToMany(mappedBy = "categoryBean",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<ArticleBean> articleBeans;
	
	@Column(name="identifiant_entreprise")
	private Integer idEntreprise;

}
