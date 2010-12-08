package com.nabilbelakbir.app.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement
public class Country {
	@Id
	@GeneratedValue
	private long id;

	private String name;	
	private String prefixe;
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrefixe(String prefixe) {
		this.prefixe = prefixe;
	}
	public String getPrefixe() {
		return prefixe;
	}		


}
