package project.second.trytwo.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserLogin {
	@NotBlank(message = "Email cannot be empty")
	@Email(message = "Invalid email format")
	private String email;

	@NotBlank(message = "Password cannot be empty")
	private String password;

	// constructors, getters, and setters
	public UserLogin() {}

	public UserLogin(String email, String password) {
		this.email = email;
		this.password = password;
	}

	// getters and setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
