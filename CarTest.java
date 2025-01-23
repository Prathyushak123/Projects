package ExceptionHandling3;

public class CarTest {
	
	public static void stop(String s) {
	try {
			if(s.equalsIgnoreCase("stop")) {
			System.out.println("Car is Stopped");
			throw new CarStoppedException(s);
			
		}else {
			System.out.println("Car is Running");
		}
	
	}
		catch(CarStoppedException e) {
			System.out.println("Car has Stopped:");
		}
			
		}

	public static void puncture(String s) {
	try { 
			if(s.equalsIgnoreCase("punture")) {
			System.out.println("Car is Punctured");
			throw new CarPunctureException(s);
			
		}else {
			System.out.println("Car is Running");
		}
	
	}
		catch(CarPunctureException e) {
			System.out.println("Car has Stopped due to puncture check");
	 }
			
   }
	
	public static void heat(String s) {
		try {
			if(s.equalsIgnoreCase("heat")) {
			System.out.println("Car is heated more then 50 degrees ");
			throw new CarHeatException(s);
			
		}else {
			System.out.println("Car is Running");
		}
	
	}
		catch(CarHeatException e) {
			System.out.println("Car Heated due to high temperature of 50 degrees");
		}
			
		}
	
}
