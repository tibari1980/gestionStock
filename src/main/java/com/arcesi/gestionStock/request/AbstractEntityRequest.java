package com.arcesi.gestionStock.request;

import java.io.Serializable;
import java.time.Instant;

import lombok.Data;

@Data
public class AbstractEntityRequest implements Serializable {

  
	private static final long serialVersionUID = 9088466266060597095L;
	public Instant createdDate;
	public Instant lastUpdateDate;
	public AbstractEntityRequest(Instant createdDate, Instant lastUpdateDate) {
		super();
		this.createdDate = createdDate;
		this.lastUpdateDate = lastUpdateDate;
	}
	
	
}
