package com.capgemini;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Compartment {
	
	HashMap<Parking,CustomerDetails> compartment=new HashMap<Parking,CustomerDetails>();
	static int section=1;
	static int compart=0;
	static int floor=1;
	
	public CustomerDetails addParking(Parking park,CustomerDetails customer)
	{
		return compartment.put(park,customer);
	}	
		
	public CustomerDetails retrieveParkingByKey(Parking key)
	{
		return compartment.get(key);
	}
	
	public Set<Parking> getKeys()
	{
		return compartment.keySet();
	}
	
	
	public void retrieveParkingDetails()
	{
		HashMap<Parking, CustomerDetails>comp=sortByKey();
		Iterator<HashMap.Entry<Parking, CustomerDetails>> itr = comp.entrySet().iterator();
		while(itr.hasNext()) 
        { 
			sortByKey();
             Map.Entry<Parking, CustomerDetails> entry = itr.next(); 
             System.out.println(entry.getKey() +" = " + entry.getValue()); 
         } 
	}
	
		
	public HashMap<Parking, CustomerDetails> sortByKey()
	{
		List<HashMap.Entry<Parking,CustomerDetails> > list = new LinkedList<HashMap.Entry<Parking,CustomerDetails> >(compartment.entrySet()); 
	     Collections.sort(list, new Comparator<Map.Entry<Parking,CustomerDetails> >() { 
	            public int compare(Map.Entry<Parking,CustomerDetails> o1,Map.Entry<Parking,CustomerDetails> o2) 
	            { 
	                return (o1.getKey().getTicket()).compareTo(o2.getKey().getTicket()); 
	            } 
	        }); 
	        HashMap<Parking,CustomerDetails> temp = new LinkedHashMap<Parking,CustomerDetails>(); 
	        for (Map.Entry<Parking,CustomerDetails> index : list) { 
	            temp.put(index.getKey(), index.getValue()); 
	        } 
	        
	        return temp; 
	}
	
	
	public void calculatePositionAndAdd(CustomerDetails cust)
	{
		int flag=0;	
		//If any vacant space is present in between of existing parking lot
		Iterator<HashMap.Entry<Parking, CustomerDetails>> itr = compartment.entrySet().iterator();
		 while(itr.hasNext()) 
	     { 
			 HashMap.Entry<Parking, CustomerDetails> entry = itr.next(); 
			 CustomerDetails customer=entry.getValue();
			 if(customer==(null))
			 {
				 Parking park=entry.getKey();
				 addParking(park,cust);
				 flag=1;
				 break;
			 }
	     }	
		 
		//if no space was vacant in between 
		 
		if(flag==0) {
		compart++;
		if(compart>9)
		{
			compart=1;
			section++;
			if(section>4)
				{
					compart=1;
					section=1;
					floor++;
				}
		}
		
		Parking park=new Parking(floor,section,compart);
		addParking(park,cust);
		}
	}
	
	
	
	public void calculatePositionAndDelete(String ticket)
	{
		Iterator<HashMap.Entry<Parking, CustomerDetails>> itr = compartment.entrySet().iterator();
		int flag=0;
		 while(itr.hasNext()) 
	     { 
	             HashMap.Entry<Parking, CustomerDetails> entry = itr.next(); 
	             Parking park=entry.getKey();
	             if(park.getTicket().equals(ticket))
	 			{
	 				compartment.remove(park);
	 				addParking(park,null);   //Setting null value on position where car is removed
	 				flag=1;
	 				break;
	 			}	                    	 
	     }
		if(flag==0)
			throw new RuntimeException("Vehicle not present!!");
	}
	
	

}
