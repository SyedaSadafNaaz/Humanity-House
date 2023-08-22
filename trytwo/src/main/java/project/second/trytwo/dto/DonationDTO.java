package project.second.trytwo.dto;

import java.time.LocalDate;

public class DonationDTO {
	
	private int idDonation;
	
	private String name;
	
	private String email;
	
	private String amount;
	
	private LocalDate Date;

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
