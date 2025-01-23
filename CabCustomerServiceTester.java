package Collections2;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
				//CabCustomerServiceTester customers=new CabCustomerServiceTester();
		addCabCustomer ccs=new addCabCustomer();

		CabCustomer customer1=new CabCustomer(1,"prathyu","hyd","fpm",0,"89765486789");
		CabCustomer customer2=new CabCustomer(2,"vince","hyd","fpm",10,"89765486789");
		
		ccs.isFirstCustomer(customer1);
		ccs.isFirstCustomer(customer2);
		
		
		System.out.println(customer1);
		System.out.println(customer2);
		
		//addCabCustomer ccs1=new addCabCustomer(customer2);
		ccs.addCabCustomer1(customer1);
		ccs.addCabCustomer1(customer2);
		
		//ccs.calculateBill(customer1);
		//ccs.calculateBill(customer2);
		
		
		System.out.println(ccs.printBill(customer1));
        System.out.println(ccs.printBill(customer2));
	}

}
