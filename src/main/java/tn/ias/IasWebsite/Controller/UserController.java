package tn.ias.IasWebsite.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import tn.ias.IasWebsite.entities.User;
import tn.ias.IasWebsite.services.UserServiceImpl;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserServiceImpl userservice;

	@PostMapping("/login")
	public boolean Login(@RequestBody Map<String, String> requestBody) {
		String email = (String) requestBody.get("email");
		String password = (String) requestBody.get("password");
		return this.userservice.login(email, password);
	}

	@PostMapping("/adduser")
	public User createUser(@RequestBody User user) {
		return userservice.create(user);
	}

	@GetMapping("/getAll")
	public List<User> getAllUsers() {
		return userservice.getAllUsers();
	}

	// @PUT
	@PutMapping("update/{id}")
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		return null;
	}

	// @DELETE
	@DeleteMapping("delete/{id}") // user/delete/5455744
	public void DeleteUser(@PathVariable("id") Long id) {
		// recherche user by id
		// if found delete that user by his id
		userservice.DeleteUser(id);
	}

}
