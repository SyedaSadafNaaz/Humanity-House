package project.second.trytwo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import project.second.trytwo.dto.EventsDTO;
import project.second.trytwo.entity.EventsENTITY;

@Service
public interface eventsService {

	public List<EventsDTO> getAllEvents();

	public EventsDTO getEventByTitle(String title);

	public boolean addNew(EventsENTITY objevent);

	public EventsDTO updateEventById(int idEvents, EventsDTO eventDTO);

	public void deleteUserById(int idEvents);
	

}
