package project.second.trytwo.service;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityNotFoundException;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.second.trytwo.dto.UserDTO;
import project.second.trytwo.entity.UserENTITY;
import project.second.trytwo.repository.userRepository;

@Service
public class UserServiceImpl implements userService{

	@Autowired
	userRepository repositoryuser;

	@Override
	public List<UserDTO> getAllUsers() {
		List<UserENTITY> dataList = repositoryuser.findAll();

		ArrayList<UserDTO> list = new ArrayList<>();

		for(UserENTITY entity: dataList) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(entity, dto);
			list.add(dto);
		}
		return list;
	}
	@Override
	public UserENTITY login(String email, String password) {
		return repositoryuser.findByEmailAndPassword(email, password);
	}


	@Override
	public boolean addNew(UserENTITY objUser) {
		UserENTITY entity = new UserENTITY();
		entity.setName(objUser.getName());
		entity.setPassword(objUser.getPassword());
		entity.setEmail(objUser.getEmail());
		entity.setAddress(objUser.getAddress());
		entity.setPhoneNo(objUser.getPhoneNo());
		repositoryuser.save(entity);
		return true;

	}
	
	@Override
	public void deleteUserById(int id) {
		repositoryuser.deleteById(id);

	}

}