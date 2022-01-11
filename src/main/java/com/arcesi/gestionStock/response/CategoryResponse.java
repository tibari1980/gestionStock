package com.arcesi.gestionStock.response;

import java.util.Collection;

import lombok.Data;
/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur developpement
 */
@Data
public class CategoryResponse {
	
	private Long code;
	private String codeCategorie;
	private String designation;
	private Collection<ArticleResponse> articleResponses;

}
