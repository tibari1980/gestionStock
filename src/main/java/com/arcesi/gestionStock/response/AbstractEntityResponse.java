package com.arcesi.gestionStock.response;

import java.io.Serializable;
import java.time.Instant;
/**
 * @author ZEROUAL TIBARI
 * ingénieur développement
 */
import lombok.Data;

@Data
public abstract class AbstractEntityResponse implements Serializable {

	 
	private static final long serialVersionUID = 6970076598582057108L;
	public Instant createdDate;
	public Instant lastUpdateDate;
	public AbstractEntityResponse(Instant createdDate, Instant lastUpdateDate) {
		super();
		this.createdDate = createdDate;
		this.lastUpdateDate = lastUpdateDate;
	}
	
	
}
