package com.arcesi.gestionStock.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@Builder
@NoArgsConstructor @AllArgsConstructor  @ToString
@EqualsAndHashCode
@Embeddable
public class AdresseBean {
	
	@Column(name="ADRESSE_1",length = 100,insertable = true,updatable = true)
	private String firstAdresse;
	@Column(name="ADRESSE_2",length = 100,insertable = true,updatable = true)
	private String secondeAdresse;
	@Column(name="VILLE",length = 40)
	private String ville;
	@Column(name="CODE_POSTALE",insertable = true,updatable = true)
	private String codePostale;
	@Column(name="PAYS",insertable = true,updatable = true)
	private String pays;
	@Column(name="TYPE_ADRESSE")
	private String typeAdresse;
	
	
	
	
	
	
	
	


}
