package project.second.trytwo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contactus")
public class ContactUsENTITY {
		
		@Id
		@GeneratedValue(generator="increment")
		@Column(name="id")
		int id;
		
		@Column(name="name")
		String name;
		
		@Column(name="email")
		String email;
		
		@Column(name="message")
		String message;

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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public ContactUsENTITY(int id, String name, String email, String message)
		{
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.message = message;
		}

		public ContactUsENTITY() {
			super();
		}
		
		

	}

