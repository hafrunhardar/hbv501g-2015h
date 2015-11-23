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

	private String startDateStamp;
	private String endDateStamp;
	private int employeeCNT;
	private Employee[] employees;
	
	public WorkSchedule( ) { }

	public String getStartDateStamp() {
		return startDateStamp;
	}

	public void setStartDateStamp(String startDateStamp) {
		this.startDateStamp = startDateStamp;
	}

	public String getEndDateStamp() {
		return endDateStamp;
	}

	public void setEndDateStamp(String endDateStamp) {
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

	public String valueToString(){
		return String.format(
				  "<td> ID: %d </td>"
				+ "<td> Start Date: %s </td>"
				+ "<td> End Date: %s </td>"
				+ "<td> Number of employees: %d </td>"
				+ "<td> Employees: %s </td>"
				, id, startDateStamp, endDateStamp, employeeCNT, employees);
		}
	
}
