
public class Overflow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;
		
		for(int i=0; i<5; i++) {
			var1++;
			if(var1 < 0 ) {
				break;
			}
			
			System.out.println("var1 : " + var1);
		}
	}

}
