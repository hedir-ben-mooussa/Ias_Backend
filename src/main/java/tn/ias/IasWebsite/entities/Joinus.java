package tn.ias.IasWebsite.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "JoinUs")
public class Joinus implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name ="id")
	private int id;
	@Column
	
	private String fullname;
	@Column
	private int phonenumber;
	
	@Column
	private String email;
	@Column
	private Date dateofbirth;
	@Column
	private Boolean IEEE_member;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public Boolean getIEEE_member() {
		return IEEE_member;
	}
	public void setIEEE_member(Boolean iEEE_member) {
		IEEE_member = iEEE_member;
	}
	@Override
	public String toString() {
		return "Joinus [id=" + id + ", phonenumber=" + phonenumber + ", fullname=" + fullname + ", email=" + email
				+ ", dateofbirth=" + dateofbirth + ", IEEE_member=" + IEEE_member + "]";
	}
	
}

