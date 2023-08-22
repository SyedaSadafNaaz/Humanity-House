package project.second.trytwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.second.trytwo.entity.ContactUsENTITY;
import project.second.trytwo.repository.contactUsRepository;

@Service
public class ContactUsServiceImpl implements contactUsService 
{
	@Autowired
	contactUsRepository contactrepository;

	@Override
	public boolean addMessage(ContactUsENTITY objcontact) {
		ContactUsENTITY entity = new ContactUsENTITY();
		entity.setName(objcontact.getName());
		entity.setEmail(objcontact.getEmail());
		entity.setMessage(objcontact.getMessage());
		contactrepository.save(entity);
		return true;
	}

}
