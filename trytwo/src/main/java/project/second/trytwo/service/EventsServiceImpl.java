package project.second.trytwo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.second.trytwo.dto.EventsDTO;
import project.second.trytwo.entity.EventsENTITY;
import project.second.trytwo.repository.eventsRepository;

@Service
public class EventsServiceImpl implements eventsService{

	
	@Autowired
	eventsRepository eventsrepository;

	@Override
	public List<EventsDTO> getAllEvents() {
		List<EventsENTITY> dataList = eventsrepository.findAll();

		ArrayList<EventsDTO> list = new ArrayList<>();

		for(EventsENTITY entity: dataList) {
			EventsDTO dto = new EventsDTO();
			BeanUtils.copyProperties(entity, dto);
			list.add(dto);
		}
		return list;
	}

	@Override
	public EventsDTO getEventByTitle(String title) {
		EventsENTITY event = eventsrepository.findByTitle(title);
		EventsDTO dto = new EventsDTO();
		BeanUtils.copyProperties(event, dto);
		return dto;
	}

	@Override
	public boolean addNew(EventsENTITY objevent) {
		EventsENTITY entity = new EventsENTITY();
		entity.setTitle(objevent.getTitle());
		entity.setDate(objevent.getDate());
		entity.setLocation(objevent.getLocation());
		entity.setDescription(objevent.getDescription());
		eventsrepository.save(entity);
		return true;
		
	}

	@Override
	public EventsDTO updateEventById(int idEvents, EventsDTO eventDTO) {
	    Optional<EventsENTITY> optionalEventENTITY = eventsrepository.findById(idEvents);
	    if (!optionalEventENTITY.isPresent()) {
	        return null;
	    }
	    EventsENTITY eventENTITY = optionalEventENTITY.get();
	    BeanUtils.copyProperties(eventDTO, eventENTITY);
	    eventENTITY.setIdEvents(idEvents);
	    eventsrepository.save(eventENTITY);
	    EventsDTO updatedEventDTO = new EventsDTO();
	    BeanUtils.copyProperties(eventENTITY, updatedEventDTO);
	    return updatedEventDTO;
	    }

	 @Override
		public void deleteUserById(int idEvents) {
			eventsrepository.deleteById(idEvents);

		}


}
