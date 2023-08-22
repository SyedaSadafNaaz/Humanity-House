package project.second.trytwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.second.trytwo.dto.EventsDTO;
import project.second.trytwo.entity.EventsENTITY;
import project.second.trytwo.repository.eventsRepository;
import project.second.trytwo.service.eventsService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/events")
public class EventsController {

	@Autowired
	eventsService eventsservice;
	
	@Autowired
	eventsRepository eventsrepository;

	@GetMapping("/all")
	public List<EventsDTO> getAllEvents()
	{
		return eventsservice.getAllEvents();
	}
	
	@PutMapping("/edit/{id}")
	public ResponseEntity<EventsDTO> updateEventById(@PathVariable int id, @RequestBody EventsDTO eventDTO) {
	    EventsDTO updatedEventDTO = eventsservice.updateEventById(id, eventDTO);
	    if (updatedEventDTO == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok(updatedEventDTO);
	}
	
	@GetMapping("/findByTitle")
	public EventsDTO getEventByTitle(@RequestParam("title") String title) {
		return eventsservice.getEventByTitle(title);
	}
	
	@PostMapping("/addEvent")
	public boolean addNew(@RequestBody EventsENTITY objevent) {
		System.out.println("Controller method called with user: " +objevent.toString());
		return eventsservice.addNew(objevent);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> forDeleteUser(@PathVariable int idEvents){
	    eventsrepository.deleteById(idEvents);
	    return ResponseEntity.ok("Deleted successfully");
	}

}
