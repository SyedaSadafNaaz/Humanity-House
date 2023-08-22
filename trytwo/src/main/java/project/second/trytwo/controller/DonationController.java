package project.second.trytwo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.second.trytwo.dto.DonationDTO;
import project.second.trytwo.dto.UserDTO;
import project.second.trytwo.entity.DonationENTITY;
import project.second.trytwo.entity.UserENTITY;
import project.second.trytwo.service.donationService;

@RestController
@RequestMapping("/donation")
@CrossOrigin(origins = "http://localhost:3000")
public class DonationController {

	@Autowired
	donationService donationservice;
	
	@GetMapping("/all")
	public List<DonationDTO> getAllDoners()
	{
	return donationservice.getAllDoners();
	}
	
	@PostMapping("/registration")
	public boolean addNewDoner(@RequestBody DonationENTITY objDoner)
	{
		return donationservice.addNewDoner(objDoner);
	}
}
