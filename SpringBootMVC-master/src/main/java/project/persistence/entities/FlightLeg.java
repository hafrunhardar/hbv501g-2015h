package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "FlightLeg") // If you want to specify a table name, you can do so here
public class FlightLeg {


	// Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String arrivalAirport;
    private String departureAirport;
    private int onGround;
    private int offGround;
    private int x;
    private int y;
    private String flumber;
    
    //@OneToOne
    //private Aircraft aircraft;

    public FlightLeg() {
    }
    
    public Long getId() {
 		return id;
 	}

 	public void setId(Long id) {
 		this.id = id;
 	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getFlumber() {
		return flumber;
	}

	public void setFlumber(String flumber) {
		this.flumber = flumber;
	}

	public int getOnGround() {
		return onGround;
	}

	public void setOnGround(int onGround) {
		this.onGround = onGround;
	}

	public int getOffGround() {
		return offGround;
	}

	public void setOffGround(int offGround) {
		this.offGround = offGround;
	}
    
}
