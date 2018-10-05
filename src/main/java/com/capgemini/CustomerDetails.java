package com.capgemini;

public class CustomerDetails {
	String customerName;
	String phoneNo;
	String parkingTime;
	public CustomerDetails(String customerName, String phoneNo, String parkingTime) {
		super();
		this.customerName = customerName;
		this.phoneNo = phoneNo;
		this.parkingTime = parkingTime;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getParkingTime() {
		return parkingTime;
	}
	public void setParkingTime(String parkingTime) {
		this.parkingTime = parkingTime;
	}
	@Override
	public String toString() {
		return " [customerName=" + customerName + ", phoneNo=" + phoneNo + ", parkingTime=" + parkingTime
				+ "]";
	}
	

}
