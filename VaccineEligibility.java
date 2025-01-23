package MultiThreading2;

public class VaccineEligibility {
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	
	public int getAge() {
		return age;
	}


	public boolean isHasHealthCondition() {
		return hasHealthCondition;
	}


	public boolean isEligible() {
		if(age<=18||age>60) {
			System.out.println("Is Not Eligible for Vaccine");
		}
		else if (hasHealthCondition==false) {
			System.out.println("Is Not Eligible for Vaccine");
			
        }else {
        	System.out.println("Eligible for Vaccine");
        }
		return hasHealthCondition;
       }  
	
	}