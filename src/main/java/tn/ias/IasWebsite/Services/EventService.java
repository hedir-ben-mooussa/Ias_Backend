package tn.ias.IasWebsite.services;

import java.util.List;

import tn.ias.IasWebsite.entities.Event;

public interface EventService {
public Event create(Event event);
public List<Event> getallEvents() ;
public void deleteEvent (Long PostId);
public Event UpdateEvent (int PostId,Event event);

}
