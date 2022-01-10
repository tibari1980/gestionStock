package com.arcesi.gestionStock.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

/**
 * 
 * @author Tibari Zeroual
 * Ingénieur Dev
 */

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public  class AbstractEntity implements Serializable {

	 
	private static final long serialVersionUID = 454702154598710856L;

	@CreatedDate
	@Column(name="DATE_CREATION",nullable = false,insertable = true)
	public Instant createdDate;
	
	@LastModifiedDate
	@Column(name="DATE_MODIFICATION",nullable = true,insertable = true)
	@JsonIgnore
	public Instant lastUpdateDate;
}
