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

import tn.ias.IasWebsite.entities.Event;


import tn.ias.IasWebsite.services.EventServiceImpl;

@RestController
@RequestMapping("/event")
public class EventController {
	@Autowired
	EventServiceImpl eventService;
	
	@PostMapping("/addevent")
   public Event createEvent(@RequestBody Event event) {
		return eventService.create(event);
	}
	@GetMapping("getall")
	public  List<Event> getAll() {
	return eventService.getallEvents();
	}
	@PutMapping("update/{PostId}")
	public Event updateEvent(@PathVariable("PostId") Long PostId, @RequestBody Event event) {
		return null;
	}
	@DeleteMapping("delete/{PostId}")
	public void DeletEvent(@PathVariable ("PostId") Long PostId){
		eventService.deleteEvent(PostId);	
	}
	

}
