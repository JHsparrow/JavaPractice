
public class EX10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String strVar1 = "홍길동";
//		String strVar2 = "홍길동";
//		String strVar3 = new String("홍길동");
//		String strVar4 = new String("홍길동");
//		
//		if ( strVar3 == strVar4) {
//			System.out.println("strVar1와 strVar2는 참조가 같음");
//		}
//		else {
//			System.out.println("strVar1와 strVar2는 참조가 다름");
//		}
//		
//		if(strVar3.equals(strVar4)) {
//			System.out.println("strVar1와 strVar2는 참조가 같음");
//		}
		
//		String ssn = "9201011010110";
//		char sex = ssn.charAt(6);
//		
//		switch(sex) {
//		case '1':
//		case '3':
//			System.out.println("남자");
//			break;
//		
//		case '2':
//		case '4':
//		System.out.println("여자");
//		break;
//		}
		
//		String subject = "자바 프로그래밍";
//		
//		int Location = subject.indexOf("프로그래밍");
//		
//		String substing = subject.substring(Location);
//		System.out.println(Location);
//		
//		if (Location == -1) {
//			System.out.println("해당 문자열이 없습니다.");
//		}
//		boolean result = subject.contains("자봐");
//		
//		if(result) {
//			System.out.println("자바와 관련된 책입니다.");
//		}
//		else {
//			System.out.println("자바와 관련된 책이 아닙니다.");
//		}
		
		String board = "1,자바 학습,참조타입 String 공부중";
		String[] tokens = board.split(",");
		
		for (int i=0; i<tokens.length;i++) {
			System.out.println(tokens[i]);
		}
		
				
	}

}
