package tn.ias.IasWebsite.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.ias.IasWebsite.entities.Event;
import tn.ias.IasWebsite.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {
	@Autowired
	EventRepository eventRepo;

	@Override
	public Event create(Event event) {
		
		return eventRepo.save(event);
	}

	@Override
	public List<Event> getallEvents() {
		// TODO Auto-generated method stub
		return eventRepo.findAll();
	}

	@Override
	public void deleteEvent(Long postId) {
		// TODO Auto-generated method stub
		eventRepo.deleteById(postId);
	}

	@Override
	public Event UpdateEvent(int PostId, Event event) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
