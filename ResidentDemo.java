package com.tcs.ilp;

import java.util.ArrayList;

public class ResidentDemo {

	public static void main(String[] args) {
		
		Resident[] residents=new Resident[4];
		
		residents[0]=new Resident(101,"Raman","Own",500);
		residents[1]=new Resident(102,"Srini","Own",800);
		residents[2]=new Resident(103,"Latha","Rent",100);
		residents[3]=new Resident(104,"Shiva","Own",850);
		
		double[] elec={200,150,400,130};
		
		System.out.println(getResidentDetailsByDoorNo(residents, 103));
		System.out.println(getResidentDetailsByType(residents, "Own"));
		System.out.println(getTotalRentedReidences(residents));
		System.out.println(calculateMonthlyCharges(residents[2],101,elec));

	}
	
	public static Resident getResidentDetailsByDoorNo(Resident[] residents,int doorNoReq) {
		Resident found=null;
		for(Resident element:residents) {
			if(element.getDoorNo()==doorNoReq)
				found=element;
		}
		return found;
	}
	
	public static ArrayList<Resident> getResidentDetailsByType(Resident[] residents,String typeReq) {
		ArrayList<Resident> req=new ArrayList<>();
		
		for(Resident element:residents) {
			if(element.getResidentType().equals(typeReq))
				req.add(element);
		}
		
		return req;
	}
	
	public static double calculateMonthlyCharges(Resident resident,int doorNoReq,double[]elec) {
		double monthlyCharges=0.0;
		int i=0;
		if(resident.getResidentType().equalsIgnoreCase("Rent")) {
			monthlyCharges=resident.getMaintenanceCharges()+elec[i]+500;
			i++;
		}
		if(resident.getResidentType().equalsIgnoreCase("Own")) {
			monthlyCharges=resident.getMaintenanceCharges()+elec[i];
			i++;
		}
		return monthlyCharges;
	}
	
	public static int getTotalRentedReidences(Resident[] residents) {
		int count=0;
		for(Resident element:residents) {
			if(element.getResidentType().equalsIgnoreCase("Rent"))
				count++;
		}
		return count;
	}
}
