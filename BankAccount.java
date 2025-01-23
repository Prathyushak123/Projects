package ExceptionHandling3;


public class BankAccount implements Bank{
	private double balance;
	private long AccountNumber;
	
	public BankAccount(double balance,long AccountNumber) {
		super();
		this.balance = balance;
		this.AccountNumber=AccountNumber;
	}

	public long getAccountNumber() {
		return AccountNumber;
	}

    public void setAccountNumber(long accountNumber) {
		AccountNumber = accountNumber;
	}

    @Override
	public void deposite(double amount) {
		try {
			
		if(amount<=0) {
			System.out.println("Attempt to deposit "+amount);
			throw new InvalidAmountException();
		}
		else {
			balance=balance+amount;
			System.out.println("Deposit "+amount+" into account.");
			System.out.println("Balance should incresed by "+balance);
		}
		}catch(InvalidAmountException e) {
			System.out.println("Account balance must not be zero or lessthan zero");
		}
	
	}

	@Override
	public void withdrawal(double amount) {
		try {
		if(balance<amount) {
			System.out.println("Withdraw "+amount+" from ammountbalance of "+balance);
			throw new InvalidAmountException();
		}else {
			balance=balance-amount;	
			System.out.println("Balance is "+balance);
		}
		}catch(InvalidAmountException e) {
			System.out.println("Attempt to withdraw "+amount+" from account balance of"+balance);
			System.out.println("Attempt to withdraw "+amount);
		}
	
				
	}

	@Override
	public void transfer(double amount) {
		try {
		if(balance<=0||balance<amount) {
			System.out.println("Attempt to transfer "+amount+" from account with balance "+balance);
			throw new InvalidAmountException();
		}else {
			balance=balance-amount;
			System.out.println("Senders balance should decrease by "+amount);
			System.out.println("your balance is decreased to "+balance);
		}
		}catch(InvalidAmountException e) {
			System.out.println("Attempt to transfer "+amount);
			System.out.println("amount must be graterthan the account balance");
			e.printStackTrace();
		}
		
	}

	@Override
	public void loanAppliction(double amount) {
		try {
		if(balance<=50000||balance<=0) {
			throw new InvalidAmountException();
		}else {
			System.out.println("Loan should be approved,balance should increase by "+amount);
			System.out.println("User is applied for Loan");
		}
		}catch(InvalidAmountException e){
			System.out.println("Not eligible for Loan taking");
			System.out.println("Apply for a loan of"+amount+",with account balance greaterthan 50000");
		}
		
	}

	@Override
	public void checkBalance(){
        System.out.println("Total balance is "+balance);

		
	}

}
