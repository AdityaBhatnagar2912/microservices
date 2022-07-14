package com.microservice1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact {
	public Contact(int cid, String email) {
		super();
		this.cid = cid;
		this.email = email;
	}
	Contact(){
		
	}
	
	@Id
int cid;
	@Column
String email;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
