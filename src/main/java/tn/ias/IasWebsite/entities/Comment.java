package tn.ias.IasWebsite.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Table( name = "Comment")
public class Comment implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="commID")
	private int commentId;
	@Column  
	private String body;
	@Column  
	private Date created;
	
	//generate getter o setter sinon ma temshish lkhedma lambok mahbsh yemshilk fhmtch aleh ataw nbaathlk intelij khyr
	
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", body=" + body + ", created=" + created + "]";
	}

	

}

