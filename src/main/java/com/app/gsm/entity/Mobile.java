package com.app.gsm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Mobile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7741527157286850104L;

	@Id
	@GeneratedValue
	private Long idMobile;
	private String Model;
	private String imei;
	private String serialNumber;
	private String couleur;
	private String photo;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(Long idMobile, String model, String imei, String serialNumber, String couleur, String photo) {
		super();
		this.idMobile = idMobile;
		Model = model;
		this.imei = imei;
		this.serialNumber = serialNumber;
		this.couleur = couleur;
		this.photo = photo;
	}

	public Long getIdMobile() {
		return idMobile;
	}

	public void setIdMobile(Long idMobile) {
		this.idMobile = idMobile;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
