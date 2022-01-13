package com.arcesi.gestionStock.response;

import java.time.Instant;
import java.util.Collection;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
/**
 * 
 * @author ZEROUAL TIBARI
 *	ingénieur developpement
 */
@Getter @Setter
public class CategoryResponse  extends AbstractEntityResponse{
	
	 
	private static final long serialVersionUID = -2823967670695402206L;
	private Long code;
	private String codeCategorie;
	private String designation;
	private Collection<ArticleResponse> articleResponses;
	
	@Builder
	public CategoryResponse(Instant createdDate, Instant lastUpdateDate, Long code, String codeCategorie,
			String designation, Collection<ArticleResponse> articleResponses) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCategorie = codeCategorie;
		this.designation = designation;
		this.articleResponses = articleResponses;
	}
	
	
	
	

}
