package com.arcesi.gestionStock.request;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur developpement
 */
@Data
public class CategoryRequest {
	
	private Long code;
	private String codeCategorie;
	private String designation;
	@JsonIgnore
	private Collection<ArticleRequest> articleRequests;

}
