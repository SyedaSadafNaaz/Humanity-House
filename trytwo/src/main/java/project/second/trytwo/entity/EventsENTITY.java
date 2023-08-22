package project.second.trytwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class EventsENTITY {

	@Id
	@GeneratedValue(generator="increment")
	@Column(name = "idevents")
	int idEvents;
	
	@Column(name="title")
	String title;
	
	@Column(name="date")
	String Date;
	
	@Column(name="location")
	String location;
	
	@Column(name="description")
	String description;
	
	@OneToOne(mappedBy = "events")
	private DonationENTITY donation;

	public int getIdEvents() {
		return idEvents;
	}

	public void setIdEvents(int idEvents) {
		this.idEvents = idEvents;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EventsENTITY(int idEvents, String title, String date, String location, String description) {
		super();
		this.idEvents = idEvents;
		this.title = title;
		Date = date;
		this.location = location;
		this.description = description;
	}

	@Override
	public String toString() {
		return "EventsENTITY [idEvents=" + idEvents + ", title=" + title + ", Date=" + Date + ", location=" + location
				+ ", description=" + description + "]";
	}

	public EventsENTITY() {
		
	}
	
	
	
	
}
