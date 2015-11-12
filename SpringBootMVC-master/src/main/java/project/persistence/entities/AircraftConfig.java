package project.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "AircraftConfig") // If you want to specify a table name, you can do so here
public class AircraftConfig {

	private boolean DataLoader;
	private boolean ETOPS;
	private boolean WiFi;
	private boolean IFE;
	private boolean LightningSystem;
	private boolean TypeOfCPE;
	private boolean LCDMod;
	private boolean SoftwareType;
	private boolean ACARS;
	
	public AircraftConfig() {
	}
	
	public boolean isDataLoader() {
		return DataLoader;
	}
	
	public void setDataLoader(boolean dataLoader) {
		DataLoader = dataLoader;
	}
	
	public boolean isETOPS() {
		return ETOPS;
	}
	
	public void setETOPS(boolean eTOPS) {
		ETOPS = eTOPS;
	}
	
	public boolean isWiFi() {
		return WiFi;
	}
	
	public void setWiFi(boolean wiFi) {
		WiFi = wiFi;
	}
	
	public boolean isIFE() {
		return IFE;
	}
	
	public void setIFE(boolean iFE) {
		IFE = iFE;
	}
	
	public boolean isLightningSystem() {
		return LightningSystem;
	}
	
	public void setLightningSystem(boolean lightningSystem) {
		LightningSystem = lightningSystem;
	}
	
	public boolean isTypeOfCPE() {
		return TypeOfCPE;
	}
	
	public void setTypeOfCPE(boolean typeOfCPE) {
		TypeOfCPE = typeOfCPE;
	}
	
	public boolean isLCDMod() {
		return LCDMod;
	}
	
	public void setLCDMod(boolean lCDMod) {
		LCDMod = lCDMod;
	}
	
	public boolean isSoftwareType() {
		return SoftwareType;
	}
	
	public void setSoftwareType(boolean softwareType) {
		SoftwareType = softwareType;
	}
	
	public boolean isACARS() {
		return ACARS;
	}
	
	public void setACARS(boolean aCARS) {
		ACARS = aCARS;
	}
	
}
