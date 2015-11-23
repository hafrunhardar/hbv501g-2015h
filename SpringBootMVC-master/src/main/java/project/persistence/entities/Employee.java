package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "Employee") // If you want to specify a table name, you can do so here
public class Employee {

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
    private int kt;
    private String username;
    private int phone;
    private String email;
    private String capability;
 
    
    public Employee( ) { 
    	//empty constructor
    }

    public Employee(String name, int kt, String username, 
    				int phone, String email, String capability) {
    	this.setName(name);
    	this.setKt(kt);
    	this.setUsername(username);
    	this.setPhone(phone);
    	this.setEmail(email);
    	this.setCapability(capability);    	
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKt() {
		return kt;
	}

	public void setKt(int kt) {
		this.kt = kt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getCapability() {
		return capability;
	}

	public void setCapability(String capability) {
		this.capability = capability;
	}
	
	public String valueToString(){
		return String.format(
				  "<td> %d </td>"
				+ "<td> %s </td>"
				+ "<td> %d </td>"
				+ "<td> %s </td>"
				+ "<td> %d </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				, id, name, kt, username, phone, email, capability);
	}
    
}
