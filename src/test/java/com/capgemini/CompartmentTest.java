package com.capgemini;

import org.junit.Test;

import junit.framework.TestCase;

public class CompartmentTest extends TestCase {
	
	Compartment compartment=new Compartment();
	
	@Test
	public void addParkingTest()
	{
		CustomerDetails cd=compartment.addParking(new Parking(1,2,3),new CustomerDetails("ash","123","16:12"));
		assertEquals("ash",cd.getCustomerName());
		
	}
	
	@Test(expected=RuntimeException.class)
	public void calculatePositionAndDeleteTest()
	{
		compartment.calculatePositionAndDelete("F1S1C3");
		
	}

}
