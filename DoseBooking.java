package MultiThreading2;

public class DoseBooking {
	
	private boolean booked;

	public DoseBooking(boolean booked) {
		super();
		this.booked = booked;
	}
	
	
	public boolean isBooked() {
		return booked;
	}


	public void bookDose() {
		try {
			
			if(booked==true) {
				this.booked=true;
				//System.out.println("Is Booked");
			}
		}catch(Exception e) {
			System.out.println("Dose already Booked");
			
		}
	}
	
	public void isDoseBooked()  {
		if(booked==true) {
		 bookDose();
		}else {
			bookDose();
		}
		
	}

}
