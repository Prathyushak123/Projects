package Collections2;

import java.util.ArrayList;
import java.util.Scanner;
public class addCabCustomer {
	
	private ArrayList<CabCustomer> ListOfcustomer=new ArrayList<>();
	//Scanner scn=new Scanner(System.in);
	
	public void addCabCustomer1(CabCustomer customer){
		ListOfcustomer.add(customer);
	}
	public boolean isFirstCustomer(CabCustomer customer) {
		//System.out.println("Enter phoneNumber");
		//String phone=scn.next();
		for(CabCustomer ExistingCustomer:ListOfcustomer){
		if( ExistingCustomer.getPhone().equals(customer.getPhone())){
			//System.out.println("Phone number is Already Existed");
			//scn.close();
		
		return false;
		}
	  }
		return true;
	}
	public double calculateBill(CabCustomer customer) {
		if(isFirstCustomer(customer)) {
			return 0;
		}else if(customer.getDistance()<=4) {
			System.out.println("Amount is 80 ");
			return 80;
		}else {
			return (80+6)*customer.getDistance();
		}
		
	
		
	}
	public String printBill(CabCustomer customer) {
		double d=calculateBill(customer);
		return customer.getCustomerName()+" Please pay your bill of "+d;
	}
}

