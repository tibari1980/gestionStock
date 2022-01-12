package com.arcesi.gestionStock.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class IdentifiedError extends MessageBean {

	private static final long serialVersionUID = 8390494780769436068L;
	private final Throwable cause;
	
	
	public IdentifiedError(final String p_id) {
		this((Throwable)null,p_id);
	}


	public IdentifiedError(final String id,final Object ...listeParms ) {
		this((Throwable)null,id,listeParms);
	}




	public IdentifiedError(Throwable p_cause, String p_id,final Object ...listeParams) {
		super(p_id,"IdentifiedError",null);
		this.cause=p_cause;
		for(final Object element:listeParams) {
			if(element instanceof Object[]) 
			{
				for (final Object elementBis : (Object[]) element) {
					addParameter(elementBis);
				}
			}
			else
			{
				addParameter(element);
			}
		}
	}
}
