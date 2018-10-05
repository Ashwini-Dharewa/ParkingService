package com.capgemini;

public class Parking {
	
	int floor;
	int section;
	int compartment;
	String ticket;
	
	public Parking(int floor, int section, int compartment) {
		super();
		this.floor = floor;
		this.section = section;
		this.compartment = compartment;
	}
	@Override
	public String toString() {
		return "[" + getTicket() + "]";
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public int getSection() {
		return section;
	}
	public void setSection(int section) {
		this.section = section;
	}
	public int getCompartment() {
		return compartment;
	}
	public void setCompartment(int compartment) {
		this.compartment = compartment;
	}
	public String getTicket() {
		return "F"+floor+"S"+section+"C"+compartment;
	}
	
}
