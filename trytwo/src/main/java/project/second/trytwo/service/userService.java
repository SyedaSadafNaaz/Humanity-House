package project.second.trytwo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import project.second.trytwo.dto.UserDTO;
import project.second.trytwo.entity.UserENTITY;

@Service
public interface userService 
{
	// public UserDTO getUserbyId(getId uid);
	
	public List<UserDTO> getAllUsers();
	
	public boolean addNew(UserENTITY objUser);

	public void deleteUserById(int id);

	public UserENTITY login(String email, String password);

}

