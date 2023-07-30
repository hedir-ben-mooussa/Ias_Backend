package tn.ias.IasWebsite.entities;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class User {
	@Id
	private Long iduser;
	private String name;
	private String email;
	private String password;
	private Date DateOfBirth;
	private Long PhoneNumber;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Long iduser, String name, String email, String password, Date dateOfBirth, Long phoneNumber) {
		super();
		this.iduser = iduser;
		this.name = name;
		this.email = email;
		this.password = password;
		DateOfBirth = dateOfBirth;
		PhoneNumber = phoneNumber;
	}
	public Long getIduser() {
		return iduser;
	}
	public void setIduser(Long iduser) {
		this.iduser = iduser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [iduser=" + iduser + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", DateOfBirth=" + DateOfBirth + ", PhoneNumber=" + PhoneNumber + "]";
	}
	  
	
	
	

}
