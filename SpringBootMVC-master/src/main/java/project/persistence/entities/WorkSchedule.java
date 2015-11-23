package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "WorkSchedule") // If you want to specify a table name, you can do so here
public class WorkSchedule {

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

	private int startDateStamp;
	private int endDateStamp;
	private int employeeCNT;
	private Employee[] employees;
	
	public WorkSchedule( ) {
/*		this.setStartDateStamp(startDateStamp);
		this.setEndDateStamp(endDateStamp);
		this.setEmployeeCNT(employeeCNT);
		this.setEmployees(employees); */
	}

	public int getStartDateStamp() {
		return startDateStamp;
	}

	public void setStartDateStamp(int startDateStamp) {
		this.startDateStamp = startDateStamp;
	}

	public int getEndDateStamp() {
		return endDateStamp;
	}

	public void setEndDateStamp(int endDateStamp) {
		this.endDateStamp = endDateStamp;
	}

	public int getEmployeeCNT() {
		return employeeCNT;
	}

	public void setEmployeeCNT(int employeeCNT) {
		this.employeeCNT = employeeCNT;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}
	
}
