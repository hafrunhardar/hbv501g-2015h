package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "Aircraft") // If you want to specify a table name, you can do so here
public class Aircraft {


	// Declare that this attribute is the id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int tailnum;
    private int tsn;
    private String status;
    private String malfunctions;
    private String apu;
    private String engine;
    private String location;
    private AircraftConfig aircraftConfig;
    
    @OneToOne
    private FlightLeg flightLeg;

    public Aircraft() { }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getTailnum() {
		return tailnum;
	}

	public void setTailnum(int tailnum) {
		this.tailnum = tailnum;
	}


	public int getTsn() {
		return tsn;
	}

	public void setTsn(int tsn) {
		this.tsn = tsn;
	}


	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	public String getMailfunctions() {
		return malfunctions;
	}

	public void setMailfunctions(String malfunctions) {
		this.malfunctions = malfunctions;
	}


	public String getApu() {
		return apu;
	}

	public void setApu(String apu) {
		this.apu = apu;
	}


	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	
	public AircraftConfig getAircraftConfig() {
		return aircraftConfig;
	}

	public void setAircraftConfig(AircraftConfig aircraftConfig) {
		this.aircraftConfig = aircraftConfig;
	}
	
	public String valueToString(){
		return String.format(
				  "<td> %d </td>"
				+ "<td> %d </td>"
				+ "<td> %d </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				,id, tailnum, tsn,apu, engine, location, status, malfunctions);
	}

	public String valueToStringConfig(){
		return String.format(
				  "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				+ "<td> %s </td>"
				, aircraftConfig.isDataLoader()?"True":"False", aircraftConfig.isETOPS()?"True":"False", aircraftConfig.isWiFi()?"True":"False", aircraftConfig.isIFE()?"True":"False", aircraftConfig.isLightningSystem()?"True":"False", aircraftConfig.isTypeOfCPE()?"True":"False", aircraftConfig.isLCDMod()?"True":"False", aircraftConfig.isSoftwareType()?"True":"False", aircraftConfig.isACARS()?"True":"False");
		}

}
