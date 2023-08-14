package tn.ias.IasWebsite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.ias.IasWebsite.entities.Comment;
import tn.ias.IasWebsite.services.CommentServiceImp;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Autowired
	CommentServiceImp commentservice;

	//http methode Post for add
	//get to get items from db 
	//put update
	//delete 
	
    @PostMapping("/add")
	public Comment CreateComment(@RequestBody Comment comment) {
    	 return commentservice.create(comment);
	}
}
