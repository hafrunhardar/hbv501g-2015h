package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "Contact") // If you want to specify a table name, you can do so here
public class Contact {

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String location;
    private String address;
    private int phone;
    private String email;
        
    public Contact(/* String name, String location, int phone, 
    		String address, String email*/ ) {
/*    	this.setName(name);
    	this.setLocation(location);
    	this.setAddress(address);
    	this.setPhone(phone);
    	this.setEmail(email); */
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}    
        
	public String valueToString() {
		return String.format(
				  "<td> %d </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %d </td>"
				,   id, name, location, address, email, phone);
	}
}

