package project.second.trytwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserENTITY {

	@Id
	@GeneratedValue(generator="increment")
	@Column(name="id")
	int id;
	
	@Column(name="name")
	String name;

	@Column(name="password")
	String password;

	@Column(name="email")
	String email;
	
	@Column(name="address")
	String address;

	@Column(name="phoneno")
	Long phoneNo;
	
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public UserENTITY() {
	}

	public UserENTITY(int id, String name, String password, String email, String address, long phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phoneNo = phoneNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "UserENTITY [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", address="
				+ address + ", phoneNo=" + phoneNo + "]";
	}
	
	

}
