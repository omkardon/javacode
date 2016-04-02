package com.tcs.ilp;

public class Resident {
	private int DoorNo;
	private String residentName;
	private String residentType;
	private double maintenanceCharges;
	private double monthlyCharges;
	
	public Resident(int doorNo, String residentName, String residentType, double maintenanceCharges) {
		DoorNo = doorNo;
		this.residentName = residentName;
		this.residentType = residentType;
		this.maintenanceCharges = maintenanceCharges;
	}

	public int getDoorNo() {
		return DoorNo;
	}

	public void setDoorNo(int doorNo) {
		DoorNo = doorNo;
	}

	public String getResidentName() {
		return residentName;
	}

	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	public String getResidentType() {
		return residentType;
	}

	public void setResidentType(String residentType) {
		this.residentType = residentType;
	}

	public double getMaintenanceCharges() {
		return maintenanceCharges;
	}

	public void setMaintenanceCharges(double maintenanceCharges) {
		this.maintenanceCharges = maintenanceCharges;
	}
	@Override
	public String toString() {
		return getDoorNo()+"\n"+getResidentType()+"\n"+getResidentName()+"\n"+getMaintenanceCharges()+"\n";
	}
}
