package com.app.gsm.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3539083058659466084L;

	@Id
	@GeneratedValue
	private Long idUser;

	private String nom;

	private String prenom;

	private String mail;

	private String motDePasse;

	private String photo;

	private String numeroTel;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long idUser, String nom, String prenom, String mail, String motDePasse, String photo) {
		super();
		this.idUser = idUser;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.motDePasse = motDePasse;
		this.photo = photo;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
