package com.crm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Billing2")
public class Billing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="first_name" ,length=45,nullable=false)
	private String firstName;
	@Column(name="last_name" ,length=45,nullable=false)
	private String lastName;
	@Column(name="email" ,length=145,nullable=false,unique=true)
	private String email;
	@Column(name="product" ,length=45,nullable=false)
	private String product;
	@Column(name="ammount" ,length=45,nullable=false)
	private String ammount;
	private String mode;
	public Billing() {
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAmmount() {
		return ammount;
	}
	public void setAmmount(String ammount) {
		this.ammount = ammount;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}

	public Billing( String firstName, String lastName, String email, String product, String ammount,
			String mode) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.product = product;
		this.ammount = ammount;
		this.mode = mode;
	}
	
}
