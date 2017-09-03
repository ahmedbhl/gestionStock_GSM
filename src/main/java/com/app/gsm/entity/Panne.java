package com.app.gsm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Panne implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2655406392769158591L;
	@Id
	@GeneratedValue
	private Long idPanne;
	private String description;

	public Panne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Panne(Long idPanne, String description) {
		super();
		this.idPanne = idPanne;
		this.description = description;
	}

	public Long getIdPanne() {
		return idPanne;
	}

	public void setIdPanne(Long idPanne) {
		this.idPanne = idPanne;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
