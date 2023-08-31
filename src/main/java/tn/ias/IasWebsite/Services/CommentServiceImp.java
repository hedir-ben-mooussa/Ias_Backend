package tn.ias.IasWebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.ias.IasWebsite.entities.Comment;
import tn.ias.IasWebsite.entities.User;
import tn.ias.IasWebsite.repository.CommentRepository;

@Service
public class CommentServiceImp implements CommentService {
	
    @Autowired
     CommentRepository commentRepo; //inject comment repo into service

	@Override
	public Comment create(Comment comment) {
		return commentRepo.save(comment);
	}

	@Override
	public List<Comment> getallComments() {
		
		return commentRepo.findAll() ;
	}

	@Override
	public Comment updateComment(int commentid, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteComment(int commentid) {
		
		commentRepo.deleteById(commentid);
	}
 


	
}
