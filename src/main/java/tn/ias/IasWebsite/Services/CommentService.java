package tn.ias.IasWebsite.services;

import java.util.List;

import tn.ias.IasWebsite.entities.Comment;
import tn.ias.IasWebsite.entities.User;

public interface CommentService {
	
	//CRUD
	
	//CREATE
	public Comment create(Comment comment);
	//READ
	public List<Comment> getallComments();
	//UPDATE
	public Comment updateComment(int commentid ,User user); 
	//DELETE
	public void DeleteComment(int commentid);
}
