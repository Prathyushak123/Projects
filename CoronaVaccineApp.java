package MultiThreading2;

public class CoronaVaccineApp {

	public static void main(String[] args) {
		 VaccineEligibility ve=new  VaccineEligibility(23,true);
		 DoseBooking db=new DoseBooking(false);
		 User us=new User("prathyu",ve,db);
		
		Thread thread1=new Thread(){
			   public void run() {
				   
				 us.isEligible();
				 us.isDoseBooked();
				 us.bookDose();
			   }
			
		};
		thread1.start();
		VaccineEligibility ve1=new  VaccineEligibility(24,false);
		DoseBooking db1=new DoseBooking(false);
		User us1=new User("vincent",ve1,db1);

		Thread thread2=new Thread(){
			public void run() {
				
				us1.isEligible();
				us1.isDoseBooked();
				us1.bookDose();
			}
			
		};
		thread2.start();
	}
	

}


