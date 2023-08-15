package tn.ias.IasWebsite.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    @GetMapping("/getallc")
    public List<Comment> getallComments(){
    	return commentservice.getallComments();
    }
    
    @DeleteMapping("delete/{commentid}")
    public void deleteComment (@PathVariable("commentid") int commentid) {
    	commentservice.DeleteComment(commentid);
	}
}
