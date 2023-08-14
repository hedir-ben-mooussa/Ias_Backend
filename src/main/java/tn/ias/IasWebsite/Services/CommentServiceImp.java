package tn.ias.IasWebsite.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import tn.ias.IasWebsite.entities.Comment;
import tn.ias.IasWebsite.repository.CommentRepository;

@Service
public class CommentServiceImp implements CommentService {
	
    @Autowired
     CommentRepository commentRepo; //inject comment repo into service

	@Override
	public Comment create(Comment c) {
		return commentRepo.save(c);
	}
 


	
}
