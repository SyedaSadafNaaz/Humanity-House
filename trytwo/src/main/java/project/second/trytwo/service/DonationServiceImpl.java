package project.second.trytwo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.second.trytwo.dto.DonationDTO;
import project.second.trytwo.entity.DonationENTITY;
import project.second.trytwo.repository.donationRepository;

@Service
public class DonationServiceImpl implements donationService{

	@Autowired
	donationRepository repositorydoner;

	@Override
	public List<DonationDTO> getAllDoners() {
		List<DonationENTITY> dataList = repositorydoner.findAll();

		ArrayList<DonationDTO> list = new ArrayList<>();

		for(DonationENTITY entity: dataList) {
			DonationDTO dto = new DonationDTO();
			BeanUtils.copyProperties(entity, dto);
			list.add(dto);
		}  
		return list;
	}

	@Override
	public boolean addNewDoner(DonationENTITY objDonation) {
		DonationENTITY entity = new DonationENTITY();
		entity.setName(objDonation.getName());
		entity.setDate(objDonation.getDate());
		entity.setEmail(objDonation.getEmail());
		entity.setAmount(objDonation.getAmount());
		
		return true;
	}



}
