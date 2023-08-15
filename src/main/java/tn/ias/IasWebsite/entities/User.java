package tn.ias.IasWebsite.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "User")
public class User implements Serializable{
	@Id
	@Column(name="userId")
	private Long iduser;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private Date DateOfBirth;
	@Column
	private Long PhoneNumber;
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
