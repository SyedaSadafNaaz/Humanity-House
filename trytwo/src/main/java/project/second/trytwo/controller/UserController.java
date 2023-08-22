package project.second.trytwo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import project.second.trytwo.dto.UserDTO;
import project.second.trytwo.dto.UserLogin;
import project.second.trytwo.entity.UserENTITY;
import project.second.trytwo.repository.userRepository;
import project.second.trytwo.service.userService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user")
public class UserController {	
	
	@Autowired
	userService userservice;
	
	@Autowired
	userRepository repositoryuser;
	
	@GetMapping("/all/{pageNo}")
	public List<UserDTO> getAllUsers(@PathVariable("pageNo")int pageNo,@RequestParam("pageSize") int pageSize)
	{
		Pageable page = PageRequest.of(pageNo, pageSize);
		return userservice.getAllUsers();
	}
	
	@PostMapping("/register")
	public boolean addNew(@RequestBody UserENTITY objUser) {
		System.out.println("Controller method called with user: " +objUser.toString());
		return userservice.addNew(objUser);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<?> forDeleteUser(@PathVariable int id){
	    repositoryuser.deleteById(id);
	    return ResponseEntity.ok("Deleted successfully");
	}
	
	 @PostMapping("/login")
	    public ResponseEntity<String> login(@Valid @RequestBody UserLogin loginRequest, HttpSession session) {
	        UserENTITY entity = userservice.login(loginRequest.getEmail(), loginRequest.getPassword());

	        if (entity == null) {
	            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid email or password");
	        }
	    
	        session.setAttribute("UserENTITY", entity);
	        return ResponseEntity.ok().build();
	    }

}
