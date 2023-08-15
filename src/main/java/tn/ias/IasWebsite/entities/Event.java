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
@Table (name = "Event")
public class Event implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="postID")
	
private Long PostId;
	@Column
private String imageUrl;
	@Column
private String tittle;
	
	public Long getPostId() {
		return PostId;
	}
	public void setPostId(Long postId) {
		PostId = postId;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Column
private Date created;

	@Override
	public String toString() {
		return "Event [PostId=" + PostId + ", imageUrl=" + imageUrl + ", tittle=" + tittle + ", created=" + created
				+ "]";
	}
}
