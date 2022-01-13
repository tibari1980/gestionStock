package com.arcesi.gestionStock.request;

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
public class CategoryRequest extends AbstractEntityRequest {
	
	 
	private static final long serialVersionUID = -7691816797478532162L;
	private Long code;
	private String codeCategorie;
	private String designation;
	private Collection<ArticleRequest> articleRequests;
	
	@Builder
	public CategoryRequest(Instant createdDate, Instant lastUpdateDate, Long code, String codeCategorie,
			String designation, Collection<ArticleRequest> articleRequests) {
		super(createdDate, lastUpdateDate);
		this.code = code;
		this.codeCategorie = codeCategorie;
		this.designation = designation;
		this.articleRequests = articleRequests;
	}

	
}
