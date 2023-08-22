package project.second.trytwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.second.trytwo.entity.EventsENTITY;

@Repository
public interface eventsRepository extends JpaRepository<EventsENTITY, Integer>{

	public EventsENTITY findByTitle(String title);
	
	
	
	
}
