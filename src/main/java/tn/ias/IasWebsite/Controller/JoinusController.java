package tn.ias.IasWebsite.Controller;

import java.util.List;

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

import tn.ias.IasWebsite.entities.Joinus;
import tn.ias.IasWebsite.services.JoinusServiceImpl;
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*" )
@RestController
@RequestMapping("/Joinus")
public class JoinusController {
@Autowired
JoinusServiceImpl joinusService;


@PostMapping("/addstudent")
public Joinus creaJoinus(@RequestBody Joinus joinus) {
	return joinusService.create(joinus);
}
@GetMapping("/getall")
public List<Joinus> getallJoinus(){
	return joinusService.getallJoinus();
}
@PutMapping("/update/{id}")
public Joinus updateJoinus (@PathVariable("id") Integer id,@RequestBody Joinus joinus) {
	return null;
}
@DeleteMapping("delete/{id}")
public void deletejoinus(@PathVariable ("id") Integer id) {
	joinusService.deleteJoinus(id);
}

}
