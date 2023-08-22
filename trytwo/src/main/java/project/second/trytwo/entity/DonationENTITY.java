package project.second.trytwo.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "donation")
public class DonationENTITY {
	
	@Id
	@GeneratedValue(generator="increment")
	@Column(name= "iddonation")
	int idDonation;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "amount")
	String amount;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "date")
	LocalDate Date;
	
	@OneToOne(cascade = CascadeType.ALL )
	@JoinColumn(name = "idevents")
	private EventsENTITY events;

	
	public DonationENTITY() {
		super();
	}

	public DonationENTITY(int idDonation, String name, String email, String amount, LocalDate date) {
		super();
		this.idDonation = idDonation;
		this.name = name;
		this.email = email;
		this.amount = amount;
		Date = date;
	}

	public int getIdDonation() {
		return idDonation;
	}

	public void setIdDonation(int idDonation) {
		this.idDonation = idDonation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return Date;
	}

	public void setDate(LocalDate date) {
		Date = date;
	}
	
	

}

