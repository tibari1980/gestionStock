package com.arcesi.gestionStock.dto;

import java.io.Serializable;
import java.time.Instant;

import lombok.Data;
@Data

public abstract  class AbstractEntityDTO  implements Serializable {

	 
	private static final long serialVersionUID = 3086883588235957060L;
	public Instant createdDate;
	public Instant lastUpdateDate;
	
	
	public AbstractEntityDTO(Instant createdDate, Instant lastUpdateDate) {
		super();
		this.createdDate = createdDate;
		this.lastUpdateDate = lastUpdateDate;
	}
	
	
}
