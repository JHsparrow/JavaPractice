
public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int apple = 1;
//		double piceUnit = 0.1;
//		int number = 7;
//		
//		double result = apple - number * piceUnit;
//		System.out.println("사과 1개에서 남은 양 : "+result);
//		
//		int apple = 1;
//		int totalpice = apple * 10;
//		int number = 7;
//		
//		int result = totalpice - number;
//		System.out.println("사과 1개에서 남은 양 : "+result/1.0);
		int x = 5;
		double y = 0;
//		double z = x / y;
		double z = x % y;
		System.out.println(z);
		
		if (Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("무한대입니다.");
		}
		else {
			System.out.println("z : "+ z);
		}
	
	}

}
