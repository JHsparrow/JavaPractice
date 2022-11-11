package Test001;

public class Car {

		String Company = "현대자동차";
		String Model = "소나타1";
		String Color = "검정";
		int maxSpeed = 350;		
		int speed = 10 ;
	
		
		
		Car(String model){
			this(model, "은색", 250);
		}
		
		Car(String model, String color){
//			this.Model = model;
//			this.Color = color;
			this(model, color, 250);
		}
		Car(String model, String color, int maxSpeed){
			this.Model = model;
			this.Color = color;
			this.maxSpeed = maxSpeed;
		}
//	

	

}
