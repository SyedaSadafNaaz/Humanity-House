package project.second.trytwo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import project.second.trytwo.dto.DonationDTO;
import project.second.trytwo.entity.DonationENTITY;

@Service
public interface donationService {
	
	public List<DonationDTO> getAllDoners();
	
	public boolean addNewDoner(DonationENTITY objDonation);

}
