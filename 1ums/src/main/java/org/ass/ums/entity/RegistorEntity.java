package org.ass.ums.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="user_register_info")
public class RegistorEntity 
{
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="alt_key")
	private long alt_key;
	
	@Column(name="first_name")
    private String firstName;
	
	@Column(name="contact_number")
	private String contactNumber;
	@Column(name="email")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="country")
	private String country;

	

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "RegistorEntity [alt_key=" + alt_key + ", firstName=" + firstName + ", contactNumber=" + contactNumber
				+ ", email=" + email + ", password=" + password + ", country=" + country + "]";
	}

	

}
