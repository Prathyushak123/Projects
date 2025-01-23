package MultiThreading2;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	
	public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}

	public String getName() {
		return name;
	}

	public VaccineEligibility getEligibility() {
		return eligibility;
	}

	public DoseBooking getDoseBooking() {
		return doseBooking;
	}
	
	public void isEligible() { 
		boolean b=eligibility.isEligible();
	    if(b==true) {
		System.out.println(name+" is Eligible for Vaccine. ");
		}else {
			System.out.println(name+" is not Eligible for Vaccine.");
		}
		
		
   }
	public void bookDose() {
	boolean n=eligibility.isHasHealthCondition();
	if(n==false) {
		System.out.println("Health condition is Good");
	}
		doseBooking.bookDose();
		
	}
	public void isDoseBooked() {
		doseBooking.isDoseBooked();
		
	}

}
