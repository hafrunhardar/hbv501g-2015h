package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "Training") // If you want to specify a table name, you can do so here
public class Training {

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

	private String username;
	private String dateStamp;
	private String location;
	private String nextDue;
	private String teacher;
	private int kt;

	public Training( String username, String dateStamp, 
			String location, String nextDue, 
			String teacher, int kt ) {
		this.setUsername(username);
		this.setDateStamp(dateStamp);
		this.setLocation(location);
		this.setNextDue(nextDue);
		this.setTeacher(teacher);
		this.setKt(kt);		
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public String getDateStamp() {
		return dateStamp;
	}

	public void setDateStamp(String dateStamp) {
		this.dateStamp = dateStamp;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}


	public String getNextDue() {
		return nextDue;
	}

	public void setNextDue(String nextDue) {
		this.nextDue = nextDue;
	}


	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}


	public int getKt() {
		return kt;
	}

	public void setKt(int kt) {
		this.kt = kt;
	}
		
}
