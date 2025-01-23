package ExceptionHandling3;

public class Customer {
	private String Name;
	private BankAccount account;
	
	

	public Customer(String name, BankAccount account) {
		super();
		this.Name = name;
		this.account = account;
	}



	public String getName() {
		return Name;
	}



	public BankAccount getAccountNumber() {
		return account;
	}



	


	@Override
	public String toString() {
		return "Customer [Name=" + Name + ", AccountNumber=" + account + "]";
	}


	
	}

     
	


