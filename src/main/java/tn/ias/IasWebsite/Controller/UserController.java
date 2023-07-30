package tn.ias.IasWebsite.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.web.bind.annotation.RestController;

import tn.ias.IasWebsite.Services.UserServiceImpl;
import tn.ias.IasWebsite.entities.User;

@RestController
public class UserController {
	@Autowired
	UserServiceImpl userServ;
	
	//@RequestMapping(method = RequestMethod.GET, value ="/test")
public String test()
{return "Bonjour !";}

@PostMapping(value = " /adduser")
public User addUser(@RequestBody User user) {
	return userServ.addUser(user);}
}
