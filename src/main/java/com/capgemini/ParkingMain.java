package com.capgemini;

public class ParkingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerDetails ob1=new CustomerDetails("Ashwini","987654","11:22");
		CustomerDetails ob=new CustomerDetails("Ash","987","09:22");
		Compartment ob3=new Compartment();
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		ob3.calculatePositionAndAdd(ob1);
		
				
		System.out.println("After removing a vehicle:");
		ob3.calculatePositionAndDelete("F1S2C3");
		ob3.calculatePositionAndDelete("F1S1C3");
		ob3.retrieveParkingDetails();
				
		System.out.println("\n\n On addtion of one vehicle:");
		ob3.calculatePositionAndAdd(ob);
		ob3.retrieveParkingDetails();
		
		System.out.println("\n\n On addtion of one more vehicle:");
		ob3.calculatePositionAndAdd(ob);
		ob3.retrieveParkingDetails();
		
		
		System.out.println("\n\nAfter retrieving by key:");
		for(Parking park:ob3.getKeys())
		{
			System.out.println(park.getTicket()+" = "+ob3.retrieveParkingByKey(park));
			
		}
		
		
		
		
	}

}
