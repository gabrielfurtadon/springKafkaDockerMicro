package com.eportal.api.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude
public class OwnerPostDTO {

	private String nome;
	private String type;
	private String contactNumber;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	public OwnerPostDTO() {
	}
	
	public OwnerPostDTO(String nome, String type, String contactNumber) {
		super();
		this.nome = nome;
		this.type = type;
		this.contactNumber = contactNumber;
	}
	
	
	
}
