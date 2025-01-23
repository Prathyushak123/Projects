package ExceptionHandling3;

import java.util.Scanner;

public class ATM{
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		BankAccount account=new BankAccount(20000,987655);
		Customer c1=new Customer("frooty",account);
		
		boolean exit=false;
		
		while(!exit) {
            System.out.println("Select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Loan Application");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your option: ");
	       int option=scn.nextInt();
		
		
		try{
		   switch(option) {
	    case 1:System.out.println("Enter deposite amount:");
		       double amount=scn.nextDouble();
		       c1.getAccountNumber().deposite(amount);
		      
		       break;
		          
		case 2: System.out.println("Enter withdraw amount:");
		         double withdraw=scn.nextDouble();
		         c1.getAccountNumber().withdrawal(withdraw);
                
                 break;
		case 3:  System.out.println("Enter transferamount:");
		         double transfer=scn.nextDouble();
		         c1.getAccountNumber().withdrawal(transfer);
              
                 break;
		case 4:  System.out.println("Enter loan apply:"); 
		         double loan=scn.nextDouble();
		         c1.getAccountNumber().withdrawal(loan);
                 break;
		case 5:  account.checkBalance();
                 break;
        case 6:  exit=true;
		         System.out.println("Existing...");
		         scn.close();
		   } }catch(Exception e) {
			   System.out.println("An error occurred while initializing the ATM: " + e.getMessage());
	        
		   } 
	}

  }
}	
		
