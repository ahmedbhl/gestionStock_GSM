package com.app.gsm.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeClient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7994978185428345134L;

	@Id
	@GeneratedValue
	private Long idLigneCdeClt;

	@ManyToOne
	@JoinColumn(name = "idMobile")
	private Mobile mobile;

	@Embedded
	@ElementCollection
	private List<Panne> pannes;

	@ManyToOne
	@JoinColumn(name = "idCommandeClient")
	private CommandeClient commandeClient;

	public LigneCommandeClient() {
		super();

	}

	public LigneCommandeClient(Long idLigneCdeClt, Mobile mobile, CommandeClient commandeClient) {
		super();
		this.idLigneCdeClt = idLigneCdeClt;
		this.mobile = mobile;
		this.commandeClient = commandeClient;
	}

	public Long getIdLigneCdeClt() {
		return idLigneCdeClt;
	}

	public void setIdLigneCdeClt(Long idLigneCdeClt) {
		this.idLigneCdeClt = idLigneCdeClt;
	}

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	public List<Panne> getPannes() {
		return pannes;
	}

	public void setPannes(List<Panne> pannes) {
		this.pannes = pannes;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}