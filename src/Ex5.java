
public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 10;
		
		boolean result1 = (num1 == num2);
		
		System.out.println("result : " +result1);
		
		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4 : " + result4);
		
		int num3 = 1;
		double num4 = 1.0;
		boolean result5 = (num3 == num4);
		System.out.println("result5 = "+result5);
		
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result6 = (num5 == num6);
		boolean result7 = (num5 == (float)num6);
		
		System.out.println(result6);
		System.out.println(result7);
		
		String str1 = "자바";
		String str2 = "java";
		
		boolean result8 = (str1.equals(str2));
		System.out.println(result8);
	}

}
