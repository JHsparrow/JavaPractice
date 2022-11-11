import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x;
//		if(x > 10 && x<20) {
//			
//		}
		
//		2번
//		int result = 0;
//		for(int i = 1; i<=100; i++) {
//			if(i%3==0) {
//				result = i+result;
//			}
//		}
//		System.out.println(result);		
		
//		3번
//		int result = 0;
//		for(int i = 1; i<=20; i++) {
//			if(!(i%3==0 || i%2==0)) {
//				System.out.println(i);
//				result = i+result;
//			}
//		}
//		System.out.println(result);	
		
//		4번
//		while(true) {
//			int Number1 = (int) (Math.random()*6+1);
//			int Number2 = (int) (Math.random()*6+1);
//			
//			if(Number1+Number2 == 5) {
//				System.out.println("("+Number1+","+Number2+")");
//				break;
//				
//			}
//		}
		
//		5번
//		for(int x=1; x<=10; x++ ) {
//			for(int y=1; y<10; y++) {
//				if((x*4)+(y*5) == 60) {
//					System.out.println("x = "+x + " // y = "+y);
//				}
//			}
//		}
		
//		6번 못품
//		int result1 = 1;
//		int result2 = 0;
//		int result3 = 0;
//		for(int i=1, j=1; i <=100; i++,j++ ) {			
//			System.out.println(i);
//			
//		}
		
		
		
		
//		7번
//		for(int i = 1; i<=6; i++) {
//			for(int j = 1; j<=6; j++ ) {
//				if(i+j == 6) {
//					System.out.println("i = "+i+" // j= "+j);
//				}
//			}
//		}
		
//		8번
//		System.out.println("숫자를 입력해주세요.");
//		Scanner SNumber = new Scanner(System.in);
//		int number = 0;
//		int sum = 0;
//		number = SNumber.nextInt();
//        
//        while(number!=0){
//            sum += number%10;
//            number = number / 10;
//        }
//        System.out.println(sum);
		
//		9번
//		int count = 10;
//		int N1 = 1;
//		int N2 = 1;
//		int Result = 0;
//		for (int i = 1; i <= (count-2); i++) {
//			Result = N1 + N2;
//			N1 = N2;
//			N2 = Result;
//			System.out.println(Result);
//		}
		
		
//		10번
//		String result = "*";
//		for(int i=1; i<=5; i++) {
//			System.out.println(result);
//			result = result + "*";
//		}
		
//		11번
//		int answer = (int) (Math.random()*100+1);
//		int input = 0;
//		int count = 0;
//		
//		java.util.Scanner s = new java.util.Scanner(System.in);
//		
//		do {
//			count++;
//			System.out.print("1과 100사이의 값을 입력하세요 : ");
//			input = s.nextInt();
//			if(input == answer) {
//				System.out.println("정답입니다.");
//				break;
//			}
//			else {
//				System.out.println("정답이 아닙니다.");
//				if(input > answer) {
//					System.out.println(input+"보다 작습니다.");
//				}
//				else {
//					System.out.println(input+"보다 큽니다.");
//				}
//			}
//		}
//		while(true);
		
//		12번
		
//		Scanner scanner = new Scanner(System.in);
//		boolean run = true;
//		int money = 0;
//		int input = 0;
//		
//		while(run) {
//			System.out.println("=========");
//			System.out.println("1.예금, 2.출금, 3.잔고, 4.종료");
//			System.out.println("=========");
//			System.out.println("선택 : ");
//			
//			String strNum = scanner.nextLine();
//			
//			
//			if(strNum.equals("1")) {
//				System.out.println("예금액");
//				input = scanner.nextInt();
//				money= money + input;		
//			}
//			else if(strNum.equals("2")) {
//				System.out.println("출금액");
//				input = scanner.nextInt();
//				money= money - input;
//			}
//			else if(strNum.equals("3")) {
//				System.out.println("현재금액 : "+ money);				
//			}
//			else if(strNum.equals("4")) {
//				run = false;
//				System.out.println("프로그램 종료");
//			}
//		}
		
        
	}

}
