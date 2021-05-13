package eTicaretSistemiSimülasyon.entities.concretes;

import eTicaretSistemiSimülasyon.entities.abstracts.Entity;

public class Member implements Entity {

	private String name;
	private String surname;
	private String password;
	private String mailAddress;
	private boolean isClicked;
	
	
	public Member(String name, String surname, String password, String mailAddress, boolean isClicked) {
		super();
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.mailAddress = mailAddress;
		this.isClicked = isClicked;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMailAddress() {
		return mailAddress;
	}


	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}


	public boolean isClicked() {
		return isClicked;
	}


	public void setClicked(boolean isClicked) {
		this.isClicked = isClicked;
	}


}
